package pl.konrad.swierszcz.day11;

import java.util.*;

class Solution {
    private static final int PRECALCULATIONS = 22;
    private Solution() {
    }

    public static long getNumberOfStonesAfterBlinks(String input, int numberOfBlinks) {
        var stones = Arrays.stream(input.split(" ")).map(Long::parseLong).toList();
        var knownTransformations = new HashMap<Long, Blink>();
        var precalculations = new HashMap<Long, Precalculation>();
        long result = 0L;

        for (int i = 0; i < stones.size(); i++) {
            findStoneTransformations(knownTransformations, stones.get(i));
        }

        knownTransformations.keySet()
                .forEach(t -> precalculateTenBlinksForStone(precalculations, knownTransformations, t));

        for (int j = 0; j < stones.size(); j++) {
            System.out.println("################################################################################");
            System.out.println("################################################################################");
            System.out.println("################################################################################");
            System.out.println("################################################################################");
            System.out.println("################################################################################");
            result += getNumberOfChildren(stones.get(j), numberOfBlinks, 0, knownTransformations, precalculations);
        }

        return result;
    }

    private static long getNumberOfChildren(long stoneId, int totalBlinks, int actualBlink, HashMap<Long, Blink> knownTransformations, HashMap<Long, Precalculation> precalcultions) {
        if (totalBlinks - actualBlink - 1 <= PRECALCULATIONS) {
            long result = getPrecalculationForStone(precalcultions, knownTransformations, stoneId).children()
                    .get(totalBlinks - actualBlink - 1).size();
            System.out.println(actualBlink + ": " + result);
            return result;
        }

        return getPrecalculationForStone(precalcultions, knownTransformations, stoneId).children().get(PRECALCULATIONS - 1)
                .stream()
                .mapToLong(id -> getNumberOfChildren(id, totalBlinks, actualBlink + PRECALCULATIONS, knownTransformations, precalcultions))
                .sum();
    }

    private static List<Long> getTransformationsForStone(long stoneId, HashMap<Long, Blink> knownTransformations) {
        if (knownTransformations.containsKey(stoneId)) {
            return knownTransformations.get(stoneId).transformations();
        }

        findStoneTransformations(knownTransformations, stoneId);
        return knownTransformations.get(stoneId).transformations();
    }

    private static HashMap<Long, Blink> findStoneTransformations(HashMap<Long, Blink> checkedCases, long stoneId) {
        if (checkedCases.containsKey(stoneId)) {
            return checkedCases;
        }

        if (stoneId == 0L) {
            checkedCases.put(0L, new Blink(0L, List.of(1L)));
            return findStoneTransformations(checkedCases, 1L);
        }

        int stoneLength = stoneLength(stoneId);

        if (stoneLength % 2 == 0) {
            int divider = getDivider(stoneLength / 2);
            checkedCases.put(stoneId, new Blink(stoneId, List.of(stoneId / divider, stoneId % divider)));
            findStoneTransformations(checkedCases, stoneId / divider);
            return findStoneTransformations(checkedCases, stoneId % divider);
        }

        checkedCases.put(stoneId, new Blink(stoneId, List.of(stoneId * 2024)));
        return findStoneTransformations(checkedCases, stoneId * 2024L);
    }

    private static Precalculation getPrecalculationForStone(HashMap<Long, Precalculation> existingPrecalculations, HashMap<Long, Blink> existingTransformatinos, Long stoneId) {
        return precalculateTenBlinksForStone(existingPrecalculations, existingTransformatinos, stoneId);
    }

    private static Precalculation precalculateTenBlinksForStone(HashMap<Long, Precalculation> existingPrecalculations, HashMap<Long, Blink> transformations, Long stoneId) {
        if (existingPrecalculations.containsKey(stoneId)) {
            return existingPrecalculations.get(stoneId);
        }

        var childrenMap = new HashMap<Integer, List<Long>>();
        childrenMap.put(0, getTransformationsForStone(stoneId, transformations));

        for (int i = 1; i < PRECALCULATIONS; i++) {
            var updatedChildren = childrenMap.get(i - 1).stream()
                    .flatMap(child -> getTransformationsForStone(child, transformations).stream())
                    .toList();

            childrenMap.put(i, updatedChildren);
        }

        var createdPrecalculation = new Precalculation(stoneId, childrenMap);
        existingPrecalculations.put(stoneId, createdPrecalculation);
        return createdPrecalculation;
    }

    private static int stoneLength(long numberToTest) {
        int numberOfDigits = 1;
        long comparator = 1;

        while (numberToTest >= 10L * comparator) {
            numberOfDigits++;
            comparator = comparator * 10;
        }

        return numberOfDigits;
    }

    private static int getDivider(int power) {
        int divider = 1;

        for (int i = 0; i < power; i++) {
            divider = divider * 10;
        }

        return divider;
    }


}
