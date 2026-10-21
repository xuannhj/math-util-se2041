package com.xuannhi.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {

        //REFACTORING, REFACTOR: TÔI ƯU, TÍNH CHỈNH SRC CODE
        //CODE MỚI KHI ĐƯỢC ĐƯA LÊN SERVER PHẢI ĐƯỢC CHECK LẠI NGAY Ở NHANH DEV,
        //HOẶC KHI ĐƯA VÀO NHÁNH MAIN CŨNG PHẢI ĐƯỢC CHECK, ĐỂ ĐẢM BẢO RẰNG NÓ MÀU XANH
        //PASSED HẾT CÁC TEST CASE

        //LÝ DO: HÀM THÌ PHẢI CHẠY ĐÚNG!!!!!!

        //NẾU PROJECT CÓ SẴN TDD, UNIT TEST, THÌ QUÁ TRÌNH KIỂM THỬ LẠI CODE VỪA SỬA DIỄN RA RẤT NHANH, RẤT TIỆN DO UNIT TEST KHI PHỐI HỢP VỚI CI SCRIPT (.YAML) SẼ TỰ ĐỘNG DC RUN VÀ TỰ BÁO MÀU XANH ĐỎ VÀ GỬI MAIL CHỬI NẾU CÓ ĐỎ

        //TEST LẠI THỨ ĐÃ TỪNG TEST ĐỂ ĐẢM BẢO RẰNG NÓ VẪN CÒN ỔN SAU KHI ĐƯỢC SỬA, ĐƯỢC GỌI LÀ KIỂM THỬ HỒI QUY --- REGRESSION TESTING

        //TA CHỈNH CODE DÙNG ĐỆ QUY - RECURSION
        if (n < 0 || n > 20){
            throw new IllegalArgumentException("invalid param. n must be between 0 and 20");
        }
        //argument exception???
        if (n == 0 || n == 1 ){
            return 1; //n = 0 hoac n = 1 return ngay
        }


        //đệ quy nè, recursion nè, gọi lại chính mình nè ở quy mô nhỏ hơn nè
        return n * getFactorial(n - 1);
        //n! = n * (n - 1)


//        //thuat toan tinh n! giai thua = 1.2.3....n, n from 0...20
//        if (n < 0 || n > 20){
//            throw new IllegalArgumentException("invalid param. n must be between 0 and 20");
//        }
//        //argument exception???
//        if (n == 0){
//            return 1; //n = 0 return ngay
//        }
//
//        //sure n from 1..20
//        long result = 1; //sửa lại source thành 1 để mlem trở lại, green 4 ever
//        //10;//code cố tình tạo bug: nhân thêm 10 để xem red-alert
//
//
//        //khoi dau giai thua = 1, nhân dồn
//        for (int i = 1; i <= n; i++){
//            result *= i;
//        }
//        return result;


    }
}
