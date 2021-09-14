/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakiet1;

import java.math.BigDecimal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Filip
 */
public class KontoTest {
    
    public KontoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of wykonajPlatnosc method, of class Konto.
     */
    @Test
    public void testWykonajPlatnosc() {
        System.out.println("wykonajPlatnosc");
        BigDecimal kwota = new BigDecimal(40.0f);
        Konto instance = new Konto("2209090912", new BigDecimal(1000.0f));
        instance.wykonajPlatnosc(kwota);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obliczSaldo method, of class Konto.
     */
    @Test
    public void testObliczSaldo() {
        System.out.println("obliczSaldo");
        Konto instance =  new Konto("2209090912", new BigDecimal(0.0f));
        BigDecimal expResult = new BigDecimal(40.f);
        instance.wykonajPlatnosc(new BigDecimal(10.0f));
        instance.wykonajPlatnosc(new BigDecimal(20.0f));
        BigDecimal result = instance.obliczSaldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumerKonta method, of class Konto.
     */
    @Test
    public void testGetNumerKonta() {
        System.out.println("getNumerKonta");
        Konto instance = new Konto("2209090912", new BigDecimal(0.0f));
        String expResult = "2209090912";
        String result = instance.getNumerKonta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumerKonta method, of class Konto.
     */
    @Test
    public void testSetNumerKonta() {
        System.out.println("setNumerKonta");
        String numerKonta = "2209090912";
        Konto instance = new Konto("2209090912", new BigDecimal(0.0f));
        instance.setNumerKonta(numerKonta);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class Konto.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Konto instance = null;
        BigDecimal expResult = null;
        BigDecimal result = instance.getSaldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldo method, of class Konto.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        BigDecimal saldo = null;
        Konto instance = null;
        instance.setSaldo(saldo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
