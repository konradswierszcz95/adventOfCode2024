package pl.konrad.swierszcz.day17.part1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample1() {
        //given
        //when//then
        Assertions.assertThat(Solution.getProgramOutput(InputReader.readInput("day17/ex.txt")))
                .isEqualTo(List.of(4,6,3,5,6,3,5,2,1,0));
    }

    @Test
    void shouldReturnCorrectAnswerForAoCExample2() {
        //given
        //when//then
        assertThat(Solution.getProgramOutput(InputReader.readInput("day17/ex2.txt")))
                .isEqualTo(List.of(0,1,2));
    }

    @Test
    void shouldReturnCorrectAnswerForAoCExample3() {
        //given
        //when//then
        assertThat(Solution.getProgramOutput(InputReader.readInput("day17/ex3.txt")))
                .isEqualTo(List.of(4,2,5,6,7,7,7,7,3,1,0));
    }

    @Test
    void shouldReturnCorrectAnswerForAoCExample4() {
        //given
        //when//then
        assertThat(Solution.getProgramOutput(InputReader.readInput("day17/ex4.txt")))
                .isEqualTo(Collections.emptyList());
    }

    @Test
    void shouldReturnCorrectAnswerForAoCExample5() {
        //given
        //when//then
        assertThat(Solution.getProgramOutput(InputReader.readInput("day17/ex5.txt")))
                .isEqualTo(Collections.emptyList());
    }

    @Test
    void shouldReturnCorrectAnswerForAoCInput() {
        //given
        //when//then
        assertThat(Solution.getProgramOutput(InputReader.readInput("day17/input.txt")))
                .isEqualTo(List.of(6,5,4,7,1,6,0,3,1));
    }
}
