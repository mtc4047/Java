
package pakiet1;

import java.util.ArrayList;


public class DanePlikStrategia implements DaneInterface {
        java.util.ArrayList<DaneWartosci> lista = new java.util.ArrayList();

    public DanePlikStrategia() {
        lista.add(new DaneWartosci("Tadeusz", "Kowalski", "Plik"));
        lista.add(new DaneWartosci("Adam", "Nowak", "Plik"));
        lista.add(new DaneWartosci("Zbigniew", "Majewski", "Plik"));
        lista.add(new DaneWartosci("Maciej", "Nowakowski", "Plik"));
    }

    @Override
    public ArrayList<DaneWartosci> getLista() {
        return lista;
    }
}
