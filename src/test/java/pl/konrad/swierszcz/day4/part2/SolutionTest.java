package pl.konrad.swierszcz.day4.part2;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample() {
        //given
        //when//then
        assertThat(Solution.getNumberOfXmasOccurrences(InputReader.readInput("day4/testInput.txt")))
                .isEqualTo(9L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCPuzzleInput() {
        //given
        //when//then
        assertThat(Solution.getNumberOfXmasOccurrences(InputReader.readInput("day4/input.txt")))
                .isEqualTo(2003L);
    }
}
