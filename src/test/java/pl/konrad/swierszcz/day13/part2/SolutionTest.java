package pl.konrad.swierszcz.day13.part2;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample1() {
        //given
        //when//then
        assertThat(Solution.getMinimumTokens(InputReader.readInput("day13/ex1.txt")))
                .isZero();
    }

    @Test
    void shouldReturnCorrectAnswerForAoCExample2() {
        //given
        //when//then
        assertThat(Solution.getMinimumTokens(InputReader.readInput("day13/ex2.txt")))
                .isEqualTo(875318608908L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCInput() {
        //given
        //when//then
        assertThat(Solution.getMinimumTokens(InputReader.readInput("day13/input.txt")))
                .isEqualTo(94955433618919L);
    }
}
