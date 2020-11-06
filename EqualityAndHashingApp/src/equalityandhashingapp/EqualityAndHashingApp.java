/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalityandhashingapp;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author HP Mini
 */
public class EqualityAndHashingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //TESTING STUDENT ENTITY      
        Student s1 = new Student("Jhon", "smith","1234567890", "1", "program2",new Date());        
        Student s2 = new Student("Jack", "smith","1234567890", "1", "program2",new Date());
        Student s3 = new Student("Frank", "White","1234567890", "2", "Program3",new Date());
        Student s4 = s1;
        Student s5 = null;
        Student s6 = new Student("Jhon", "smith","1234567890", "1", "program2",new Date());
        System.out.println("Student Testing");
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3));//false
        System.out.println(s2.equals(s3));//false
        System.out.println(s1.equals(s4));// true
        System.out.println(s1.equals(s5));//false
        System.out.println(s1.equals(s6));//true
        
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s6.hashCode());
        
        //TESTING ENROLLMENT ENTITY
        Enrollment e1 = new Enrollment("1", new Date(),"D","S1");
        Enrollment e2 = new Enrollment("1", new Date(),"S","S1");
        Enrollment e3 = new Enrollment("2", new Date(),"P","S2");
        Enrollment e4 = e1;
        Enrollment e5 = null;
        Enrollment e6 = new Enrollment("1", new Date(),"D","S1");
        System.out.println("Enrollment Testing");
        System.out.println(e1.equals(e2)); //true
        System.out.println(e1.equals(e3));//false
        System.out.println(e2.equals(e3));//false
        System.out.println(e1.equals(e4));// true
        System.out.println(e1.equals(e5));//false
        System.out.println(e1.equals(e6));//true
        
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());
        System.out.println(e4.hashCode());
        System.out.println(e6.hashCode());
        
        //TESTING COURSE ENTITY
        //Creating 4 Course Objects
        Course c1 = new Course("1","5SDA",21.50);
        Course c2 = new Course("1","5JAW",21.50);
        Course c3 = new Course("2","5SDA",21.50);
        Course c4 = c1;
        Course c5 = null;
        Course c6 = new Course("1","5SDA",21.50);
        System.out.println("Course Testing");
        System.out.println(c1.equals(c2)); //true
        System.out.println(c1.equals(c3));//false
        System.out.println(c2.equals(c3));//false
        System.out.println(c1.equals(c4));// true
        System.out.println(c1.equals(c5));//false
        System.out.println(c1.equals(c6));//true
        
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c6.hashCode());      
    }
    
}
