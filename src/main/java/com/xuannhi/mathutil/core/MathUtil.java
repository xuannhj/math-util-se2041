package com.xuannhi.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {
        //thuat toan tinh n! giai thua = 1.2.3....n, n from 0...20
        if (n < 0 || n > 20){
            throw new IllegalArgumentException("invalid param. n must be between 0 and 20");
        }
        //argument exception???
        if (n == 0){
            return 1; //n = 0 return ngay
        }

        //sure n from 1..20
        long result = 1; //sửa lại source thành 1 để mlem trở lại, green 4 ever
        //10;//code cố tình tạo bug: nhân thêm 10 để xem red-alert


        //khoi dau giai thua = 1, nhân dồn
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
