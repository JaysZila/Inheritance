package Fuel.model;

public class Oil extends Fuel {

    private String color;

    public Oil(String nameOfFuel, String stateOfFuel, double price, String color) {
        super(nameOfFuel, stateOfFuel, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double paymentOfFuel() {
        payment = getPrice() + getPrice()*(7/100);
        return payment;
    }

    @Override
    public String toString() {
    return super.toString()+ "Color : "+color;
    }

}
