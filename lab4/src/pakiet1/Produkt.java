package pakiet1;

import java.math.BigDecimal;

public class Produkt {

    private String nazwa;
    private BigDecimal cena;
    private BigDecimal ilosc;

    public Produkt() {

    }

    public Produkt(String nazwa, BigDecimal cena, BigDecimal ilosc) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public BigDecimal getIlosc() {
        return ilosc;
    }

    public void setIlosc(BigDecimal ilosc) {
        this.ilosc = ilosc;
    }

}
