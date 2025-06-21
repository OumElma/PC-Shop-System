import java.sql.Timestamp;
import java.util.ArrayList;

public class Order {
    int orderID;
    int customerID;
    int employeeID;
    ArrayList<Component> components;
    Timestamp orderTime;
    double totalPrice;
    String status;
    String orderSpecifications;
    String cusAddress;

    public Order(int orderID, int customerID, int employeeID, ArrayList<Component> components, 
                  Timestamp orderTime, String orderSpecifications, String cusAddress) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.employeeID = employeeID;
        this.components = components;
        this.orderTime = orderTime;
        this.orderSpecifications = orderSpecifications;
        this.cusAddress = cusAddress;
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