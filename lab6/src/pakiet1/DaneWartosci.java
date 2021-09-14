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
public class DaneWartosci {
    private String imie="";
    private String nazwisko="";
    private String zrodloDanych="";

    public DaneWartosci(String imie,String nazwisko,String zrodloDanych) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.zrodloDanych=zrodloDanych;
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

    public String getZrodloDanych() {
        return zrodloDanych;
    }

    public void setZrodloDanych(String zrodloDanych) {
        this.zrodloDanych = zrodloDanych;
    }

    
    
}
