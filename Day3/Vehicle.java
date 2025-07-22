public class Vehicle {
    static int count = 0;
    int vehicleId;
    String brand;
    double price;

    Vehicle(int vehicleId, String brand, double price) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.price = price;
        count++;
    }

    public void display() {
        System.out.println("ID: " + vehicleId + ", Brand: " + brand + ", Price: " + price);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(101, "Toyota", 15000);
        Vehicle v2 = new Vehicle(102, "Honda", 17000);

        v1.display();
        v2.display();

        System.out.println("Total vehicles created: " + Vehicle.count);
    }
}
