public class Ship extends Vehicle{
    private int quantityPas;
    private String homePort;

    public Ship(int quantityPas, String homePort) {
        super(1044000.0, 25, 1979);
        this.quantityPas = quantityPas;
        this.homePort = homePort;
    }
        public void PrintInfo() {
        System.out.println("The home port of this ship is " + homePort +
                           "\nQuantity of passengers of this ship is " + quantityPas +
                           "\nThe price of this ship is $" + getPrice() +
                           "\nThe speed of this ship is " + getSpeed() + " knots" +
                           "\nThe issue's year of this ship is " +getYear());
    }
}
