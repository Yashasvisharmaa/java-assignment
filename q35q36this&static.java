class Employee {
    private String name;
    private int age;

    private static int employeeCount = 0;

    public Employee(String name, int age) {
        this.name = name;  
        this.age = age;    
        employeeCount++;  
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Age: " + this.age);
    }

    public static void displayEmployeeCount() {
        System.out.println("Total Employees: " + employeeCount);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 30);
        Employee emp2 = new Employee("Bob", 25);

        emp1.displayInfo(); 
        emp2.displayInfo(); 

        Employee.displayEmployeeCount(); 
    }
}
