/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalityandhashingapp;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP Mini
 */
public class EnrollmentTest {
    
    Enrollment e1 = new Enrollment(1, new Date(),"D","S1");
    Enrollment e2 = new Enrollment(1, new Date(),"S","S1");
    Enrollment e3 = new Enrollment(2, new Date(),"P","S2");
    Enrollment e4 = e1;
    Enrollment e5 = null;
    
   /**
     * Test of equals method, of class Enrollment.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = e1;
        Enrollment instance = e2;
        boolean expResult = true;
        boolean result = instance.equals(obj);
        
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Enrollment.
     */
    @Test
    public void testEquals1() {
        System.out.println("equals");        
        Object obj = e1;
        Enrollment instance = e3;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Enrollment.
     */
    @Test
    public void testEquals2() {
        System.out.println("equals");        
        Object obj = e1;
        Enrollment instance = e4;
        boolean expResult = true;
        boolean result = instance.equals(obj);
        
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Enrollment.
     */
    @Test
    public void testEquals3() {
        System.out.println("equals");        
        Object obj = e5;
        Enrollment instance = e1;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        
        assertEquals(expResult, result);
    }
    
}
