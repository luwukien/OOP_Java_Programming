import data.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop Macbook = new Laptop("Apple", "Macbook Pro M3", "Silver", 43_000_000, "Neural Engine");
        Laptop Ideapad = new Laptop("Lenovo", "IdeaPad", "Silver", 43_000_000, "Nexus");

        Macbook.getModel();
        Ideapad.getModel();
        System.out.println(" " + Macbook.getModel());
    }
}