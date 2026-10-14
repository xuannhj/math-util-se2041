package com.xuannhi.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {
 //testcase #1, n = 5! -> expected = 120
    @Test
    void testFactorialGivenValidN5ReturnsWell120() {
        int n = 5;
        long expected = 120;
        long actual = MathUtil.getFactorial(n);

        //so sanh bang mat hay bang tool? bang com hay bang library
        //bang com -> in ra log file -> da choi roi va nay ko choi nua (xem ben Main)
        //so sanh bang tool xanh do
        assertEquals(expected, actual);
    }

    @Test
    void testFactorialGivenValidN6ReturnsWell720() {
        int n = 6;
        long expected = 720;
        long actual = MathUtil.getFactorial(n);

        //so sanh bang mat hay bang tool? bang com hay bang library
        //bang com -> in ra log file -> da choi roi va nay ko choi nua (xem ben Main)
        //so sanh bang tool xanh do
        assertEquals(expected, actual);
    }

    //testcase #3: n = 0!, expected 1;
    @Test
    void testFactorialGivenValidN0ReturnsWell1() {
        int n = 0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);

        //so sanh bang mat hay bang tool? bang com hay bang library
        //bang com -> in ra log file -> da choi roi va nay ko choi nua (xem ben Main)
        //so sanh bang tool xanh do
        assertEquals(expected, actual);
    }
    //test case #4: n= - 1!, expected: ham phai nem ra ngoai le thi moi la ham dung vi du kien la -1 phai nem ra ngoai le
    //thay ngoai le la thay mau xanh
    //ngoai le la thu ko the so sanh (assertEquals) - ta phai dung 1 cai assert khac
    //->
    @Test
    void testFactorialGivenInValidMinus1ThrowsException() {
        int invalidN = -1;
        //assertThrows(ngoai le can bat xem co appear ko, ham lambda co lenh goi ham code chinh (giong arrow function trong js), ma gay ra loi);
        assertThrows(IllegalArgumentException.class,
                () ->
                {MathUtil.getFactorial(invalidN);
                }
                );
    }


}