public class Car extends  Vehicle {
    private String brand;
    private int horsePower;

    public Car(String color, int dataOfManufacture, int weight, int length, String brand, int horsePower) {
        super(color, dataOfManufacture, weight, length);
        this.brand = brand;
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void steering() {
        System.out.println("steering now!");
    }

    public void changeGears() {
        System.out.println("Changing gears now!");
    }

    public void move(double speed) {
        System.out.println("moving at " + speed);
    }
}
