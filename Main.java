import java.util.Scanner;
import user.BaseUser;
import user.AdminUser;

public class Main {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        BankAccount fredsAccount = new BankAccount("1234567890", 1000.0); // Replace with appropriate values
        BaseUser adminUser = new AdminUser(firstName: "null", lastName: "null");
        System.out.println("Bank Account Number: v" + fredsAccount.getAccountNumber());
        System.out.println("Final Balance: $" + fredsAccount.getBalance());
    
    }
    
}
