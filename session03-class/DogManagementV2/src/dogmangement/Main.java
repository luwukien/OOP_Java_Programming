package dogmangement;

import data.Dog;

public class Main {
    public static void main(String[] args) {
        //lấy khuôn dog ra dể lấy info
        //y chang làm thẻ căn cước, lấy thông tin, in lên thẻ, đồ mực
        //sau khi chờ khô, ta được object thuộc nhóm vừa đúc
        //đật tên gọi tắt cho objcet để đề dàng nói chuyện, tham chiếu đến
        int yob = 2001;

//        //  biến.tên tắt      object
//        //có object thì object sẽ biết làm gì đó, cờ hó biết sủa
//        //
//        //hàm gọi n
//        chiHu.bark();

//        ngaoDa.bark();
//        chiHu.
        //chiHu sủa lại
//        System.out.println("After overweight");
////        System.out.println("Chi hu hu barks again!!!");
//        chiHu.setNewWeight(5);
//        chiHu.bark();
//        //new xin vùng ram mới đủ chứ info của 1 bạn Dog sẽ được đúc, được đổ vào
//        //có 2 vùng name dành cho 2 object
//        //nên là nd không name của con chó kia
//        //Hành động phải gắn với object, thông qua chấm
////        chiHu.name
//
//        int chYob = chiHu.getYob();
//        System.out.println("CH yob " + chYob);
//
//        System.out.println("NĐ YOB: " + ngaoDa.getYob());
        Dog chiHu = new Dog("ChiHuhu", 2021, 45);

        Dog ngaoDa = new Dog("NgaoDa", 2020, 68);

        int chYob = chiHu.getYob();
        System.out.println("The yob of chihuhu is " + chYob);

        String chName = chiHu.getName(); //chName nó là một tên tắt để trỏ trong vùng nhớ heap đến tới class là Dog
        System.out.println("The name of chihuhu is " + chName);
    }
}
//ENCAPSULATION: TÍNH ĐÓNG GÓI CỦA THÔNG TIN VÀ HÀNH ĐỘNG
//HÀM BIẾN ĐI KÈM VỚI NHAU ĐAỊ DIỆN, MÔ TẢ CHO 1 OBJECT, THỰC THỂ