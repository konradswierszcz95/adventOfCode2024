package pl.konrad.swierszcz.day1.part1;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample() {
        //given
        //when//then
        assertThat(Solution.getDistancesSummary(InputReader.readInput("day1/testInput.txt")))
                .isEqualTo(11);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCPuzzleInput() {
        //given
        //when//then
        assertThat(Solution.getDistancesSummary(InputReader.readInput("day1/input.txt")))
                .isEqualTo(2344935);
    }
}
