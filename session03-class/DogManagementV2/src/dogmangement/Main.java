package dogmangement;

import data.Dog;

public class Main {
    public static void main(String[] args) {
        int yob = 2020;
        Dog chiHu = new Dog("ChiHuhu", 2021, 45);

        Dog ngaoDa = new Dog("NgaoDa", 2020, 68);

        //tui muốn show toàn bộ info của tui, theo cách toString()
        //object có nhiều hành động
        System.out.println("Show all info by using toString() - a new behavior");
        String chDetails = chiHu.toString();
        //mục tiêu là show ra all of info đã đổ vào, hoặc chỉnh sửa
        System.out.println("CH details: " + chDetails);
        System.out.println("NĐ details: " + ngaoDa.toString());
        //    int a = 100;
//    printf("a: %d\n", a); //100 vùng ram có primitive mấy, value mấy
//    printf("a address: %u\n", &a);
//    int* p = &a //p lưu tọa độ a, gọi là con trỏ,, vì tạo nhắm tọa độ nhà mày
//    printf("p has value of %u\n", *p);
        System.out.println(chiHu); //chiHu là biến object, lưu tọa độ vùng new
        //về mặt lí thuyết thì nó sẽ in ra địa chỉ
        //thế nhưng Java nó sẽ tự động gắn .toString sau chiHu và nó in ra phần data đã được chặt ra các
        //miếng nhỏ
        System.out.println(ngaoDa); //gọi thầm tên em
        //nếu khuôn không có hàm toString() thì mặc nhiên khi nó được triệu gọi (Gọi thầm)
        //hay gọi trực tiếp, JVM, sẽ tự động băm cái vùng RAM cảu object thành con số Hexa
        //HASH NUMBER, nén toàn bộ data thành 1 con số, MD5, SHA-256
        ngaoDa.getAge();
        System.out.println("NĐ age: " + ngaoDa.getAge());
    }
}
//ENCAPSULATION: TÍNH ĐÓNG GÓI CỦA THÔNG TIN VÀ HÀNH ĐỘNG
//HÀM BIẾN ĐI KÈM VỚI NHAU ĐAỊ DIỆN, MÔ TẢ CHO 1 OBJECT, THỰC THỂ