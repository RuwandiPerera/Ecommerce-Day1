public class Fruite extends Product {
    public Fruite(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public void displayDetails() {
        System.out.println("Fruit: " + getName() + " | Price: " + getPrice() + " | Quantity: " + getQuantity());
    }
}