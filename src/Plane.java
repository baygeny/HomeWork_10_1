public class Plane extends Vehicle{
    private double height;
    private int quantityPas;

    public Plane(double height, int quantityPas) {
        super(1000000.0, 1000, 2016);
        this.height = height;
        this.quantityPas = quantityPas;
    }


    public void PrintInfo() {
        System.out.println("The flight altitude of this plane is " + height + " m" +
                "\nQuantity of passengers of this plane is " + quantityPas +
                "\nThe price of this plane is $" + getPrice() +
                "\nThe speed of this plane is " + getSpeed() + " km/h" +
                "\nThe issue's year of this plane is " +getYear());
    }
}
