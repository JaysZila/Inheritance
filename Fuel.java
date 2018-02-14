package Fuel.model;

public class Fuel {

    private String nameOfFuel;
    private String stateOfFuel;
    private double price;
    protected double payment;

    public Fuel() {
        System.out.println("Fuel constructor working");
    }

    public Fuel(String nameOfFuel, String stateOfFuel) {
        this.nameOfFuel = nameOfFuel;
        this.stateOfFuel = stateOfFuel;
    }

    public Fuel(String nameOfFuel, String stateOfFuel, double price) {
        this.nameOfFuel = nameOfFuel;
        this.stateOfFuel = stateOfFuel;
        this.price = price;
    }

    public String getNameOfFuel() {
        return nameOfFuel;
    }

    public void setNameOfFuel(String nameOfFuel) {
        this.nameOfFuel = nameOfFuel;
    }

    public String getStateOfFuel() {
        return stateOfFuel;
    }

    public void setStateOfFuel(String stateOfFuel) {
        this.stateOfFuel = stateOfFuel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPayment() {
        return payment;
    }

    public double paymentOfFuel() {
        return payment;
    }

    @Override
    public boolean equals(Object obj) {
        Fuel temp;
        if (obj != null && obj instanceof Fuel) {
            temp = (Fuel) obj;
            if (nameOfFuel.equalsIgnoreCase(temp.nameOfFuel) && stateOfFuel.equalsIgnoreCase(temp.stateOfFuel)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Name : " + nameOfFuel + ", State : " + stateOfFuel + ",  Price " + price + " baht/unit";
    }

}
