package pl.konrad.swierszcz.day8.part1;

import org.junit.jupiter.api.Test;
import pl.konrad.swierszcz.InputReader;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldReturnCorrectAnswerForAoCExample() {
        //givenasdf
        //when//then
        assertThat(Solution.getNumberOfAntinodes(InputReader.readInput("day8/testInput.txt")))
                .isEqualTo(14L);
    }


    @Test
    void shouldReturnCorrectAnswerForAoCPuzzleInput() {
        //given
        //when//then
        assertThat(Solution.getNumberOfAntinodes(InputReader.readInput("day8/input.txt")))
                .isEqualTo(327L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCTrivialExample() {
        //given
        //when//then
        assertThat(Solution.getNumberOfAntinodes(InputReader.readInput("day8/trivial.txt")))
                .isEqualTo(2L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCThreeAntennasExample() {
        //given
        //when//then
        assertThat(Solution.getNumberOfAntinodes(InputReader.readInput("day8/threeAntennas.txt")))
                .isEqualTo(4L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCAntennaWithoutPairExample() {
        //given
        //when//then
        assertThat(Solution.getNumberOfAntinodes(InputReader.readInput("day8/antennaWithoutPair.txt")))
                .isEqualTo(4L);
    }
}
