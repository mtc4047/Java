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
public class DaneOgolne {

    DaneInterface daneInterfejs;

    public DaneOgolne() {
          this.daneInterfejs=new DaneListaStrategia();

    }

    public void setInterface(DaneInterface daneInterfejs) {
        this.daneInterfejs = daneInterfejs;
    }

    public java.util.ArrayList<DaneWartosci> getListaDaneOgolne() {
        return daneInterfejs.getLista();
    }

}
