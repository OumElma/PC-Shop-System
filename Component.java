import java.util.ArrayList;

public class Component {
    int componentID;
    String type; // e.g., CPU, GPU, Motherboard, Case, Power Supply, Cooler
    String name; // e.g., Intel i9-13900K, NVIDIA RTX 4090
    double price;
    String specifications; // e.g., "3.0 GHz, 8 cores" for CPU, "ATX" for motherboard
    static ArrayList<Component> catalog = new ArrayList<>(); // Shared catalog of components

    
    // Constructor to add component to catalog
    public Component(int componentID, String type, String name, double price, String specifications) {
        this.componentID = componentID;
        this.type = type;
        this.name = name;
        this.price = price;
        this.specifications = specifications;
        catalog.add(this); // Add to shared catalog
    }
}