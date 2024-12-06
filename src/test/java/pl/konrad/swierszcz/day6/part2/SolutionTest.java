package pl.konrad.swierszcz.day6.part2;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample() {
        //given
        //when//then
        assertThat(Solution.countPossibleLoopPositions(InputReader.readInput("day6/testInput.txt")))
                .isEqualTo(6L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCPuzzleInput() {
        //given
        //when//then
        assertThat(Solution.countPossibleLoopPositions(InputReader.readInput("day6/input.txt")))
                .isEqualTo(1888L);
    }
}
