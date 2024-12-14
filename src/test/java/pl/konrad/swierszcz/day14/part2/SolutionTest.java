package pl.konrad.swierszcz.day14.part2;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCInput() {
        //given
        //when//then
        assertThat(Solution.getTreeSecond(InputReader.readInput("day14/input.txt"), 101, 103))
                .isEqualTo(7383);
    }
}
