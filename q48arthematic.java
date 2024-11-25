class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class Main {

    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0; 
            int result;
            System.out.println("Performing division...");
            result = divide(num1, num2); 
            System.out.println("Performing invalid operation...");
            double invalidResult = invalidOperation();  

        } catch (CustomArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static int divide(int a, int b) throws CustomArithmeticException {
        if (b == 0) {
            throw new CustomArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
    public static double invalidOperation() throws CustomArithmeticException {
        double result = Math.log(-1);  
        if (Double.isNaN(result) || Double.isInfinite(result)) {
            throw new CustomArithmeticException("Invalid mathematical operation resulting in NaN or Infinity.");
        }
        return result;
    }
}
