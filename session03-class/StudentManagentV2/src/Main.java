import data.Student;

public class Main {
    public static void main(String[] args) {
        saveAStudent();
    }

    public static void saveAStudent() {
        Student kien = new Student("HE204365", "LUU CHI KIEN", 2001, 8.9);
        kien.showProfile();
    }
}