import java.util.ArrayList;
import java.util.Date;

public class Customer {
    int customerID;
    String fullName;
    String phoneNumber;
    Date registrationDate;
    ArrayList<Component> selectedComponents; // Customer's chosen components

    public Customer(int customerID, String fullName, String phoneNumber) {
        this.customerID = customerID;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.registrationDate = new Date(System.currentTimeMillis());
        this.selectedComponents = new ArrayList<>();
    }

    // Add a component to the customer's selection
    public void addComponent(Component component) {
        selectedComponents.add(component);
    }
}