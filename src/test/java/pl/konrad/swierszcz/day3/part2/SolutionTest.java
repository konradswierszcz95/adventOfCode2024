package pl.konrad.swierszcz.day3.part2;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample() {
        //given
        //when//then
        assertThat(Solution.getSumOfMultiplications(List.of("xmul(2,4)&mul[3,7]!^don't()_mul(5,5)+mul(32,64](mul(11,8)undo()?mul(8,5))")))
                .isEqualTo(48L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCPuzzleInput() {
        //given
        //when//then
        assertThat(Solution.getSumOfMultiplications(InputReader.readInput("day3/input.txt")))
                .isEqualTo(78683433L);
    }
}
