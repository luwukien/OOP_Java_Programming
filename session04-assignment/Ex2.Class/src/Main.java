import data.Book;

public class Main {
    public static void main(String[] args) {

        //lưu trữ thông tin sách
        Book ChipWar = new Book("Chip War", "Chris Miller", 4.9, 2024);
        Book CleanCode = new Book("Clean Code", "Michael Brown", 4.6, 2004);
        Book HeadFirstJava = new Book("Head First Java", "John Doe", 5.0, 2000);

        System.out.println("The information below is the informaion a book on Amazon!");
        int CW = ChipWar.getYear();
        System.out.println("The year of Chip War is " + CW);

        String CL = CleanCode.getAuthor();
        System.out.println("The author of Clean Code is " + CL);

        int HFJ = HeadFirstJava.getYear();
        System.out.println("The year of Head First Java is " + HFJ);
    }
}