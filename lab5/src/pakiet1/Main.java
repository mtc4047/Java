/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakiet1;

import java.math.BigDecimal;

/**
 *
 * @author Filip
 */
public class Main {
    public static void main(String[] args){
        java.util.List<Pracownik> pracownicy = new java.util.ArrayList();
        pracownicy.add(
                new Pracownik("Rafał","Kowalski"));
        pracownicy.add(
                new Pracownik("Sebastian","Drzewiecki"));
        pracownicy.add(
                new Kierownik("Tomasz","Nowak",new BigDecimal("2000.0")));
        pracownicy.add(
                new DyrektorOddzialu("Mariusz","Nowak",new BigDecimal("2000.0"),"Katowice"));
        for(Pracownik zmienna: pracownicy){
            System.out.println(zmienna.toString());
            zmienna.pracuj();
    }
    }
    
}
