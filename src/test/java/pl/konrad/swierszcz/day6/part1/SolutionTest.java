package pl.konrad.swierszcz.day6.part1;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample() {
        //given
        //when//then
        assertThat(Solution.predictNumberOfVisitedPositions(InputReader.readInput("day6/testInput.txt")))
                .isEqualTo(41L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCPuzzleInput() {
        //given
        //when//then
        assertThat(Solution.predictNumberOfVisitedPositions(InputReader.readInput("day6/input.txt")))
                .isEqualTo(5129L);
    }
}
