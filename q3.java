import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        
        double max = num1;

        if (num2 > max) {
            max = num2;  
        }

        if (num3 > max) {
            max = num3;  
        }

        System.out.println("The maximum number is: " + max);

        scanner.close();
    }
}
