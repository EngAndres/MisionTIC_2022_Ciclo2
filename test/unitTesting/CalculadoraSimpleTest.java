/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author casierrav
 */
public class CalculadoraSimpleTest {
    
    public CalculadoraSimpleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class CalculadoraSimple.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int n1 = -2;
        int n2 = -5;
        CalculadoraSimple instance = new CalculadoraSimple();
        int expResult = -7;
        int result = instance.sumar(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class CalculadoraSimple.
     */
    @Test
    public void testRestar() {
        System.out.println("restarr");
        int n1 = -2;
        int n2 = -3;
        CalculadoraSimple instance = new CalculadoraSimple();
        int expResult = 1;
        int result = instance.restar(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class CalculadoraSimple.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int n1 = 5;
        int n2 = 8;
        CalculadoraSimple instance = new CalculadoraSimple();
        int expResult = 40;
        int result = instance.multiplicar(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void multiplicacionCerosDeberiaDevolverCero(){
        System.out.println("multiplicacionCerosDeberiaDevolverCero");
        CalculadoraSimple tester = new CalculadoraSimple();
        assertEquals(0, tester.multiplicar(0, 0));
        fail("El resultado de la multiplicación de ceros debe ser cero");
    }
    
}
