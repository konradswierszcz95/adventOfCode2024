package pl.konrad.swierszcz.day16;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;
import pl.konrad.swierszcz.day16.part1.SolutionDjikstra;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample1() {
        //given
        //when//then
        assertThat(SolutionDjikstra.getMinimumScore(InputReader.readInput("day16/ex.txt")))
                .isEqualTo(7036L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCInput() {
        //given
        //when//then
        assertThat(SolutionDjikstra.getMinimumScore(InputReader.readInput("day16/input.txt")))
                .isEqualTo(7036L);
    }
}
