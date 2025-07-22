import java.util.ArrayList;

public class Store {
    static String storeName;
    static String storeLocation;

    ArrayList<Product> products = new ArrayList<>();

    static void setStoreDetails(String name, String location) {
        storeName = name;
        storeLocation = location;
    }

    static void displayStoreDetails() {
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Location: " + storeLocation);
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void displayAllProducts() {
        System.out.println("Products in store:");
        for (Product p : products) {
            p.displayProduct();
        }
    }
}