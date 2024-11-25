import java.util.Scanner;
class Employee {
    int emp_id;
    String emp_name;
    double basic_salary;
    public Employee(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
    }
    public double calculateGrossSalary() {
        double hra = 0.20 * basic_salary; 
        double da = 0.10 * basic_salary;  
        double gross_salary = basic_salary + hra + da;
        return gross_salary;
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int emp_id = scanner.nextInt();
        
        scanner.nextLine(); 
        
        System.out.print("Enter Employee Name: ");
        String emp_name = scanner.nextLine();
        
        System.out.print("Enter Basic Salary: ");
        double basic_salary = scanner.nextDouble();
                Employee employee = new Employee(emp_id, emp_name, basic_salary);
                employee.displayDetails();
                scanner.close();
    }
}
