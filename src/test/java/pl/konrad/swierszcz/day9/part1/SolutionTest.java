package pl.konrad.swierszcz.day9.part1;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample() {
        //given
        //when//then
        assertThat(Solution.getFilesSum(InputReader.readInput("day9/example1.txt").getFirst()))
                .isEqualTo(14L);
    }
}
