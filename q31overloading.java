public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum of 10 and 20: " + calculator.add(10, 20));              
        System.out.println("Sum of 10, 20, and 30: " + calculator.add(10, 20, 30));       
        System.out.println("Su
