import java.util.ArrayList;

public class Staff {
    int staffID;
    String fullName;
    String email;
    String password;
    static ArrayList<Staff> staffList = new ArrayList<Staff>();
    static ArrayList<Order> orders = new ArrayList<Order>(); // Store all orders

    public Staff(String fullName, String email, String password) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    static void register(Staff newStaff) {
        staffList.add(newStaff);
    }

    static void login(Staff loginStaff) {
        for (Staff staff : staffList) {
            if (staff.email.equals(loginStaff.email) && staff.password.equals(loginStaff.password)) {
                System.out.println("Login successful for " + staff.fullName);
                return;
            }
        }
        System.out.println("Login failed. Please check your email and password.");
    }

//     // Notify staff of new order
//     static void notifyStaff(Order order) {
//         System.out.println("New order received! Order ID: " + order.orderID);
//         System.out.println("Customer ID: " + order.customerID);
//         System.out.println("Components:");

//         for (Product component : order.components) {
//             System.out.println(component.componentType + ": " + component.name + " (" + component.specifications + ")");
//         }
//         System.out.println("Total Price: $" + order.totalPrice);
//         orders.add(order); // Add order to list
//     }
// }