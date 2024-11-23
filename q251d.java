import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateAndFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        findDuplicatesAndFrequency(numbers);

        scanner.close();
    }

    public static void findDuplicatesAndFrequency(int[] numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate elements and their frequencies:");
        boolean foundDuplicates = false;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {  
                System.out.println("Element: " + entry.getKey() + " | Frequency: " + entry.getValue());
                foundDuplicates = true;
            }
        }

        if (!foundDuplicates) {
            System.out.println("No duplicate elements found.");
        }
    }
}
