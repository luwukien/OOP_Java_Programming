import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputProfile();
    }
    //nhập thông tin cơ bản của sinh viên và in rả
    public static void inputProfile() {
        //không OOP, chỉ cần hiểu về việc nhập info thôi, không chơi class student
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Name: ");
        name = sc.nextLine().toUpperCase();

        System.out.println("Input yob: ");
//        yob = sc.nextInt(); //convert dât từ bàn phím - là chuỗi thành số
//        //để lại rác trong buffer, tệ nhất là enter, rác dấu cách + enter
//        //xóa bộ đệm trước nhập chuỗi
//        //ADP
//        sc.nextLine();
        //QT
        yob = Integer.parseInt(sc.nextLine());
        //nextLine() hốt sạch buffer, loại bỏ enter, còn chuỗi số -> số
        System.out.println("Input address: ");
        address = sc.nextLine().toUpperCase();


        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("yob: " + yob);
        System.out.println("Address: " + address);

    }

}