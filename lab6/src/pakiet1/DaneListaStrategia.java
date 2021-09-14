package pakiet1;

import java.util.ArrayList;

public class DaneListaStrategia implements DaneInterface {

    java.util.ArrayList<DaneWartosci> lista = new java.util.ArrayList();

    public DaneListaStrategia() {
        lista.add(new DaneWartosci("Tadeusz", "Kowalski", "Lista"));
        lista.add(new DaneWartosci("Adam", "Nowak", "Lista"));
        lista.add(new DaneWartosci("Zbigniew", "Majewski", "Lista"));
        lista.add(new DaneWartosci("Maciej", "Nowakowski", "Lista"));
    }

    @Override
    public ArrayList<DaneWartosci> getLista() {
        return lista;
    }
}
