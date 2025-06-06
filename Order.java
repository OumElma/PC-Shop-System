import java.sql.Timestamp;
import java.util.ArrayList;

public class Order {
    int orderID;
    int customerID;
    String staffID;
    ArrayList<Component> components; // Selected components
    Timestamp orderTime;
    double totalPrice;
    String status; // e.g., Submitted, In Progress, Completed

    public Order(int orderID, int customerID, String staffID, ArrayList<Component> components, Timestamp orderTime) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.staffID = staffID;
        this.components = components;
        this.orderTime = orderTime;
        this.status = "Submitted";
        this.totalPrice = calculateTotalPrice();
    }

    private double calculateTotalPrice() {
        double total = 0;
        for (Component component : components) {
            total += component.price;
        }
        return total;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
}