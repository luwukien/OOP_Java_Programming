package data;

public class Student {
    private String id;
    private String name;
    private int age;
    private double gpa;

    public Student(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8|%-25s|%4d|%4.lf|", id, name, age, gpa);
    }

    public void showProfile() {
        System.out.printf("|%8|%-25s|%4d|%4.lf|\n", id, name, age, gpa);
    }

    public int getAge() {
        return 2024 - age;
    }
}

