package student;
//lưu ở package do chính mình tạo ra là student (package student)
import data.Student;
//phải import data từ một package là student
public class Main {
    public static void main(String[] args) {
        Student Kien = new Student("FPT University", "HE204265", "Lưu Chí Kiên", 2006, "Software Engineering", 2024);
        Kien.checkInformation();

        Student Vu = new Student("Đại học Công Nghiệp Hà Nội", "ABC123456", "Vũ Trường Vũ", 2006, "Cơ điện tử", 2006);
        Vu.checkInformation();




    }
}