package com.xuannhi.mathutil;

import com.xuannhi.mathutil.core.MathUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //test run 1
        testFactorialGivenValidN5RunWells();

        //test run 2
        testFactorialGivenValidN6RunWells();

    }

    public static void testFactorialGivenValidN6RunWells(){
        int n = 6; //tui mun tinh 5!
        long expectedValue = 720; //hy vong 5! return 120
        long actualValue = MathUtil.getFactorial(n);
        System.out.println("6! = ");
        System.out.println("Expected: "+ expectedValue);
        System.out.println("Actual: "+ actualValue);
    }

    //testcase #1: getfactorial() method with valid n, n = 5
    //ten ham bom gom ngu nghia cua testCase
    public static void testFactorialGivenValidN5RunWells(){
        int n = 5; //tui mun tinh 5!
        long expectedValue = 120; //hy vong 5! return 120
        long actualValue = MathUtil.getFactorial(n);
        System.out.println("5! = ");
        System.out.println("Expected: "+ expectedValue);
        System.out.println("Actual: "+ actualValue);
    }

}
