package pl.konrad.swierszcz.day9.part1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private Solution() {}

    public static long getFilesCheckSum(String input) {
        var positionsMap = buildMapOfPositions(input);
        return getMapWithoutGaps(positionsMap).entrySet()
                .stream().mapToLong(e -> (long) e.getKey() * e.getValue())
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

    private static Map<Integer, Integer> getMapWithoutGaps(Map<Integer, Integer> inputMap) {
        int lastPosition = inputMap.size() - 1;
        int actualPosition = 0;
        int resultPosition = 0;
        var resultMap = new HashMap<Integer, Integer>();

        while (actualPosition <= lastPosition) {
            if (inputMap.get(actualPosition) != -1) {
                resultMap.put(resultPosition, inputMap.get(actualPosition));
                resultPosition++;
                actualPosition++;
            } else if (inputMap.get(lastPosition) != -1) {
                resultMap.put(resultPosition, inputMap.get(lastPosition));
                lastPosition--;
                actualPosition++;
                resultPosition++;
            } else {
                lastPosition--;
            }
        }

        return resultMap;
    }
}
