public class Car {

    private String model;
    private int year;
    private String color;

    public Car() {
        this.model = "Unknown";
        this.year = 0;
        this.color = "Unknown";
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Unknown"; 
    }

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Color: " + color);
    }

    public static void main(String[] args) {
        Car car1 = new Car();  
        Car car2 = new Car("Toyota", 2022);  
        Car car3 = new Car("Honda", 2021, "Red");  

        System.out.println("Car 1 Details:");
        car1.displayDetails();
        
        System.out.println("\nCar 2 Details:");
        car2.displayDetails();
        
        System.out.println("\nCar 3 Details:");
        car3.displayDetails();
    }
}
