public class Vehicle {
    private double price;
    private int speed;
    private int year;

    public Vehicle(double price, int speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }
}
