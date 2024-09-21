package data;
//đây giống như vào cái bàn để đặt tờ phiếu lên
public class Student { //chứa template, gồm nhiều object trong đây
    private String nameUniversity; //một thành phần
    private String id; //thành phần
    private String name;
    private int yob;
    private String major;
    private int yearOfAdmission;
    //giống như là liệt kê xem có những mục nào
    //như là một cái phễu đưa những thông tin có sẵn và đã được định nghĩaz
    public Student(String iNameUniversity, String  iId, String iName, int iYob, String iMajor, int iYearOfAdmission) {
        nameUniversity = iNameUniversity;
        id = iId;
        name = iName;
        yob = iYob;
        major = iMajor;
        yearOfAdmission = iYearOfAdmission;
    }
    public void checkInformation() {
        System.out.printf("The information of the student who has ID student %s is\n", id);
        System.out.println("The university of the student: " + nameUniversity);
        System.out.println("The name of the student: " + name);
        System.out.println("The yob of the student: " + yob);
        System.out.println("The major of the student: " + major);
        System.out.println("The year of the student: " + yearOfAdmission);
        //in ra toàn bộ thông tin của thí sinh đó4
    }

}
