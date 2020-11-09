/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalityandhashingapp;

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
public class CourseTest {
    
 Course c1 = new Course(1,"5SDA",21.50);
        Course c2 = new Course(1,"5JAW",21.50);
        Course c3 = new Course(2,"5SDA",21.50);
        Course c4 = c1;
        Course c5 = null;
        
         /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testEquals1() {
        System.out.println("equals");        
        Object obj = c1;
        Course instance = c3;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testEquals2() {
        System.out.println("equals");        
        Object obj = c1;
        Course instance = c4;
        boolean expResult = true;
        boolean result = instance.equals(obj);
        
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testEquals3() {
        System.out.println("equals");        
        Object obj = c5;
        Course instance = c1;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        
        assertEquals(expResult, result);
    }
    
}
