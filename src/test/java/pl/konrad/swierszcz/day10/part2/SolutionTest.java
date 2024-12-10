package pl.konrad.swierszcz.day10.part2;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample1() {
        //given
        //when//then
        assertThat(Solution.getTotalRating(InputReader.readInput("day10/ex1.txt")))
                .isEqualTo(16L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCExample2() {
        //given
        //when//then
        assertThat(Solution.getTotalRating(InputReader.readInput("day10/ex2.txt")))
                .isEqualTo(81L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCPuzzleInput() {
        //given
        //when//then
        assertThat(Solution.getTotalRating(InputReader.readInput("day10/input.txt")))
                .isEqualTo(1694L);
    }
}
