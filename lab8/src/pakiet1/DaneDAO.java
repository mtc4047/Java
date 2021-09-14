/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakiet1;

import java.util.ArrayList;

/**
 *
 * @author Filip
 */
public class DaneDAO {
    public DaneDAO(String nazwaPliku){
        
    }
    public java.util.ArrayList<String> wczytajDane(){
        java.util.ArrayList<String> wierszeDanych=new ArrayList();
        wierszeDanych.add("Paweł,Nowak,Sosnowiec");
        wierszeDanych.add("Rafał,Kowalski,Katowice");
        wierszeDanych.add("Adam,Złoty,Warszawa");
        wierszeDanych.add("Anna,Tomczak,Gdańsk");
        wierszeDanych.add("Kinga,Nowak,Sosnowiec");
        
        return wierszeDanych;
    }
}
