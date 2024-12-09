package pl.konrad.swierszcz.day9.part1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Solution {

    public static long getFilesSum(String input) {
        int maxFileId = input.length() / 2;

        long sum = 0L;
        var filesLength = new ArrayList<Integer>();
        var gapsLength = new ArrayList<Integer>();

        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                filesLength.add(input.charAt(i) - 48);
            } else {
                gapsLength.add(i);
            }
        }

        var positionValues = new LinkedList<Integer>();
        int gapId = 0;
        int fileId = 0;
        int gapRest = gapsLength.get(0);
        int fileSizeRest = filesLength.get(0);
        int position = 0;
        int maxPosition = filesLength.stream().mapToInt(i -> i).sum() - 1;
        var leftFileRest = new HashMap<Integer, Integer>();
        boolean countingGap = false;

        while (position < maxPosition) {
            if (gapRest <= 0 && countingGap) {
                gapId++;
                gapRest = gapsLength.get(gapId);
                leftFileRest.put(fileId, fileSizeRest);
                fileId++;
                fileSizeRest = filesLength.get(fileId);
                countingGap = false;
            }

            if (fileSizeRest <= 0) {
                if (!countingGap) {
                    countingGap = true;
                }

                fileId++;
                fileSizeRest = filesLength.get(fileId);
            }

            positionValues.add(position * fileId);
            fileSizeRest--;

            if (countingGap) {
                gapRest--;
            }

            position++;
        }

        return positionValues.stream()
                .mapToLong(Integer::longValue)
                .sum();
    }
}
