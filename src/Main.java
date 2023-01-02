public class Main {
    public static void main(String[] args) {
        Ship ship = new Ship(2000, "Stockholm");
        Car car = new Car();
        Plane plane = new Plane(10000, 385);
        ship.PrintInfo();
        car.PrintInfo();
        System.out.println("");
        plane.PrintInfo();
    }
}