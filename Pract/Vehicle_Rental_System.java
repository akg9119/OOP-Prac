package Pract;

abstract class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void start() {
        System.out.print(brand + " " + model + " " + "started.");
    }

    public void stop() {
        System.out.print(brand + " " + model + " " + "stoped.");
    }

    public abstract double calculateRent(int hours);

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    private double ratePerHour = 15.0;

    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public double calculateRent(int hours) {
        return hours * ratePerHour;
    }

}

class Bike extends Vehicle {
    private double ratePerHour = 10.0;

    public Bike(String brand, String model) {
        super(brand, model);
    }

    @Override
    public double calculateRent(int hours) {
        return hours * ratePerHour;
    }

}

class Scooter extends Vehicle {
    private double ratePerHour = 5.0;

    public Scooter(String brand, String model) {
        super(brand, model);
    }

    @Override
    public double calculateRent(int hours) {
        return hours * ratePerHour;
    }

}

public class Vehicle_Rental_System {
    public static void main(String[] args) {
          Vehicle s =new Scooter("Honda", "Activa");
          Vehicle b= new Bike("Yamaha", "FZ");
          Vehicle c=new Car("Toyota", "Camry");

          rentVehical(s,4);
           rentVehical(b,4);
            rentVehical(c,4);

    }
    public static void rentVehical(Vehicle vehicle, int h){

        vehicle.start();
        vehicle.displayDetails();
        double rent = vehicle.calculateRent(h);
        System.out.println("Rent for " + h + " hours: $" + rent);
        vehicle.stop();
        System.out.println("----------------------------------");
    }
}
