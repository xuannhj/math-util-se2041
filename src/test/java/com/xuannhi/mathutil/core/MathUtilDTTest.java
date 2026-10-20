package com.xuannhi.mathutil.core;
import com.xuannhi.mathutil.core.MathUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilDTTest {
    //chuan bi bo data
    //ham tra ve mang 2 chieu
    //DDT: Data Driven Tesing
    public static Object[][] initTestData(){
        Object[][] testData = {
                {0, 1L},
                {1, 1L},
                {2, 2L},

                {5, 120L},
                {6, 720L}
        }; //[5][2]
        return testData;
    }

    //chi can 1 lenh assert
    @ParameterizedTest
    @MethodSource("initTestData")
    void testFactorialGivenValidNRunsWell(int n, long expected) throws Exception{
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}