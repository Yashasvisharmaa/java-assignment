public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Demonstrating NegativeArraySizeException:");
            int size = -5;  
            int[] arr = new int[size];  
            System.out.println("Demonstrating ArithmeticException:");
            int a = 10;
            int b = 0;  
            int result = a / b; 
            System.out.println("Result: " + result);  
            
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Cannot create an array with a negative size.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic exception occurred. Cannot divide by zero.");
        }
    }
}
