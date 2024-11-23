import java.util.Scanner;

public class AlternateNumbersInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        printAlternateNumbers(numbers);

        scanner.close();
    }

    public static void printAlternateNumbers(int[] numbers) {
        System.out.println("Every alternate number in the array is:");
        
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); 
    }
}
