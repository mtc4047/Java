/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakiet1;

import java.math.BigDecimal;

public class JavaApplicationPIOJunit {
         public static void main(String[] args){
             Konto konto = new Konto("21 5431 9211 2121 2333 2123 0921",new BigDecimal("1200.00"));
             konto.wykonajPlatnosc(new BigDecimal("200.00"));
             konto.wykonajPlatnosc(new BigDecimal("500.00"));
             System.out.println("Saldo konta: "+ konto.obliczSaldo().toString());
         }
}
