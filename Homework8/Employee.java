public class Employee {
    private String name;
    private double salary;

    private static int totalEmployees = 0;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        totalEmployees++;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void printTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }
}