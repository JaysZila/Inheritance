package Fuel.view;

import Fuel.model.Fuel;
import Fuel.model.Gas;
import Fuel.model.Oil;

public class TestFuel {
    public static void main(String[] args) {
        Fuel f1 = new Fuel("Gasohol91","Liquid",27.19);
        Fuel f2 = new Fuel("Gasohol91","Liquid",27.19);
        Gas  f3 = new Gas();
        Gas  f4 =new Gas("Gasohol91","Liquid",27.19,12);
        System.out.println(f1.equals(f2));
        System.out.println(f3);
        System.out.println(f4);
    }
}
