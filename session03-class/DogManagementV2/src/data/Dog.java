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
