package pl.konrad.swierszcz.day17.part2;

import pl.konrad.swierszcz.day17.Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static int getMinimumAReturningItself(List<String> input) {
        var instructions = Arrays.stream(input.get(4).split(":")[1].trim().split(","))
                .map(Integer::parseInt)
                .toList();

        int aRegistry = 6595593;
        List result = Collections.<Integer>emptyList();
        var program = new Program(aRegistry, 0, 0, instructions);

        while (!result.equals(instructions)) {
            System.out.println(aRegistry);
            result = program.executeProgram();
            aRegistry++;
            program.reset(aRegistry);
        }

        return aRegistry - 1;
    }
}
