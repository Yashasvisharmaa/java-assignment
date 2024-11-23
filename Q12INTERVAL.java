import java.util.Scanner;

public class MultiplesOfTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the interval: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the interval: ");
        int end = scanner.nextInt();

        if (start > end) {
            System.out.println("Invalid interval. The start should be less than or equal to the end.");
        } else {
            System.out.println("Multiples of 10 between " + start + " and " + end + " are:");

            for (int i = start; i <= end; i++) {
                if (i % 10 == 0) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
