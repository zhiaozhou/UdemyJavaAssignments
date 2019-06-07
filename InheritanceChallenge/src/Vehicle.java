public class Vehicle {
    private String color;
    private int dataOfManufacture;
    private int weight;
    private int length;

    public Vehicle(String color, int dataOfManufacture, int weight, int length) {
        this.color = color;
        this.dataOfManufacture = dataOfManufacture;
        this.weight = weight;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public int getDataOfManufacture() {
        return dataOfManufacture;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }
}
