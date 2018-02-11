package Fuel.view;

import Fuel.model.Fuel;
import Fuel.model.Gas;
import Fuel.model.Oil;

public class TestFuel {
    public static void main(String[] args) {
        Oil f1 = new Oil ("Gasohol 91","Liquid",27.19,"Green");
        Gas f2 = new Gas ("LPG","Gas",13.5,20);
        
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
