import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PCBuilder {
    public static void main(String[] args) {
        // Initialize sample data from spreadsheet
        Staff s1 = new Staff(30001, "Elma", "", "", "password1", "PC Builder", 700.0, "morning");
        Staff s2 = new Staff(30002, "Sovin", "", "", "password2", "Logistical Support", 500.0, "morning/afternoon");
        Staff.register(s1);
        Staff.register(s2);

        Component c1 = new Component(10001, "CPU", "AMD Ryzen 5", 120.0, "6 cores", "In Stock");
        Component c2 = new Component(10002, "GPU", "NVIDIA GeForce RTX 3060 12GB", 0.0, "", "Out of Stock");

        Scanner sc = new Scanner(System.in);
        String email, password;
        System.out.print("Enter email: ");
        email = sc.nextLine();
        System.out.print("Enter password: ");
        password = sc.nextLine();

        if (Staff.login(email, password)) {
            int choice;
            do {
                System.out.println("\nWelcome to the PC Customization System!");
                System.out.println("1. Add Component to Inventory");
                System.out.println("2. View Inventory");
                System.out.println("3. Place Customer Order");
                System.out.println("4. View Sales Report");
                System.out.println("5. Exit");
                System.out.print("Your choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter component ID: ");
                        int compId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter component name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter price: ");
                        double price = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Enter type (CPU/GPU/RAM/Case): ");
                        String type = sc.nextLine();
                        System.out.print("Enter specs: ");
                        String specs = sc.nextLine();
                        System.out.print("Enter stock status (In Stock/Out of Stock/Pre Order): ");
                        String stockStatus = sc.nextLine();
                        new Component(compId, type, name, price, specs, stockStatus);
                        break;
                    case 2:
                        Component.viewInventory();
                        break;
                    case 3:
                        System.out.print("Enter customer ID: ");
                        int custId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter customer full name: ");
                        String custName = sc.nextLine();
                        System.out.print("Enter PC ID: ");
                        int pcId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter gender (M/F): ");
                        char gender = sc.nextLine().charAt(0);
                        System.out.print("Enter address: ");
                        String address = sc.nextLine();
                        System.out.print("Enter date of birth (yyyy-mm-dd): ");
                        String dobStr = sc.nextLine();
                        Date dob = new Date(dobStr);
                        System.out.print("Enter phone number: ");
                        String phone = sc.nextLine();
                        System.out.print("Enter email: ");
                        String custEmail = sc.nextLine();
                        System.out.print("Enter password: ");
                        String custPassword = sc.nextLine();
                        Customer customer = new Customer(custId, custName, pcId, gender, address, dob, phone, custEmail, custPassword);

                        System.out.print("Enter number of components: ");
                        int numComponents = sc.nextInt();
                        ArrayList<Component> components = new ArrayList<>();
                        for (int i = 0; i < numComponents; i++) {
                            System.out.print("Enter component ID: ");
                            int componentId = sc.nextInt();
                            for (Component comp : Component.catalog) {
                                if (comp.componentID == componentId) {
                                    components.add(comp);
                                    customer.addComponent(comp);
                                    break;
                                }
                            }
                        }
                        System.out.print("Enter order specifications: ");
                        sc.nextLine();
                        String orderSpecs = sc.nextLine();
                        System.out.print("Enter employee ID: ");
                        int empId = sc.nextInt();
                        Order order = new Order(custId, custId, empId, components, new Timestamp(System.currentTimeMillis()), orderSpecs, address);
                       _quadStaff.notifyStaff(order);
                        break;
                    case 4:
                        Staff.generateSalesReport();
                        break;
                    case 5:
                        System.out.println("Thank you for using the PC Customization System. Goodbye!");
                        sc.close();
                        System.exit(0);
                    default:
                        System.out.println("Please choose from 1 to 5 only.");
                }
            } while (true);
        } else {
            sc.close();
        }
    }
}