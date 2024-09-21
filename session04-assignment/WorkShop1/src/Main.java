import java.util.Scanner;

// viết hàm kiếm tra 1 số có phải số nguyên tố hay không?
//public static boolean isPrime(int n);
public class Main {
    public static void main(String[] args) {
//        int n = 9;
//        if (isPrime(n)) //chương trình nó sẽ tự hiểu nếu method dưới đúng thì sẽ thực hiện câu lệnh dưới
                            //thực ra thì if(điều gì đúng thì nó là true)
//            System.out.println("Prime number");
//        else
//            System.out.println("Not Prime number");
//        System.out.println("Print prime number from 1 to 1000: ");
//        for (int i = 1; i <= 1000; i++) {
//            if (isPrime(i)) {
//                System.out.println(i);
//            }
//      }
//            print1000FirstPrime();
        solve();

}

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) //chỉ cần chạy tới căn bậc hai của n vì trong
                                                //bội số của dãy số từ i tới căn n cũng chính là số từ
                                                //căn n tới n
            if (n % i == 0) //kiểm tra số nguyên tố
                return false;
        return true;
    }

    public static void print1000FirstPrime() {
        int i = 0, acc = 0; //acc: cộng dồn
        while (acc != 1000) {  //chỉ khi tới 1000 số thì mới dừng
            if (isPrime(i)) {
                System.out.println(i + " ");
                acc++;
            }
            i++;
        }
    }

    public static void solve() { // hàm giải phương trình bậc 1 gồm 1 ẩn x
                                    //nhập a, b từ bàn phím
        Scanner valueA = new Scanner (System.in);
        Scanner valueB = new Scanner (System.in);

        System.out.println("Input a, b to solve ax + b = 0 pls: ");
        int a = valueA.nextInt();
        int b = valueB.nextInt();

        float x; //nó sẽ mặc định chiếm số byte như kiểu double dù rằng là khai báo float
        x = (float) (-b * 1.0 / a); //ép kiểu tường minh, có thể mất data nên cẩn thận
        System.out.println("The result is: " + x);


    }
}

