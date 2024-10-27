package data;

import data.Student.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        saveAStudent();
        saveAStudent();
    }

    //nhập từ bàn phím
    //cần Scanner object bàn phím, OOP cái gì cũng cần object, class
    //Máy cam, Scanner,tiệm phôt, WC, bàn phím cơ, TouchPad -> nhóm Quét dữ liệu  đưa vào bàn phím, Class Scanner
    //xuất hiện, xài phải có biến hứng value

    public static void inputAStudent() {
        String IDStudent, name;
        int yob;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input id: ");
        IDStudent = sc.nextLine();

        System.out.println("Input name: "); //chuỗi trước số không bị lạc trôi lệnh
        name = sc.nextLine();
        System.out.println("Input yob: ");
        yob = sc.nextInt();

        Student x = new Student(IDStudent, name, yob);
        x.showProfile();
    }
    public static void saveAStudent() {
        Student kien = new Student("HE204365", "LUU CHI KIEN", 2006);
        Student vu = new Student("HE22222", "VU TRUONG VU", 2005);
        kien.showProfile();

        //chấm xổ gì, Access Modifier/Access Specifier
        System.out.println("Kien name (directly): " + kien.nameStudent);
        System.out.println("Kien name (directly): " + kien.getNameStudent());

        //vì sờ được cái name/biến/instance variable, thế nên chúng ta có thể get() và set()
        kien.nameStudent = "KHONG HOC BAI";
        Student.nameStudent = "CÀY RANK KHÔNG CÀY CODE";
        System.out.println("Vu name (directly): " + vu.nameStudent);
        System.out.println("Kien name again (directly): " + kien.nameStudent);

        Student cuong = new Student("HE3333333", "NGUYEN KHAC CUONG", 2004);
        kien.showProfile();

        //sayHi() mà sayHi() đang là static rồi
        System.out.println("using static");
        kien.sayHi();
        vu.sayHi();
        Student.sayHi(); //tên class chấm static thì mới chuẩn

        //Static sẽ ăn theo thằng cuối cùng
        //2 loại dấu chấm
        //chấm trực tiếp qua tên class tức là chạm sờ Static
        //chấm qua con đường new tức là bạn đang hàm ý chơi với non-static
        //                                          đồ của riêng từng object

    }



}