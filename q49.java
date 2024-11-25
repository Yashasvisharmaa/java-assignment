import java.util.HashMap;
import java.util.Scanner;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}
public class CapitalFinder {
    public static String getCapital(String country) throws NoMatchFoundException {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("United States", "Washington, D.C.");
        capitals.put("Canada", "Ottawa");
        capitals.put("United Kingdom", "London");
        capitals.put("India", "New Delhi");
        capitals.put("Australia", "Canberra");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Japan", "Tokyo");
        capitals.put("China", "Beijing");
        capitals.put("Brazil", "Brasília");
        if (!capitals.containsKey(country)) {
            throw new NoMatchFoundException("No match found for country: " + country);
        }
        return capitals.get(country);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of a country: ");
        String country = scanner.nextLine().trim();
        try {
            String capital = getCapital(country);
            System.out.println("The capital of " + country + " is " + capital + ".");
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}