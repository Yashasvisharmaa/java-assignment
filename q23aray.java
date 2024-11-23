import java.util.Scanner;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int smallest = findSmallestNumber(numbers);

        System.out.println("The smallest number in the array is: " + smallest);

        scanner.close();
    }
    public static int findSmallestNumber(int[] numbers) {
        int smallest = numbers[0];  

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];  
            }
        }
        return smallest;
    }
}
