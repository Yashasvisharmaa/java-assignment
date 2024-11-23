public class NoArgumentConstructor {
    
    private String message;

    public NoArgumentConstructor() {
        message = "Hello, this is a message from the 0-argument constructor!";
    }

    public void displayMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        NoArgumentConstructor obj = new NoArgumentConstructor();

        obj.displayMessage();
    }
}
