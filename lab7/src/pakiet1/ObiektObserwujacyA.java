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
public class ObiektObserwujacyA implements InterfaceObserwator{
    int statusObiektuObserwowanego = 0;
    @Override
    public void aktualizuj(int status){
        this.statusObiektuObserwowanego=status;
        pokazStan();
    }
    public void pokazStan(){
        System.out.println("Obiekt obserwujacy A - stan po zmianie: " 
                + statusObiektuObserwowanego);
    }
}
