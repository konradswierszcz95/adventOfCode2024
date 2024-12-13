package pl.konrad.swierszcz.day13.part1;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample1() {
        //given
        //when//then
        assertThat(Solution.getMinimumTokens(InputReader.readInput("day13/ex1.txt")))
                .isEqualTo(280L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCExample2() {
        //given
        //when//then
        assertThat(Solution.getMinimumTokens(InputReader.readInput("day13/ex2.txt")))
                .isEqualTo(480L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCInput() {
        //given
        //when//then
        assertThat(Solution.getMinimumTokens(InputReader.readInput("day13/input.txt")))
                .isEqualTo(29711L);
    }
}
