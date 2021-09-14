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
public class OsobaClass {
    //pola wymgane
    private String imie ="";
    private String nazwisko ="";
    private String pesel ="";
    //pola niewymagane
    private String adresMiasto ="";
    //varargs
    private String [] numery_telefonow;
    private String samochody[];

    private OsobaClass(OsobaBuilder builder) {
        imie=builder.imie;
        nazwisko=builder.nazwisko;
        pesel=builder.pesel;
        adresMiasto=builder.adresMiasto;
        numery_telefonow=builder.numery_telefonow;
        samochody=builder.samochody;
    }
    public static class OsobaBuilder{
        private String imie ="";
    private String nazwisko ="";
    private String pesel ="";
    //pola niewymagane
    private String adresMiasto ="";
    //varargs
    private String [] numery_telefonow;
    private String samochody[];
    public OsobaBuilder(String imie,String nazwisko, String pesel)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.pesel=pesel;
    }
    public OsobaBuilder imie(String imie){
        this.imie=imie;
        return this;
    }
    public OsobaBuilder nazwisko(String nazwisko){
        this.nazwisko=nazwisko;
        return this;
    }
    public OsobaBuilder pesel(String pesel){
        this.pesel=pesel;
        return this;
    }
    public OsobaBuilder adresMiasto(String adresMiasto){
        this.adresMiasto=adresMiasto;
        return this;
    }
    public OsobaBuilder numeryTelefonow(String...numery_telefonow){
        this.numery_telefonow=numery_telefonow;
        return this;
    }
    public OsobaBuilder samochody(String...samochody){
        this.samochody=samochody;
        return this;
    }
    public OsobaClass build(){
        return new OsobaClass(this);
    }
    }
    
    
}
