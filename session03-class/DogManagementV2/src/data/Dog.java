package data;
//Khuôn để đúc ra các Object, đối tượng cần lữu trữ info, thú
//làm ra để bán
//Khuôn thì phải kín, có phễu để chế/rót/hứng/đổ vào cái data, nguyên liệu

public class Dog {
    //chứa các đặc điểm, chi tiết mà cái khuôn, object tương lại sẽ có
    //Khuôn design ra sao, mà một object có thể
    public  String name;
    private int yob;
    private double weight;

    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob; 
        this.weight = weight;
    }


//    @Override // khác hoàn toàn overloading
    //nhưng cả 2 thằng đều có liên quan đến một khái niệm là POLYMORPHIMSM - TÍNH ĐA HÌNH
    public String toString() { //TUYỆT ĐỐI KHÔNG ĐỔI TÊN HÀM toString()
//        return "Dog{" +
//                "name='" + name + '\'' +
//                ", yob=" + yob +
//                ", weight=" + weight +
//                '}';
//        //độ lại được quyền, vì chỉ cần trả chuỗi chứa info của mình
//        //y chang mình làm card visit
////        String tmpMsg = String.format("%-10s|%4d|%4.1f|\n", name, yob, weight); //trả chuỗi thô, không xuống hàng
////        return tmpMsg;
        return String.format("%-10s|%4d|%4.1f|\n", name, yob, weight);
    }
    public int getAge() {
        return 2021 - yob;
    }
    //viết code kiểu này gọi là hard-code. năm sau phải sửa code thì tuổi mới đúng
    //chuẩn: lấy giờ hệ thống Windows - yob;
    //xem tuổi của 1 object, tương tác, hỏi đáp, giao tiếp với object qua dấu chấm

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

//code bên ngoài giống như cái khuôn bị lủng
//một object bất kỳ có nhiều info môt tả, ví dụ: xem ddtddd trên tgdd, đập hộp có sách
//ghi thông số luôn. Nhìn một cuốn sách trên mạng, cầm tay: tác giả, ngày xb, mã số, ...
//gặp chú CSGT, showw ra các info mình có: CCCD, Dirver lic, cà-vẹt, ..
//việc show info của một object là tự nhiên, FB profile
//đó là một hành động nên có của một object, mô rả, đặc tả về object
//hành động này có thể do ta chủ động tự đưa ra, hoặc tự generate  theo templaate có sẵn
//template có sẵn Java giúp mình, minh không cần code


