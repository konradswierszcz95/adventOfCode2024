package pl.konrad.swierszcz.day12.part2;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample1() {
        //given
        //when//then
        assertThat(Solution.getCostOfRegionSurrounding(InputReader.readInput("day12/ex1.txt")))
                .isEqualTo(80L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCExample2() {
        //given
        //when//then
        assertThat(Solution.getCostOfRegionSurrounding(InputReader.readInput("day12/ex2.txt")))
                .isEqualTo(1206L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCExample3() {
        //given
        //when//then
        assertThat(Solution.getCostOfRegionSurrounding(InputReader.readInput("day12/ex3.txt")))
                .isEqualTo(236L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCExample4() {
        //given
        //when//then
        assertThat(Solution.getCostOfRegionSurrounding(InputReader.readInput("day12/ex4.txt")))
                .isEqualTo(368L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCInput() {
        //given
        //when//then
        assertThat(Solution.getCostOfRegionSurrounding(InputReader.readInput("day12/input.txt")))
                .isEqualTo(914966L);
    }
}
