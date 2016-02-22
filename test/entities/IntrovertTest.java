/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jrimland
 */
public class IntrovertTest {
    
    public IntrovertTest() {
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
     * Test of needToMove method, of class Introvert.
     */
    @Test
    public void testIntrovertNeedToMoveWith0Neighbors() {
        System.out.println("needToMove");
        int numNeighbors = 0;
        Introvert instance = new Introvert();
        boolean expResult = false;
        boolean result = instance.needToMove(numNeighbors);
        assertEquals(expResult, result);

    }
    
}
