package rak.javapractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatRuntimeException;
import static org.assertj.core.api.InstanceOfAssertFactories.throwable;


public class DataStructureFunction {

//    @Test
//    void TestScore() {
//        List<Integer> okn = new ArrayList<>();
//
//        assertThat(getSum(List.of(1, 2, 3, 4))).isEqualTo(10);
//        assertThat(getSum(List.of(7))).isEqualTo(7);
//        assertThat(getSum(List.of())).isEqualTo(0); // 빈 리스트가 주어질 경우 0을 return
//    }
//
//    int getSum(List<Integer> abc) {
//        int a = 0;
//        for (int i = 0; i < abc.size(); i++) {
//            a = abc.get(i) + a;
//        }
//        return a;
//    }

//    void TestScore2() {
//        List<Integer> numbers = new ArrayList<>();
//
//        assertThat(getAverage(List.of(1, 2, 3, 4))).isEqualTo(2.5);
//        assertThat(getAverage(List.of(7))).isEqualTo(7.0);
//        assertThat(getAverage(List.of())).isEqualTo(0.0); // 빈 리스트가 주어질 경우 0 return
//    }
//
//    double getAverage(List<Integer> abc) {
//        if(abc.isEmpty()){
//            return 0;
//        }
//        return getSum(abc) / abc.size();
//    }
//
//    int getSum(List<Integer> abcd) {
//        int a = 0;
//        for (int i = 0; i < abcd.size(); i++) {
//            a = abcd.get(i) + a;
//        }
//        return a;
//    }

//    void TestScore3() {
//        List<Integer> sss = new ArrayList<>();
//
//        assertThat(findMax(List.of(3, 10, 5, 4, 7))).isEqualTo(10);
//        assertThat(findMax(List.of(7))).isEqualTo(7);
//    }
//
//    int findMax(List<Integer> abcdf) {
//        if (abcdf.isEmpty()){
//         return abcdf.get(0);
//        }
//        int maxcode = abcdf.get(0);
//        for (Integer integer : abcdf) {
//            if (integer >= maxcode) {
//                maxcode = integer;
//            }
//        }
//        return maxcode;
//    }

    @DisplayName("시험 점수에 따라 합격 여부를 올바르게 판단해야 한다")
    @Test
    void isPassTest() {
        assertThat(isPass(List.of(60, 60))).isTrue();
        assertThat(isPass(List.of(40, 80))).isTrue();
        assertThat(isPass(List.of(39, 100, 100))).isFalse();
        assertThat(isPass(List.of(100, 0, 100))).isFalse();
    }

    boolean isPass(List<Integer> abcdfe) {
        int sum = 0;

        for (int 총점 : abcdfe) {
            sum = 총점 + sum;
        }

        int avg = sum / abcdfe.size();

        int subjectscore = 40;
        int avgscore = 60;

        for (int i = 0; i < abcdfe.size(); i++) {
            if (abcdfe.get(i) >= subjectscore){

            }
        } if ()

            if (avg >= avgscore){

            }

return :
    }
}
