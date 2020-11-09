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
public class StudentTest {
    
    Student s1 = new Student("Jhon", "smith","1234567890", 1, "program2",new Date());        
    Student s2 = new Student("Jack", "smith","1234567890", 1, "program2",new Date());
    Student s3 = new Student("Frank", "White","1234567890", 2, "Program3",new Date());
    Student s4 = s1;
    Student s5 = null;
    
    
    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = s1;
        Student instance = s2;
        boolean expResult = true;
        boolean result = instance.equals(obj);
        
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals1() {
        System.out.println("equals");        
        Object obj = s1;
        Student instance = s3;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals2() {
        System.out.println("equals");        
        Object obj = s1;
        Student instance = s4;
        boolean expResult = true;
        boolean result = instance.equals(obj);
        
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals3() {
        System.out.println("equals");        
        Object obj = s5;
        Student instance = s1;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        
        assertEquals(expResult, result);
    }
}
