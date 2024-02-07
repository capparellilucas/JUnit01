/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit01.entities.DiscountCalculator;
import junit01.service.DiscountCalculatorService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class DiscountCalculatorTest {
    
    public DiscountCalculatorTest() {
    }
    
    DiscountCalculatorService dcs;
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dcs = new DiscountCalculatorService();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void deberiaCalcularDescuentos(){
        assertEquals(90, dcs.calcularDescuento(new DiscountCalculator(100,10)), 0);
    }
}
