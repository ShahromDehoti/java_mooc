public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product (String initialName, double initialPrice, int initialQuantity) {
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.name = initialName;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }

    public static void main(String[] main) {
        Product banana = new Product("Banana", 1.1, 13);

        banana.printProduct();
    }
}
