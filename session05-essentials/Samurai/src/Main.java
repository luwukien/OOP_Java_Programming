import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        inputProfileCool();
    }
    public static void inputProfileCool() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Name: ");
        name = sc.nextLine().toUpperCase();

        while (true) { //cuộc chiến vô cực
            try {
                System.out.println("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Do you know to input a positive number??");

            }
        }




        System.out.println("Input address: ");
        address = sc.nextLine().toUpperCase();


        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("yob: " + yob);
        System.out.println("Address: " + address);

    }

    public static void inputProfile() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Name: ");
        name = sc.nextLine().toUpperCase();
        //mặc định JVM J sẽ giết app nếu có cà chớn xẩy ra để đảm bảo an toàn cho app, xử lí data
        //đưa cho ta 1 cơ chế tự xử khi có cà chớn, chuyển quyền giết chóc cho mình
        //báo JVM biết đừng giết, tao tự xử, nhốt các lệnh cà chớn lại, SANDBOX

        try {
            //lệnh cà chớn nằm here
            System.out.println("Input yob: ");

            //QT
            yob = Integer.parseInt(sc.nextLine());
            //nextLine() hốt sạch buffer, loại bỏ enter, còn chuỗi số -> số
            //ctrl + alt + l
        } catch (Exception e) {
            //CPU sẽ chạy tới chỗ này, khi có cà chớn xảy ra
            //JVM không giết app như truyền thống
            //chỗ này là chỗ xử lí hậu quả cả chớn
            //không có cà chớn thì không vào đay
            //e chính là là thứ/msg màu đỏ JVM gửi cho mình báo rằng có lỗi cà chớn nè
            //làm gì thì làm
            //Exception e = new Exception(nội dung màu đỏ đây nè...);
            //về lí: e.exam  lỗi, xử lí tự mình
            //về toán hóa mình tập chung phần xử lí  lỗi, biết thừa éo có gõ đúng số mình cần

            //xử lí sao?? nhiều cách: default value(không hay)
//                                    hay: bắt nhập lại, member: login/user name

            yob = 69;
        }


        System.out.println("Input address: ");
        address = sc.nextLine().toUpperCase();


        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("yob: " + yob);
        System.out.println("Address: " + address);

    }
}