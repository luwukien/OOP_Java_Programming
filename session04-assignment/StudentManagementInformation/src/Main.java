import data.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("HE204365", "DKM");
        Student student2 = new Student("HE100111", "LUU CHI KIEN");

        student1.displayStudentInfo();
        student2.displayStudentInfo();

        Student.setUniversityName("PTIT University");

        student1.displayStudentInfo();
        student2.displayStudentInfo();


//        Student.displayStudentCount();
    }
}