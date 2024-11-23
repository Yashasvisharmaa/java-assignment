public class ParameterizedConstructor {

    private String name;
    private int age;

    public ParameterizedConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        ParameterizedConstructor person = new ParameterizedConstructor("Alice", 25);

        person.displayDetails();
    }
}
