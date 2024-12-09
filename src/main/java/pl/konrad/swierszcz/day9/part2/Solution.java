package pl.konrad.swierszcz.day9.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    private Solution() {}

    public static long getFilesCheckSum(String input) {
        var positionsMap = buildMapOfPositions(input);
        getDefragmentedMapWithoutGaps(positionsMap);
        return getDefragmentedMapWithoutGaps(positionsMap).entrySet()
                .stream().mapToLong(e -> (long) e.getKey() * e.getValue())
                .filter(l -> l > 0)
                .sum();
    }

    private static Map<Integer, Integer> buildMapOfPositions(String input) {
        int id = 0;
        int inputCharacterPosition = 0;
        int fileId = 0;
        var result = new HashMap<Integer, Integer>();

        while (inputCharacterPosition < input.length()) {
            int entriesNumber = input.charAt(inputCharacterPosition) - 48;

            for (int i = 0; i < entriesNumber; i++) {
                result.put(id, inputCharacterPosition % 2 == 0 ? fileId : -1);
                id++;
            }

            if (inputCharacterPosition % 2 == 0) {
                fileId++;
            }
            inputCharacterPosition++;
        }

        return result;
    }

    private static Map<Integer, Integer> getDefragmentedMapWithoutGaps(Map<Integer, Integer> inputMap) {
        var result = new HashMap<>(inputMap);
        var files = inputMap.entrySet().stream()
                .filter(e -> e.getValue() != -1)
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));

        var gaps = calculateGaps(inputMap);
        var filesStartingPositions = getFilesStartingPositions(inputMap);

        int fileId = files.size() - 1;

        for (int i = fileId; i >= 0; i--) {
            int fileSize = files.get(i).size();
            int newFilePosition = newFileStartingPosition(gaps, filesStartingPositions.get(i), fileSize);
            int newGapStart = filesStartingPositions.get(i);

            if (newFilePosition != -1) {
                for (int a = 0; a < fileSize; a++) {
                    result.put(newFilePosition + a, i);
                    result.put(newGapStart + a, -1);
                }
                gaps = calculateGaps(result);
            }
        }

        return result;
    }

    private static Map<Integer, Integer> calculateGaps(Map<Integer, Integer> inputMap) {
        var mapSize = inputMap.size();
        int position = 0;
        int gapStart = -1;
        int gapSize = 0;

        var gaps = new HashMap<Integer, Integer>();

        while (position < mapSize) {
            if (inputMap.get(position) == -1) {
                gapStart = gapStart < 0 ? position : gapStart;
                gapSize++;
            } else if (gapStart > 0) {
                gaps.put(gapStart, gapSize);
                gapStart = -1;
                gapSize = 0;
            }

            position++;
        }

        return gaps;
    }

    private static Map<Integer, Integer> getFilesStartingPositions(Map<Integer, Integer> inputMap) {
        var mapSize = inputMap.size();
        int position = 0;
        int fileStart = -1;
        int fileId = 0;
        int fileSize = 0;

        var files = new HashMap<Integer, Integer>();

        while (position < mapSize) {
            if (inputMap.get(position) == -1 || inputMap.get(position) != fileId) {
                fileStart = -1;
                fileSize = 0;
            }

            if (inputMap.get(position) != -1 && inputMap.get(position) == fileId) {
                fileStart = fileStart >= 0 ? fileStart : position;
                files.put(fileId, fileStart);
                fileSize++;
            }

            if (inputMap.get(position) != -1 && inputMap.get(position) != fileId){
                fileStart = fileSize != 0 ? fileStart : position;
                fileId++;
                files.put(fileId, position);
                fileSize++;
            }

            position++;
        }

        files.put(fileId, fileStart);

        return files;
    }

    private static int newFileStartingPosition(Map<Integer, Integer> gaps, Integer fileStart, Integer fileSize) {
        return gaps.entrySet().stream()
                .filter(gap -> gap.getKey() < fileStart)
                .filter(e -> e.getValue() >= fileSize)
                .mapToInt(Map.Entry::getKey)
                .min().orElse(-1);
    }
}
