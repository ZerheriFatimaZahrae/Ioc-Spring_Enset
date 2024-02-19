package presentation;

import ext.IDaoImpl2;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        MetierImpl metier=new MetierImpl(new IDaoImpl2());//injection via constructeur
        // injection de depandance
        System.out.println("data:"+metier.calcul());
    }
}
