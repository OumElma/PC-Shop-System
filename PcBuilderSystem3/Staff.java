import java.util.ArrayList;

public class Staff {
    int empId;
    String fullName;
    String phoneNumber;
    String empAddress;
    String password;
    String role;
    double salary;
    String shift;
    static ArrayList<Staff> staffList = new ArrayList<>();
    static ArrayList<Order> orders = new ArrayList<>();

    public Staff(int empId, String fullName, String phoneNumber, String empAddress, 
                 String password, String role, double salary, String shift) {
        this.empId = empId;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.empAddress = empAddress;
        this.password = password;
        this.role = role;
        this.salary = salary;
        this.shift = shift;
    }

    public static void register(Staff newStaff) {
        staffList.add(newStaff);
    }

    public static boolean login(String email, String password) {
        for (Staff staff : staffList) {
            if (staff.email.equals(email) && staff.password.equals(password)) {
                System.out.println("Login successful for " + staff.fullName);
                return true;
            }
        }
        System.out.println("Login failed. Please check your email and password.");
        return false;
    }

    public static void notifyStaff(Order order) {
        System.out.println("New order received! Order ID: " + order.orderID);
        System.out.println("Customer ID: " + order.customerID);
        System.out.println("Employee ID: " + order.employeeID);
        System.out.println("Components:");
        for (Component component : order.components) {
            System.out.println(component.type + ": " + component.name + " (" + component.specifications + ")");
        }
        System.out.println("Total Price: $" + order.totalPrice);
        System.out.println("Order Specifications: " + order.orderSpecifications);
        System.out.println("Customer Address: " + order.cusAddress);
        orders.add(order);
    }

    public static void generateSalesReport() {
        System.out.println("\nSales Report:");
        double totalSales = 0;
        for (Order order : orders) {
            System.out.println("Order ID: " + order.orderID + ", Total Price: $" + order.totalPrice + 
                               ", Status: " + order.status);
            totalSales += order.totalPrice;
        }
        System.out.println("Total Sales: $" + totalSales);
    }
}