package pl.konrad.swierszcz.day17;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public static String getProgramOutput(List<String> input) {
        int aRegistry = Integer.parseInt(input.getFirst().split(":")[1].trim());
        int bRegistry = Integer.parseInt(input.get(1).split(":")[1].trim());
        int cRegistry = Integer.parseInt(input.get(2).split(":")[1].trim());

        var instructions = Arrays.stream(input.get(4).split(":")[1].trim().split(","))
                .map(Integer::parseInt)
                .toList();

        var program = new Program(aRegistry, bRegistry, cRegistry, instructions);

        return "A";
    }
}
