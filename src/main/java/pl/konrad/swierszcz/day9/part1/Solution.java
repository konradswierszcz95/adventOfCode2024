package pl.konrad.swierszcz.day9.part1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution {

    public static long getFilesSum(String input) {
        System.out.println(buildMapOfPositions(input).size());
        System.out.println(buildMapOfPositions(input));
//        int maxFileId = input.length() / 2;
//
//        long sum = 0L;
//        var filesLength = new ArrayList<Integer>();
//        var gapsLength = new ArrayList<Integer>();
//
//        for (int i = 0; i < input.length(); i++) {
//            if (i % 2 == 0) {
//                filesLength.add(input.charAt(i) - 48);
//            } else {
//                gapsLength.add(i);
//            }
//        }
//
//        var positionValues = new LinkedList<Integer>();
//        int gapId = 0;
//        int fileId = 0;
//        int gapRest = gapsLength.get(0);
//        int fileSizeRest = filesLength.get(0);
//        int position = 0;
//        int maxPosition = filesLength.stream().mapToInt(i -> i).sum() - 1;
//        var leftFileRest = new HashMap<Integer, Integer>();
//        boolean countingGap = false;
//
//        while (position < maxPosition) {
//            if (gapRest <= 0 && countingGap) {
//                gapId++;
//                gapRest = gapsLength.get(gapId);
//                leftFileRest.put(fileId, fileSizeRest);
//                fileId++;
//                fileSizeRest = filesLength.get(fileId);
//                countingGap = false;
//            }
//
//            if (fileSizeRest <= 0) {
//                if (!countingGap) {
//                    countingGap = true;
//                }
//
//                fileId++;
//                fileSizeRest = filesLength.get(fileId);
//            }
//
//            positionValues.add(position * fileId);
//            fileSizeRest--;
//
//            if (countingGap) {
//                gapRest--;
//            }
//
//            position++;
//        }
//
//        return positionValues.stream()
//                .mapToLong(Integer::longValue)
//                .sum();
        return 0L;
    }

    private static Map<Integer, Integer> buildMapOfPositions(String input) {
        int id = 0;
        int inputCharacterPosition = 0;
        var result = new HashMap<Integer, Integer>();

        while (inputCharacterPosition < input.length()) {
            int entriesNumber = input.charAt(inputCharacterPosition) - 48;

            for (int i = 0; i < entriesNumber; i++) {
                result.put(id, inputCharacterPosition % 2 == 0 ? entriesNumber : -1);
                id++;
            }

            inputCharacterPosition++;
        }

        return result;
    }
}
