package pl.konrad.swierszcz.day9.part2;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample1() {
        //given
        //when//then
        assertThat(Solution.getFilesCheckSum(InputReader.readInput("day9/example1.txt").getFirst()))
                .isEqualTo(132L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCExample2() {
        //given
        //when//then
        assertThat(Solution.getFilesCheckSum(InputReader.readInput("day9/example2.txt").getFirst()))
                .isEqualTo(2858L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCPuzzleInput() {
        //given
        //when//then
        assertThat(Solution.getFilesCheckSum(InputReader.readInput("day9/input.txt").getFirst()))
                .isEqualTo(6359491814941L);
    }
}
