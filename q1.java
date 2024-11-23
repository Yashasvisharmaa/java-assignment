import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        double temperature, convertedTemperature;

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            temperature = scanner.nextDouble();
            convertedTemperature = (temperature * 9/5) + 32;
            System.out.println(temperature + " Celsius = " + convertedTemperature + " Fahrenheit");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            temperature = scanner.nextDouble();
            convertedTemperature = (temperature - 32) * 5/9;
            System.out.println(temperature + " Fahrenheit = " + convertedTemperature + " Celsius");
        } else {
            System.out.println("Invalid choice. Please choose either 1 or 2.");
        }

        scanner.close();
    }
}
