package data;

public class Laptop {
    private String brand;
    private String model;
    private String color;
    private int price;
    private String GraphicsCard;

    public Laptop(String brand, String model, String color, int price, String graphicsCard) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        GraphicsCard = graphicsCard;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGraphicsCard() {
        return GraphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        GraphicsCard = graphicsCard;
    }
}
