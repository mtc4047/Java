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
public class Pracownik {
    private String imie,nazwisko;
    private BigDecimal pensja;

    public Pracownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    
    @Override
    public String toString() {
        return "Pracownik " + "imie=" + imie + ", nazwisko=" + nazwisko;
    }
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public BigDecimal getPensja() {
        return pensja;
    }

    public void setPensja(BigDecimal pensja) {
        this.pensja = pensja;
    }
    public void pracuj(){
        System.out.println("Pracownik wykonuje pracę");
    }
}
