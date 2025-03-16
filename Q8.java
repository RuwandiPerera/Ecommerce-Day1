public class eight {
    public static void main(String[] args) {
        RetailStore store = new RetailStore();

        store.addProduct(new Fruit("Banana", 160, 10));
        store.addProduct(new Vegetable("Tomato", 245, 5));
        store.addProduct(new Grocery("Sugar", 300, 1));

        store.displayProducts();

        store.editProduct(0, "Banana", 200, 12);

        System.out.println("\nAfter editing Banana:");
        store.displayProducts();

        store.deleteProduct(1);

        System.out.println("\nAfter deleting Tomato:");
        store.displayProducts();
    }
}