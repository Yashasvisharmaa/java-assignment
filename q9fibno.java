import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int terms = scanner.nextInt();

        long firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series up to " + terms + " terms:");

        for (int i = 1; i <= terms; ++i) {
            System.out.print(firstTerm + " ");
            
            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm; 
            secondTerm = nextTerm;  
        }

        scanner.close();
    }
}
