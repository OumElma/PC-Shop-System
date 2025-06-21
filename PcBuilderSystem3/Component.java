import java.util.ArrayList;

public class Component {
    int componentID;
    String type; // e.g., CPU, GPU, Motherboard, Case, Power Supply, Cooler
    String name; // e.g., Intel i9-13900K, NVIDIA RTX 4090
    double price;
    String specifications; // e.g., "3.0 GHz, 8 cores" for CPU, "ATX" for motherboard
    String stockStatus; // e.g., In Stock, Out of Stock, Pre Order
    static ArrayList<Component> catalog = new ArrayList<>();

    public Component(int componentID, String type, String name, double price, String specifications, String stockStatus) {
        this.componentID = componentID;
        this.type = type;
        this.name = name;
        this.price = price;
        this.specifications = specifications;
        this.stockStatus = stockStatus;
        catalog.add(this);
    }

    public static void viewInventory() {
        System.out.println("\nComponent Inventory:");
        for (Component component : catalog) {
            System.out.println("ID: " + component.componentID + ", Type: " + component.type + 
                               ", Name: " + component.name + ", Price: $" + component.price + 
                               ", Specs: " + component.specifications + ", Stock: " + component.stockStatus);
        }
    }
}