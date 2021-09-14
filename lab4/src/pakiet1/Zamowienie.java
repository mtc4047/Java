
package pakiet1;

import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
public class Zamowienie{
    protected String numerZamowienia;
    protected Date dataZamowienia;
    protected BigDecimal kwota_zamowienia;
    protected List<Produkt> produkty= new java.util.ArrayList();
    private Kontrahent kontrahent;
    
    public Zamowienie() {
    }
    public void dodajProdukt(Produkt produkt){
        produkty.add(produkt);
       // this.kwota_zamowienia=kwota_zamowienia.add(produkt.getCena());
        
    }
    public void usunProdukt(Produkt produkt){
        produkty.remove(produkt);
        //this.kwota_zamowienia=kwota_zamowienia.subtract(produkt.getCena());
    }
    public void wykonajZlecenie(Konto konto){
        BigDecimal kwotaZamowieniaLokalna=new BigDecimal(0.0f);
        for(Produkt produkt:produkty){
            kwotaZamowieniaLokalna=kwotaZamowieniaLokalna.add(produkt.getCena());
            
        }
        konto.wykonajPlatnosc(kwotaZamowieniaLokalna);
    }

    public String getNumerZamowienia() {
        return numerZamowienia;
    }

    public void setNumerZamowienia(String numerZamowienia) {
        this.numerZamowienia = numerZamowienia;
    }

    public Date getDataZamowienia() {
        return dataZamowienia;
    }

    public void setDataZamowienia(Date dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }

    public BigDecimal getKwota_zamowienia() {
        return kwota_zamowienia;
    }

    public void setKwota_zamowienia(BigDecimal kwota_zamowienia) {
        this.kwota_zamowienia = kwota_zamowienia;
    }

    public Kontrahent getKontrahent() {
        return kontrahent;
    }

    public void setKontrahent(Kontrahent kontrahent) {
        this.kontrahent = kontrahent;
    }

    @Override
    public String toString() {
        String numer="Numer zamowienia:" +this.numerZamowienia;
        String produktInfo="";
        produktInfo=produktInfo+numer+"\n";
        for(Produkt produkt:produkty){
            String nazwa=produkt.getNazwa();
            String kwota = produkt.getCena().toString();
            produktInfo=produktInfo+nazwa+";"+kwota+"\n";
        }
        return produktInfo;
    }
    
}
