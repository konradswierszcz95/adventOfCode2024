package pl.konrad.swierszcz.day12.part1;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample1() {
        //given
        //when//then
        assertThat(Solution.getCostOfRegionSurrounding(InputReader.readInput("day12/ex1.txt")))
                .isEqualTo(140L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCExample2() {
        //given
        //when//then
        assertThat(Solution.getCostOfRegionSurrounding(InputReader.readInput("day12/ex2.txt")))
                .isEqualTo(1930L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCInput() {
        //given
        //when//then
        assertThat(Solution.getCostOfRegionSurrounding(InputReader.readInput("day12/input.txt")))
                .isEqualTo(1489582L);
    }
}
