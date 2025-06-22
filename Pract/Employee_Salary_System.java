package Pract;

abstract class Employee {
    protected String name;
    protected String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();

       public void printDetails() {
        System.out.println("Employee: " + name + " | ID: " + id);
        System.out.println("Salary: ₹" + calculateSalary());
        System.out.println("---------------------------");
    }

}

class FullTimeEmployee extends Employee {
    private double fixedSalary;

    public FullTimeEmployee(String name, String id, double fixedSalary) {
        super(name, id);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary;
    }
}
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, String id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

class Intern extends Employee {
    private double stipend;

    public Intern(String name, String id, double stipend) {
        super(name, id);
        this.stipend = stipend;
    }

    @Override
    public double calculateSalary() {
        return stipend;
    }
}
// Task 3: Employee Salary System
// OOP Concepts: Inheritance, Polymorphism, Abstraction
// Description:
// Abstract class Employee with name, id, and abstract method calculateSalary().
// Create child classes: FullTimeEmployee with fixed salary, PartTimeEmployee with hourly wage, Intern with stipend.
// Use polymorphism to calculate and print salary details.
public class Employee_Salary_System {
    public static void main(String[] args) {
        Employee fullTimeEmp = new FullTimeEmployee("Alice", "FT001", 50000);
        Employee partTimeEmp = new PartTimeEmployee("Bob", "PT002", 200, 80);
        Employee intern = new Intern("Charlie", "IN003", 15000);

        fullTimeEmp.printDetails();
        partTimeEmp.printDetails();
        intern.printDetails();
    }
}
