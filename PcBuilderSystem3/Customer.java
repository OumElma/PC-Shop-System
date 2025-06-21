import java.util.ArrayList;
import java.util.Date;

public class Customer {
    int customerID;
    String fullName;
    int pcId;
    char gender;
    String cusAddress;
    Date dateBirth;
    Date registrationDate;
    String phoneNumber;
    String email;
    String password;
    ArrayList<Component> selectedComponents;

    public Customer(int customerID, String fullName, int pcId, char gender, String cusAddress, 
                    Date dateBirth, String phoneNumber, String email, String password) {
        this.customerID = customerID;
        this.fullName = fullName;
        this.pcId = pcId;
        this.gender = gender;
        this.cusAddress = cusAddress;
        this.dateBirth = dateBirth;
        this.registrationDate = new Date(System.currentTimeMillis());
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.selectedComponents = new ArrayList<>();
    }

    public void addComponent(Component component) {
        selectedComponents.add(component);
    }
}