package pakiet2;

import pakiet1.*;
public class MainClass {
    public static void main(String[] args){
       // PointXY PunktXY = new PointXY(1,3);
      //  System.out.println(PunktXY.getPoint());
        //System.out.println(PunktXY);
        int distance = UtilClass.obliczOdleglosc(100, 100, 110, 110);
        System.out.println("odległość punktów: " + distance);
    }
}