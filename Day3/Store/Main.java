public class Main {
    public static void main(String[] args) {
        Store.setStoreDetails("My Store", "Downtown");

        Store store = new Store();

        Product p1 = new Product(1, "Pen", 1.5, 100);
        Product p2 = new Product(2, "Notebook", 2.5, 50);

        store.addProduct(p1);
        store.addProduct(p2);

        Store.displayStoreDetails();
        store.displayAllProducts();
    }
}
