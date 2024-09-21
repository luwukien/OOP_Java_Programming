
package gettingstartedmethods;

public class GettingStartedMethods { // methods bắt buộc phải khai báo trong đây
    static void myMethod() {
        System.out.println("Hello world Java. Welcome to the Java programming language!!");
    }

    public static void main(String[] args) { // đây sẽ là nơi hàm được gọi ra
        //methods nó cũng tương đương với func bên C:
        //nó cũng có thể truyền được tham số, tham trị nói chung là pass data
        // System.out.println("");  đây cũng là một methods pre-defined methods
        myMethod();
        for (int i = 0; i < 10; i++) {
            myMethod();
        }
    }
    
}
