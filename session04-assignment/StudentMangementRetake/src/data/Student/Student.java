package data.Student;

public class Student {
    private static String IDStudent; //nằm ở 1 vùng nhớ riêng mà object nào cũng xài ké, chung
                                    //chung vùng nhớ xài chung cho các object cùng Class
                                    //dữ liệu đổ vào hay chỉnh sửa ăn theo thằng cuối cùng
    //CHỐT HẠ: Không dùng statci cho những thứ/DĐ/ HÀM mà của riêng từng Object
    //tui có mã số, bạn có mã số, bạn kia có mã số, nhưng đều là riêng của mỗi đứa
    //chung đặc điểm, khác value. vậy phải có biến clone riênon-static

    public static String nameStudent;

    public int yob;
    private double GPA;
    //....


    public Student(String IDStudent, String nameStudent, int yob) {
        this.IDStudent = IDStudent;
        this.nameStudent = nameStudent;
        this.yob = yob;
    }

    public String getIDStudent() {
        return IDStudent;
    }

//    public void setIDStudent(String IDStudent) {
//        this.IDStudent = IDStudent;
//    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public static void sayHi() {
        System.out.println("Hi everyone, my name is " + nameStudent);
        System.out.println("By the way, my yob is " );
        //còn static thì chỉ chơi với static mà thôi, không chơi với non
        //có quá trời yob được clone biết lấy ai bỏ ai

    }

    @Override
    public String toString() {
        return "Student{" +
                "IDStudent='" + IDStudent + '\'' +
                ", nameStudent='" + nameStudent + '\'' +
                ", yob=" + yob +
                '}';
    }

    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|", IDStudent, nameStudent, yob);
        //non-static thì chơi với cả hai
    }

}
