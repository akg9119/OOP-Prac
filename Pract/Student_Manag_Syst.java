package Pract;
// Person class represents a generic person with basic attributes.
// Demonstrates encapsulation by making fields private and providing getters/setters.
class Person {
    // Private fields for encapsulation
    private String name;
    private int age;
    private String gender;

    // Constructor to initialize Person object
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for gender
    public String gender() {
        return gender;
    }

    // Setter for gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

// Student class extends Person, demonstrating inheritance.
// Adds rollNumber and marks fields specific to students.
class Student extends Person {
    // Private fields for encapsulation
    private int rollNumber;
    private int marks;

    // Constructor to initialize Student object
    public Student(String name, int age, String gender, int rollNumber, int marks) {
        super(name, age, gender); // Calls constructor of Person (inheritance)
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getter for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    // Setter for rollNumber
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }

    // Setter for marks
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Overriding display method to show student details (polymorphism)
    @Override
    public void display() {
        super.display(); // Calls display method of Person
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks > 90)
            return "A grade";
        else if (marks <= 90 && marks > 70)
            return "B grade";
        else if (marks <= 70 && marks > 40)
            return "C grade";
        else
            return "Fail";
    }
}

// Main class to test the Student Management System
public class Student_Manag_Syst {
    public static void main(String[] args) {
        // Creating a Student object
        Student s = new Student("Aniket", 22, "Male", 22, 60);
        // Displaying student details
        s.display();
    }
}