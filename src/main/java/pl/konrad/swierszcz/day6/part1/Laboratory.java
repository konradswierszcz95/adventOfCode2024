package pl.konrad.swierszcz.day6.part1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Laboratory {
    private Field[][] map;
    private Guard guard;
    private final Set<Field> obstacles;
    private final int rowSize;
    private final int columnSize;

    public Laboratory(List<String> input) {
        obstacles = new HashSet<>();
        columnSize = input.size();
        rowSize = input.getFirst().length();
        map = new Field[columnSize][rowSize];

        for (int y = 0; y < columnSize; y++) {
            var row = input.get(y).toCharArray();

            for (int x = 0; x < rowSize; x++) {
                switch (row[x]) {
                    case '.' -> map[y][x] = new Field(x, y, Field.Type.EMPTY);
                    case '#' -> {
                        Field field = new Field(x, y, Field.Type.OBSTACLE);
                        map[y][x] = field;
                        obstacles.add(field);
                    }
                    case '^' -> {
                        map[y][x] = new Field(x, y, Field.Type.OCCUPIED);
                        guard = new Guard(x, y, Guard.FacingDirection.NORTH);
                    }
                }
            }
        }

        if (guard == null) {
            throw new RuntimeException("Guard not found");
        }
    }

    public Field[][] getMap() {
        return map;
    }

    public void setField(int x, int y, Field.Type type) {
        map[y][x] = new Field(x, y, type);
    }

    public Set<Field> getObstacles() {
        return obstacles;
    }

    public Guard getGuard() {
        return guard;
    }

    public Guard turnGuardRight() {
        guard.turnRight();
        return guard;
    }

    public int getRowSize() {
        return rowSize;
    }

    public int getColumnSize() {
        return columnSize;
    }

    public long getNumberOfOccupiedFields() {
        return Arrays.stream(map)
                .flatMap(Arrays::stream)
                .filter(field -> field.type().equals(Field.Type.OCCUPIED))
                .count();
    }

    public void printMap() {
        System.out.println("\n\n\n");
        System.out.println(
                Arrays.stream(map)
                        .map(row -> Arrays.stream(row)
                                .map(f -> switch (f.type()) {
                                    case EMPTY -> ".";
                                    case OBSTACLE -> "#";
                                    case OCCUPIED -> "X";
                                })
                                .collect(Collectors.joining(""))
                        )
                        .collect(Collectors.joining("\n"))
    );
    }
}
