
package varnfunc;

import java.util.Scanner;
//~ #include <stdio.h>

public class VarNFunc {

    public static void main(String[] args) {
//        playWithIntegers();
//        playWithDouble();
//        playWithVariable();
//        playWithCharaters();
//        printIntegerList(500);// hard-code -> không linh hoạt
//          int n = 10;
//          printIntegerList(10);
          //điều khác biệt giữa C và Java thì khi khai báo biến n bất ki
          //mà chưa assgin value thì nó không phải là garbage value
        //hiện tượng 1 class bất kí chứ nhiều hàm trùng tên nhưng khác phàn tham số
        //đầu vào, mà phải khác trên đatatype chứ không khác tên biến
        //được gọi là overloading = quá tải hàm
        //vs. OVERRIDE
        //POLYMORPHISM -> ĐA HÌNH
        int n = getAPositiveInteger(); //truyền tham trị, pass by value
                                        //OOP, pass by reference - truyền tham chỉ , con trỏ địa chỉ
        System.out.println("Your number: " + n);
        printIntegerList(n);
    }

    public static int getAPositiveInteger() {
        int n;
        //nhập từ bàn phím, xài kĩ thuật OOP, chấm và bung lụa
        Scanner banPhimCuaTui = new Scanner(System.in);
        //cách nhận data từ bàn phím bằng cú pháp
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        System.out.printf("Input a positive integer: ");
        n = banPhimCuaTui.nextInt();
        return n; //getAPositiveInteger

    }
    
    public static void printIntegerList(int n) {
        //chỉ có thằng ngáo với scanf(n) here!! n đã có value khi xài
        //body of func 
        System.out.println("The list of 100 first integers!");
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
    }
//    public static void printIntegerList() {
//        System.out.println("The list of 100 first integers!");
//        for (int i = 0; i <= 100; i++) {
//            System.out.print(i + " ");
//        }
    
    
    }
    
    public static void playWithBooleans() { //kiểu booleans chiếm 1 bit nhưng người ta làm tròn lên 1 byte
        //C: đúng: 1, > 0; sai 0: int 
        //Java: đúng: true; sai: false -> boolean                                                                           
        boolean marriedStatus = true;
        if (marriedStatus == true)
                System.out.println("Đánh đồn có đích mới vui");
        else
                System.out.println("Vườn hồng đã có ai vào hay chưa");
    }
    public static void playWithCharaters() {
        //2 byte cho kiểu char nhen, lưu bảng mã ASCII.
        //Kiểu char trong C chỉ chiếm 1 byte thế nhưng kiểu char trong Java chiếm tận 2 byte. thế nên mới
        //ghi được tiếng việt trong C, mà không sợ tràn ram và hiện thị đầy đủ kí tự
        char m = '$';
        System.out.println("Unit: " + m);
        //tên em thì sao? C: mảng các kí tự, không primitive nữa rồi
        //                                          char name[] = "Ahihi";
        String name = "Lưu Chí Kiên"; //loại data type mới hoàn toàn
                                        //phức tập, do gom nhiều thứ khác
                                        //object data type, học sớm thôi
        System.out.println("My name is: " + name);
        System.out.println("1st letter of my name: " + name.charAt(0));
        //hàm lấy ra kí tự đầu tiên .charAt(số thứ tự của string)
        System.out.println("My name as in a lowercase: " + name.toLowerCase());
        //hàm .toLowercase()
        //C: srting.h -> strlwr()...
    }
    public static void playWithDouble() {
        double PI = 3.14;
        System.out.printf("pi: %.2f ", PI); 
        float vat = 0.1F;
        //mọi số thực trong Java đều được coi là kiểu double thế nên nó sẽ cảnh 
        //báo có nguy cơ bị mất data nếu số quá lớn
    }
    public static void playWithIntegers() {    
        int n = 39; //mọi con số, kí tự xuất hiện trong code được gọi là 
                    //literal value
                    //số nguyên xuất hiện trong code mặc định là int 
        System.out.println("n: " + n);
         
        long m = 3_000_000_000L; //_phần cách literal trong code để đọc
        System.out.println("m: " + m);
        
        int status = 0xFA;// hệ 16
        System.out.println("Status: " + status);
        
        int phone = 010; //0 đứng trước
        System.out.println("Phone: " + phone);
    
    
    }
            
            
    //static thì chỉ chơi với static
    public static void playWithVariable() {
        //biến là 1 vùng ram được dặt ten, chiếm 1 số byte nhất định tùy loại
        //số, chữ, ảnh,...
        //biến là cách đặt tên cho 1 đại lượng, 1 giá trị -đơn, phức
        int age = 20;
        int a = 10, b;
        b = 100;
        //tốn 12 byte trong RAM
        System.out.println("Age: " + age);
        int yob = 2001; //year of birth
//        age = 2024 - age;
        
        System.out.println("Age again: " + (2024 -  age));
        System.out.printf("Age printed by using %% as in C: %d\n", (2024 - yob));
    }  
    
}
