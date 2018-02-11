package Fuel.model;
public class Fuel {
   private String nameOfFuel;
   private String stateOfFuel;
   private double price;
   protected double payment;
   
    public Fuel() {
        this("Unknown","Unknown",0.0);
    }
    
    public Fuel(String nameOfFuel, String stateOfFuel) {
        this.nameOfFuel = nameOfFuel;
         this.stateOfFuel = stateOfFuel;
    }

    public Fuel(String nameOfFuel, String stateOfFuel,double price) {
        this.nameOfFuel = nameOfFuel;
        this.stateOfFuel = stateOfFuel;
        this.price=price;
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
  
    public double paymentOfFuel(){
    return payment;
    }
    
    @Override
    public String toString() {
        return "Name : " + nameOfFuel + ", State : " + stateOfFuel + ",  Price "  + price +" baht/unit";
    }
   
   
}
