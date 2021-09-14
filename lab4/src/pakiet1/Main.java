
package pakiet1;


public class Main {
    public static void main(String[] args){
        Kontrahent kontrahent = new Kontrahent();
        kontrahent.setImie("Jan");
        kontrahent.setNazwisko("Kowalski");
        kontrahent.setNazwaFirmy("GlobalIT");
        kontrahent.setNip("3211233223");
        kontrahent.setNumerKonta("21 5456 3344 2121 2334 4455 1023");
        Konto konto = new Konto ("21 4567 9211 2345 6567 3411 4441",new java.math.BigDecimal("1200.00"));
        Produkt produkt1 = new Produkt("komputer",new java.math.BigDecimal("1200.00"),new java.math.BigDecimal("2.00"));
        Produkt produkt2 = new Produkt("drukarka",new java.math.BigDecimal("800.00"),new java.math.BigDecimal("1.00"));
        Produkt produkt3 = new Produkt("monitor",new java.math.BigDecimal("1000.00"),new java.math.BigDecimal("2.00"));
        Zamowienie zamowienie = new Zamowienie();
        zamowienie.setNumerZamowienia("210-02-12");
        zamowienie.setDataZamowienia(java.util.GregorianCalendar.getInstance().getTime());
        zamowienie.setKontrahent(kontrahent);
        zamowienie.dodajProdukt(produkt1);
        zamowienie.dodajProdukt(produkt2);
        zamowienie.dodajProdukt(produkt3);
        zamowienie.wykonajZlecenie(konto);
        System.out.println(zamowienie.toString());
        System.out.println(konto.toString());
        
        
        
        
        
        
        
        
        
        
        /* OsobaSingleton osobaSingleton1 = OsobaSingleton.getInstance();
        OsobaSingleton osobaSingleton2 = OsobaSingleton.getInstance();
        OsobaSingleton osobaSingleton3 = OsobaSingleton.getInstance();
        osobaSingleton3.setImie("X");
        String s1 = osobaSingleton1.getImie();
        String s2 = osobaSingleton2.getImie();
        System.out.println(s1);
        System.out.println(s2);*/
    }
}
