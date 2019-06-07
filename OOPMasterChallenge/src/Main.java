class Hamburger {
    private String rollType;
    private double price;
    private String meat;
    private String name;
    private int numAdditions = 0;

    public Hamburger(String rollType, double price, String meat, String name) {
        this.rollType = rollType;
        this.price = price;
        this.meat = meat;
        this.name = name;
    }

    public void changePrice(double additionalPrice) {
        this.price += additionalPrice;
    }

    public void addAdditions() {
        this.numAdditions ++;
    }

    public void add(String addition) {
        if (numAdditions < 4) {
        switch (addition) {
            case "lettuce":
                price += 2.99;
                break;
            case "tomato":
                price += 1.99;
                break;
            case "carrot":
                price += 0.99;
                break;
            case "onion":
                price += 0.49;
                break;
        }
        numAdditions ++;
        } else {
            System.out.println("You've already had 4 additions!");
        }
    }

    public String getRollType() {
        return rollType;
    }

    public double getPrice() {
        return price;
    }

    public String getMeat() {
        return meat;
    }

    public String getName() {
        return name;
    }

    public int getNumAdditions() {
        return numAdditions;
    }
}

class HealthyBurger extends Hamburger {
    public HealthyBurger(double price, String meat, String name) {
        super("brown rye", price, meat, name);
    }

    @Override
    public void add(String addition) {
        if (super.getNumAdditions() < 6) {
            switch (addition) {
                case "guacamole":
                    super.changePrice(2.99);
                    break;
                case "steak":
                    super.changePrice(5.99);
                    break;
            }
            super.addAdditions();
        } else {
            System.out.println("You've already had 6 additions!");
        }
    }
}

public class Main {
}
