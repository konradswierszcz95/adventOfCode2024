package pl.konrad.swierszcz.day7.part2;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample() {
        //given
        //when//then
        assertThat(Solution.getSumOfCalibrationResults(InputReader.readInput("day7/testInput.txt")))
                .isEqualTo(11387L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCOwnExample() {
        //given
        //when//then
        assertThat(Solution.getSumOfCalibrationResults(InputReader.readInput("day7/additional.txt")))
                .isEqualTo(19108L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCPuzzleInput() {
        //given
        //when//then
        assertThat(Solution.getSumOfCalibrationResults(InputReader.readInput("day7/input.txt")))
                .isEqualTo(306L);
    }
}
