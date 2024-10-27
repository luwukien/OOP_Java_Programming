package data;

public class Student {

    private String id;
    private String name;
    private static String universityName = "FPT University";
    private static int countStudent = 0;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        countStudent++;
    }

    public void displayStudentInfo() {
        System.out.println("Information of the student is " + name + ", ID Student: " + id
        + ", University name: " + universityName);
    }

    public static void displayStudentCount() {
        System.out.println("The total of the student is " + countStudent);
    }

    public static String getUniversityName() {
        return universityName;
    }

    public static void setUniversityName(String universityName) {
        Student.universityName = universityName;
    }
    //nếu tao thay đổi như này thì 2 thằng student kia nó có thay đổi university của nó hay không? câu trả lời là có


}

