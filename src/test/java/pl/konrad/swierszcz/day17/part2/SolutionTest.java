package pl.konrad.swierszcz.day17.part2;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample3() {
        //given
        //when//then
        assertThat(Solution.getMinimumAReturningItself(InputReader.readInput("day17/ex7.txt")))
                .isEqualTo(117440);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCInput() {
        //given
        //when//then
        assertThat(Solution.getMinimumAReturningItself(InputReader.readInput("day17/input.txt")))
                .isEqualTo(1212);
    }
}
