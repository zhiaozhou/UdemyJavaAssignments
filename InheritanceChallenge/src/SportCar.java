public class SportCar extends Car {
    private double price;

    public SportCar(String color, int dataOfManufacture, int weight, int length, String brand, int horsePower, double price) {
        super(color, dataOfManufacture, weight, length, brand, horsePower);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void steering() {
        super.steering();
    }

    @Override
    public void changeGears() {
        super.changeGears();
    }

    @Override
    public void move(double speed) {
        super.move(speed);
    }
}
