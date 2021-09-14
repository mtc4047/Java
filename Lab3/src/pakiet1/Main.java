/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakiet1;

/**
 *
 * @author Filip
 */
public class Main {
    public static void main(String[] args){
       /* Osoba osoba0 = new Osoba();
        Osoba osoba1 = new Osoba("mariusz","kowalski","767676444","Katowice");
        Osoba osoba2 = new Osoba("mariusz","kowalski","","glowna");*/
       /* Osoba osoba4 = new Osoba("mariusz","kowalski","767676444","Katowice");
        Osoba osoba5 = new Osoba("mariusz","kowalski","767676444","Katowice","1 Maja");
        System.out.println(osoba4);*/
      /* Osoba2 osoba6 = new Osoba2();
       osoba6.setImie("rafał");
       osoba6.setNazwisko("xd");
       System.out.println(osoba6);*/
      OsobaClass osoba7 = new OsobaClass.OsobaBuilder("tomasz", "kowalski", "75465464").adresMiasto("katowice").build();
      
}
    
}