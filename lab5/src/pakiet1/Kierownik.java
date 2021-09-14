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
public class Kierownik extends Pracownik{
    private BigDecimal dodatek;

    public Kierownik(String imie, String nazwisko) {
        super(imie, nazwisko);
    }
    
    public Kierownik(String imie, String nazwisko,BigDecimal dodatek) {
        super(imie, nazwisko);
        this.dodatek=dodatek;
    }

    public BigDecimal getDodatek() {
        return dodatek;
    }

    public void setDodatek(BigDecimal dodatek) {
        this.dodatek = dodatek;
    }
    public void pracuj(){
        System.out.println("Kierownik nadzoruje pracowników");
    }

    @Override
    public String toString() {
        String pracownikDescription = super.toString();
        String description = pracownikDescription + " Dodatek: " + dodatek.toString();     
        return description;
    }
    
    
}
