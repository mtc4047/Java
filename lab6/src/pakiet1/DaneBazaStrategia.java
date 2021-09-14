
package pakiet1;

import java.util.ArrayList;


public class DaneBazaStrategia implements DaneInterface {
        ArrayList<DaneWartosci> lista = new java.util.ArrayList();

    public DaneBazaStrategia() {
        lista.add(new DaneWartosci("Tadeusz", "Kowalski", "Baza"));
        lista.add(new DaneWartosci("Adam", "Nowak", "Baza"));
        lista.add(new DaneWartosci("Zbigniew", "Majewski", "Baza"));
        lista.add(new DaneWartosci("Maciej", "Nowakowski", "Baza"));
    }

    @Override
    public ArrayList<DaneWartosci> getLista() {
        return lista;
    }
}
