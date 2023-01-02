public class Car extends Vehicle {
    public Car() {
        super(25000, 200, 2020);
    }
    public void PrintInfo() {
        System.out.println("\nThe price of this car is $" + getPrice() +
                           "\nThe speed of this car is " + getSpeed() + " km/h" +
                           "\nThe issue's year of this car is " +getYear());
    }
}
