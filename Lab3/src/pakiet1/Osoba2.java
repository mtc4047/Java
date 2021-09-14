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
public class Osoba2 {
    private String imie ="";
    private String nazwisko ="";

    public void setImie(String imie){
        this.imie=imie;
    }
    public String getImie(){
        return imie;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko=nazwisko;
    }
    public String getNazwisko(){
        return nazwisko;
    }

    @Override
    public String toString() {
        return "Osoba2{" + "imie=" + imie + ", nazwisko=" + nazwisko + '}';
    }
    
}
