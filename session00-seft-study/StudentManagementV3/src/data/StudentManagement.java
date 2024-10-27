package data;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
//Class StudentManagement ở đây chỉ để thêm sửa xóa thông tin student mới, hoặc cữ
    ArrayList<String> Student = new ArrayList<String>();

    class informationStudent {
        //còn cái class student này nó sẽ lưu toàn bộ thông tin của student
        private String IDStudent;
        private String name;
        private long finalGrade;

        public informationStudent(String IDStudent, String name, long finalGrade) {
            this.IDStudent = IDStudent;
            this.name = name;
            this.finalGrade = finalGrade;
        }

        public String getIDStudent() {
            return IDStudent;
        }

        public void setIDStudent(String IDStudent) {
            this.IDStudent = IDStudent;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getFinalGrade() {
            return finalGrade;
        }

        public void setFinalGrade(long finalGrade) {
            this.finalGrade = finalGrade;
        }
    }
    Scanner sc = new Scanner(System.in);
    //method input information
    public void inputInformation() {
        System.out.println("Please input information student include [IDStudent; Name; finalGrade]");
        String StudentInformation;
        for (int i = 0; i < Student.size(); i++)
            StudentInformation = sc.toString();
    }



    //    for (int i = 0; i < Studen)


}
