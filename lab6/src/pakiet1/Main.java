
package pakiet1;

public class Main {
    public static void main(String[] args){
        DaneListaStrategia daneLista = new DaneListaStrategia();
        System.out.println("=====Wydruk listy======");
        for(DaneWartosci wartosc: daneLista.getLista()){
            System.out.println(wartosc.getImie()+" " + wartosc.getNazwisko()/*+zrodlodancych*/);
        }
        DanePlikStrategia danePlik = new DanePlikStrategia();
        System.out.println("======Wydruk pliku======");
        for(DaneWartosci wartosc: danePlik.getLista()){
            System.out.println(wartosc.getImie()+" " + wartosc.getNazwisko());
        }
        System.out.println("======Strategia======");
        DaneOgolne daneO =new DaneOgolne();
        daneO.setInterface(new DaneListaStrategia());
        for(DaneWartosci wartosc: daneO.getListaDaneOgolne()){
            System.out.println(wartosc.getImie()+" " + wartosc.getNazwisko());
        }
    }
   
}
