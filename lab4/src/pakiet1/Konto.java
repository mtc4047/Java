
package pakiet1;

import java.math.BigDecimal;
import java.util.List;

public class Konto {
    private String numerKonta;
    private BigDecimal saldo;
    private List<Operacja> operacje = new java.util.ArrayList();
    public Konto(String numerKonta, BigDecimal saldo) {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
    }
    public void wykonajPlatnosc(BigDecimal kwota){
        Operacja operacja = new Operacja();
        java.util.Date data_operacji = java.util.GregorianCalendar.getInstance().getTime();
        operacja.setDataOperacji(data_operacji);
        operacja.setKwotaOperacji(kwota);
        operacje.add(operacja);
    }
    public BigDecimal obliczSaldo(){
        for(Operacja wartosc:operacje){
            saldo=saldo.add(wartosc.getKwotaOperacji());
        }
        return saldo;
    }
    public String getNumerKonta() {
        return numerKonta;
    }

    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
                String numer="Numer zamowienia:" +this.numerKonta;
        String operacjaInfo="";
        operacjaInfo=operacjaInfo+numer+"\n";
        for(Operacja operacja:operacje){
            String data=operacja.getDataOperacji().toString();
            String kwota = operacja.getKwotaOperacji().toString();
            operacjaInfo=operacjaInfo+data+";"+kwota+"\n";
        }
        return operacjaInfo;
    }
    
}
