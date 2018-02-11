package Fuel.model;
public class Gas extends Fuel{
    private double pressure;
    
    public Gas(String nameOfFuel, String stateOfFuel, double price ,double pressure) {
        super(nameOfFuel, stateOfFuel, price);
        this.pressure = pressure;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
     @Override
    public double paymentOfFuel() {
        return payment;
    }
     @Override
    public String toString() {
    return "Name : " + getNameOfFuel() + ", State : " + getStateOfFuel() + " , Pressure : "+pressure+ ",  Price " + getPrice()+" baht/unit";
    }

    
}
