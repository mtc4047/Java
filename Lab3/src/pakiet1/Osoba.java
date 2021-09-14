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
public class Osoba {
    private String imie ="Wartosc z definicji";
    private String nazwisko ="";
    private String pesel ="";
    private String adres_miasto ="";
    private String adres_ulica ="";
    private String adres_dom ="";
    private String adres_lokal ="";
    private int wiek =0 ;
    private int waga= 0;
    private String [] numery_telefonow;
    private String samochody[];
   /* public Osoba() {
        System.out.println(imie);
        imie="wartosc z konstruktora";
        System.out.println(imie);
    }
    
  /*  public Osoba(String imie,String nazwisko,String pesel,String [] numery_telefonow,int wiek,String []samochody) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.numery_telefonow=numery_telefonow;
        this.wiek=wiek;
        this.samochody=samochody;
    }
    public Osoba(String imie,String nazwisko,String pesel,String...numeryTelefonow) {
        
    }
    /*public Osoba(String imie,String nazwisko,String pesel,String...samochody) {
        
    }*/

    public Osoba(String imie,String nazwisko,String pesel,String adresMiasto) {
        this(imie,nazwisko,pesel,adresMiasto,"");
        
    }
    public Osoba(String imie,String nazwisko,String pesel,String adresMiasto,String adresUlica) {
        this(imie,nazwisko,pesel,adresMiasto,adresUlica,"");
        
    }
    public Osoba(String imie,String nazwisko,String pesel,String adresMiasto,String adresUlica,String adresDom) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.pesel=pesel;
        this.adres_miasto=adresMiasto;
        this.adres_ulica=adresUlica;
        this.adres_dom = adresDom;
        
    }

    @Override
    public String toString() {
        return "Osoba{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", pesel=" + pesel + ", adres_miasto=" + adres_miasto + ", adres_ulica=" + adres_ulica + ", adres_dom=" + adres_dom + '}';
    }
    

    
    
    
}
