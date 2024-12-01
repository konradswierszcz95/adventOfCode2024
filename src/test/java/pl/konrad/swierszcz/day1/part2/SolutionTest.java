package pl.konrad.swierszcz.day1.part2;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample() {
        //given
        //when//then
        assertThat(Solution.getSimilarity(InputReader.readInput("day1/testInput.txt")))
                .isEqualTo(31L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCPuzzleInput() {
        //given
        //when//then
        assertThat(Solution.getSimilarity(InputReader.readInput("day1/input.txt")))
                .isEqualTo(27647262L);
    }
}
