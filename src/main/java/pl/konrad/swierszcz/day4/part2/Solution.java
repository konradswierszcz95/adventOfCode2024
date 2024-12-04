package pl.konrad.swierszcz.day4.part2;

import java.util.List;

class Solution {

    private Solution() {}

    public static long getNumberOfXmasOccurrences(List<String> inputs) {
        return new XmasXTable(inputs).getNumberOfOccurrencesInEveryDirection();
    }
}
