
package pakiet1;


public class DaneTO {
private String nazwisko="";
private String imie="";
private String miasto="";

    public DaneTO(String imie,String nazwisko,String miasto) {
        this.nazwisko=nazwisko;
        this.imie=imie;
        this.miasto=miasto;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

}
