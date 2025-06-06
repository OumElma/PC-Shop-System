import java.util.Scanner;

public class PCBuilder {
    public static void main(String[] args) {
        // Initialize sample staff
        Staff s1 = new Staff("John Doe", "Manager", "Hello@gmail.com", "11111111");
        Staff s2 = new Staff("Jane Smith", "Sales", "Hi@gmail.com", "22222222");
        Staff.register(s1);
        Staff.register(s2);

        // Initialize sample components
        Component c1 = new Component("Ryzen 5 7600X", 197.00, "CPU", "6 cores, 5.3GHz", 10);

        Scanner sc = new Scanner(System.in);
        String email, password;
        System.out.print("Enter email: ");
        email = sc.nextLine();
        System.out.print("Enter password: ");
        password = sc.nextLine();

        if (Staff.login(new Staff(email, password))) {
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
                sc.nextLine(); // Clear buffer

//                 switch (choice) {
//                     case 1:
//                         System.out.print("Enter component name: ");
//                         String name = sc.nextLine();
//                         System.out.print("Enter price: ");
//                         double price = sc.nextDouble();
//                         sc.nextLine();
//                         System.out.print("Enter type (CPU/GPU/RAM/Case): ");
//                         String type = sc.nextLine();
//                         System.out.print("Enter specs: ");
//                         String specs = sc.nextLine();
//                         System.out.print("Enter stock quantity: ");
//                         int stock = sc.nextInt();
//                         Staff s = staffList.get(0); // Assume first staff for simplicity
//                         s.addComponentToInventory(new Component(name, price, type, specs, stock));
//                         break;
//                     case 2:
//                         Component.viewInventory();
//                         break;
//                     case 3:
//                         System.out.print("Enter customer full name: ");
//                         String custName = sc.nextLine();
//                         System.out.print("Enter gender (M/F): ");
//                         char gender = sc.nextLine().charAt(0);
//                         System.out.print("Enter phone number: ");
//                         String phone = sc.nextLine();
//                         System.out.print("Enter address: ");
//                         String address = sc.nextLine();
//                         Customer customer = new Customer(custName, gender, phone, address);
//                         System.out.print("Enter preferences (e.g., Gaming PC): ");
//                         customer.savePreferences(sc.nextLine());

//                         System.out.print("Enter number of components: ");
//                         int numComponents = sc.nextInt();
//                         int[] componentIDs = new int[numComponents];
//                         int[] quantities = new int[numComponents];
//                         for (int i = 0; i < numComponents; i++) {
//                             System.out.print("Enter component ID: ");
//                             componentIDs[i] = sc.nextInt();
//                             System.out.print("Enter quantity: ");
//                             quantities[i] = sc.nextInt();
//                         }
//                         Order order = new Order(customer.customerID, s1.staffID + "", componentIDs, quantities);
//                         s1.processOrder(order);
//                         customer.addLoyaltyPoints(order.totalPrice);
//                         break;
//                     case 4:
//                         Staff.generateSalesReport();
//                         break;
//                     case 5:
//                         System.out.println("Thank you for using the PC Customization System. Goodbye!");
//                         sc.close();
//                         System.exit(0);
//                     default:
//                         System.out.println("Please choose from 1 to 5 only.");
//                 }
//             } while (true);
//         } else {
//             sc.close();
//         }
//     }
// }