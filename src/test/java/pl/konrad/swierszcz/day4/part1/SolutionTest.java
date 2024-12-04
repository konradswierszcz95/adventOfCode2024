package pl.konrad.swierszcz.day4.part1;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample() {
        //given
        //when//then
        assertThat(Solution.getNumberOfXmassOccurrences(InputReader.readInput("day4/testInput.txt")))
                .isEqualTo(18L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCPuzzleInput() {
        //given
        //when//then
        assertThat(Solution.getNumberOfXmassOccurrences(InputReader.readInput("day4/input.txt")))
                .isEqualTo(2549L);
    }
}
