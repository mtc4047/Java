/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakiet1;

import java.util.ArrayList;


public class DaneFormatowanie {
    String regex="";
    ArrayList<DaneTO> listaDanych = new ArrayList();

    public DaneFormatowanie(String regex) {
        this.regex=regex;
    }
    
    public ArrayList<DaneTO> formatujDane(ArrayList<String> wierszeDanych){
        for(String wart:wierszeDanych){
            String[] kolumny = wart.split(regex);
            listaDanych.add(new DaneTO(kolumny[0],kolumny[1],kolumny[2]));
        }
        return listaDanych;
    }
    
    public void wyswietlDane(){
        System.out.println("| Imię:            "+"| Nazwisko:        "+"| Miasto:          |");
        
        for (DaneTO wiersz:listaDanych){
            String kolumna="|x              ";
            int i = kolumna.length();
            String kolumnaImie=kolumna.replaceFirst("x", wiersz.getImie()).substring(0,19);
            String kolumnaNazwisko=kolumna.replaceFirst("x", wiersz.getNazwisko()).substring(0,19);
            String kolumnaMiasto=kolumna.replaceFirst("x", wiersz.getMiasto()).substring(0,19);
            
            System.out.println(kolumnaImie + kolumnaNazwisko + kolumnaMiasto + "|");
        }
    }
    
}
