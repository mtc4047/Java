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
public class DyrektorOddzialu extends Kierownik{
    private String oddzial;
    public void pracuj(){
        System.out.println("Dyrektor zarządza oddziałem");
    }

    public DyrektorOddzialu(String imie, String nazwisko, BigDecimal dodatek) {
        super(imie, nazwisko, dodatek);
    }
    
    public DyrektorOddzialu(String imie,String nazwisko,BigDecimal dodatek,String oddzial) {
        super(imie,nazwisko,dodatek);
        this.oddzial = oddzial;
    }
    public String toString() {
        String pracownikDescription = super.toString();
        String description = pracownikDescription + " Oddzial: " + oddzial;       
        return description;
    }
}
