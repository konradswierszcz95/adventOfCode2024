package pl.konrad.swierszcz.day11;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

//    @Test
//    void shouldReturnCorrectAnswerForAoCExample1() {
//        //given
//        //when//then
//        assertThat()
//                .isEqualTo(16L);
//    }
//
//    @Test
//    void shouldReturnCorrectAnswerForAoCExample2() {
//        //given
//        //when//then
//        assertThat()
//                .isEqualTo(81L);
//    }

    @Test
    void shouldReturnCorrectAnswerForAoCPuzzleInput() {
        //given
        //when//then
        assertThat(Solution.getNumberOfStonesAfterBlinks("0 7 198844 5687836 58 2478 25475 894", 25))
                .isEqualTo(216996L);
    }


    @Test
    void shouldReturnCorrectAnswerForAoCPuzzleInput2() {
        //given
        //when//then
        assertThat(Solution.getNumberOfStonesAfterBlinks("0 7 198844 5687836 58 2478 25475 894", 75))
                .isEqualTo(1694L);
    }

    @Test
    void shouldReturnCorrectAnswerForAoCBasicCase() {
        //given
        //when//then
        assertThat(Solution.getNumberOfStonesAfterBlinks("0", 75))
                .isEqualTo(1694L);
    }
}
