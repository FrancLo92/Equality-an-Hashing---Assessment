/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalityandhashingapp;

import Comparators.CourseSortById;
import Comparators.EnrollmentSortById;
import Comparators.StudentSortById;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
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
        
        //Equality Testing
        //TESTING STUDENT ENTITY Hashcode      
        
        System.out.println("\nStudent entity Hascode");
        Student s1 = new Student("Jhon", "smith","1234567890", 1, "program2",new Date());        
        Student s2 = new Student("Jack", "smith","1234567890", 1, "program2",new Date());
        Student s3 = new Student("Frank", "White","1234567890", 2, "Program3",new Date());
        Student s4 = s1;
        Student s5 = null;
        Student s6 = new Student("Jhon", "smith","1234567890", 1, "program2",new Date());
        
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s6.hashCode());
        
        //TESTING ENROLLMENT ENTITY Hashcode
        
        System.out.println("\nEnrollment entity Hascode");
        Enrollment e1 = new Enrollment(1, new Date(),"D","S1");
        Enrollment e2 = new Enrollment(1, new Date(),"S","S1");
        Enrollment e3 = new Enrollment(2, new Date(),"P","S2");
        Enrollment e4 = e1;
        Enrollment e5 = null;
        Enrollment e6 = new Enrollment(1, new Date(),"D","S1");
        
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());
        System.out.println(e4.hashCode());
        System.out.println(e6.hashCode());
        
        //TESTING COURSE ENTITY Hashcode
        
        System.out.println("\nCourse entity Hascode");
        Course c1 = new Course(1,"5SDA",21.50);
        Course c2 = new Course(1,"5JAW",21.50);
        Course c3 = new Course(2,"5SDA",21.50);
        Course c4 = c1;
        Course c5 = null;
        Course c6 = new Course(1,"5SDA",21.50);
        
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c6.hashCode());  
        
        
        //Comparators Testing
        //TESTING STUDENT ENTITY
        ArrayList<Student> students = new ArrayList<Student>(); 
        students.add(new Student("Jhon", "smith","1234567890", 123, "program2",new Date())); 
        students.add(new Student("Jack", "Deen","1234567850", 321, "program4",new Date()));
        students.add(new Student("Willy", "Lopez","1234567860", 100, "program1",new Date()));
  
        System.out.println("\nStudent Comparator Testing");
        System.out.println("Unsorted"); 
        for (Student s : students) 
            System.out.println("ID= " + s.StudentID +", Name="+ s.getName()); 
  
        Collections.sort(students, new StudentSortById()); 
  
        System.out.println("\nSorted by ID"); 
        for (Student s : students) 
            System.out.println("ID= " + s.StudentID +", Name= "+ s.getName()); 
        
        //Comparators Testing
        //TESTING ENROLLMENT ENTITY
        ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>(); 
        enrollments.add(new Enrollment(234, new Date(),"P","S1")); 
        enrollments.add(new Enrollment(100, new Date(),"D","S2")); 
        enrollments.add(new Enrollment(85, new Date(),"S","S1")); 
  
        System.out.println("\nEnrollment Comparator Testing");
        System.out.println("Unsorted"); 
        for (Enrollment e : enrollments) 
            System.out.println("ID= " + e.EnrollmentID + ", Grade= "+ e.getGrade()); 
  
        Collections.sort(enrollments, new EnrollmentSortById()); 
  
        System.out.println("\nSorted by ID"); 
        for (Enrollment e : enrollments) 
            System.out.println("ID= " + e.EnrollmentID + ", Grade= "+ e.getGrade()); 
        
        //Comparators Testing
        //TESTING STUDENT ENTITY
        ArrayList<Course> courses = new ArrayList<Course>(); 
        courses.add(new Course(150,"5SDA",21.50)); 
        courses.add(new Course(111,"5JAW",21.50)); 
        courses.add(new Course(149,"5MITP",21.50)); 
  
        System.out.println("\nCourse Comparator Testing");
        System.out.println("Unsorted"); 
        for (Course c : courses) 
            System.out.println(c); 
  
        Collections.sort(courses, new CourseSortById()); 
  
        System.out.println("\nSorted by ID"); 
        for (Course c : courses) 
            System.out.println(c); 
  
    }
    
}
