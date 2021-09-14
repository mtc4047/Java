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
public class OsobaSingleton {
    private static OsobaSingleton instance;
    private String imie = "";
    private String nazwisko = "";
    private String pesel = "";
    private OsobaSingleton(){}
    public static OsobaSingleton getInstance()
    {
        if(instance==null)
        {
            instance = new OsobaSingleton();
            instance.imie="imieSingleton";
            instance.nazwisko="nazwiskoSingleton";
            instance.pesel="peselSingleton";
        }
        return instance;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }
    
    
    
}
