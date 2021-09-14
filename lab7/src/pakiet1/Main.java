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
public class Main {
     public static void main(String[] args){
         ObiektObserwowany obiektObserwowany = new ObiektObserwowany();
         ObiektObserwujacyA obserwatorA = new ObiektObserwujacyA();
         ObiektObserwujacyB obserwatorB = new ObiektObserwujacyB();
         
         obiektObserwowany.dodajObserwatora(obserwatorA);
         obiektObserwowany.dodajObserwatora(obserwatorB);
         obiektObserwowany.dodajObserwatora(new ObiektObserwujacyA());
         
         System.out.println("Zmiana stanu obiektu obserwowanego");
         obiektObserwowany.setStatus(2);
         System.out.println("Usuniecie obserwatora");
         obiektObserwowany.usunObserwatora(obserwatorA);
         obiektObserwowany.setStatus(3);
         
         System.out.println("Dodanie obserwatorow");
         obiektObserwowany.dodajObserwatora(new ObiektObserwujacyA());
         obiektObserwowany.dodajObserwatora(new ObiektObserwujacyA());
         obiektObserwowany.setStatus(4);
     }
}
