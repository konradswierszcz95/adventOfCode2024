package pl.konrad.swierszcz.day2.part1;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample() {
        //given
        //when//then
        assertThat(Solution.countNumberOfSafeReports(InputReader.readInput("day2/testInput.txt")))
                .isEqualTo(2L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCPuzzleInput() {
        //given
        //when//then
        assertThat(Solution.countNumberOfSafeReports(InputReader.readInput("day2/input.txt")))
                .isEqualTo(257L);
    }
}
