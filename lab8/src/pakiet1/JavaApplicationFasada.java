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
public class JavaApplicationFasada {
     public static void main(String[] args){
         
         System.out.println("Bez zastosowania klasy Fasady");
         DaneDAO daneDao=new DaneDAO("plik.xml");
         ArrayList listaDanych=daneDao.wczytajDane();
         DaneFormatowanie daneFormatowanie = new DaneFormatowanie(",");
         daneFormatowanie.formatujDane(listaDanych);
         daneFormatowanie.wyswietlDane();
         
         System.out.println("Zastosowanie klasy Fasady");
         FacadeClass facadeClass = new FacadeClass(new DaneDAO("plik.xml"),new DaneFormatowanie(","));
         facadeClass.pokazDane();
     }
}
