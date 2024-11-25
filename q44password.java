import java.util.Scanner;
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String correctPassword = "password123"; 
        
        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            
            if (username.length() < 6) {
                throw new InvalidCredentialsException("Username must be at least 6 characters.");
            }
                        System.out.print("Enter password: ");
            String password = scanner.nextLine();
            
            if (!password.equals(correctPassword)) {
                throw new InvalidCredentialsException("Password does not match.");
            }
            
                        System.out.println("Login successful!");
        } catch (InvalidCredentialsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
