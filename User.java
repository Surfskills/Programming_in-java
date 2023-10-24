public class User {
    // First name of the user
    String firstName = "";
    
    // Last name of the user
    String lastName = "";
    
    // Age of the user (default value is 20)
    int age = 20;
    
    // Indicates whether the user has money (default value is true)
    boolean hasMoney = true;
    
    public static void main(String[] args) {
        // Amount paid by the user
        double amountPaid = 25.05;
        
        // Convert the amount paid to an integer (truncating the decimal part)
        int amountConverted = (int) amountPaid;
        
        // Amount credited to the user
        double amountCredited = 12;
        
        // Calculate the result by dividing amountPaid by amountCredited
        double result = amountPaid / amountCredited;
        
        // Print the converted amountPaid
        System.out.println("New value: " + amountConverted);
        
        // Print the result of the division
        System.out.print("Result: " + result);
    }
}
