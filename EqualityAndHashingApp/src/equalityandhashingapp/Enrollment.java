/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalityandhashingapp;

import java.util.Date;

/**
 *
 * @author HP Mini
 */
public class Enrollment {   
    
    private String EnrollmentID;
    private Date DateEnrolled;
    private String Semester;
    private Course Course;
    
    public Enrollment(String enrollmentID, Date dateEnrolled, String semester, Course course){
        this.EnrollmentID = enrollmentID;
        this.DateEnrolled = dateEnrolled;
        this.Semester = semester;      
        this.Course = course;
    }
    
    public Enrollment(String enrollmentID, Date dateEnrolled, String semester){
        this(enrollmentID, dateEnrolled, semester, new Course());  
    }
    // no args constructor
    public Enrollment(){
        this("N/A", new Date(), "N/A", new Course());  
    }

    @Override
    public String toString() {
        return "Enrollment{" + "EnrollmentID=" + EnrollmentID + ", DateEnrolled=" + DateEnrolled + ", Semester=" + Semester + ", Course=" + Course.toString() + '}';
    }

    public Course getCourse() {
        return Course;
    }

    public void setCourse(Course Course) {
        this.Course = Course;
    }
    
     public String getEnrollmentID() {
        return EnrollmentID;
    }

    public void setEnrollmentID(String EnrollmentID) {
        this.EnrollmentID = EnrollmentID;
    }

    public Date getDateEnrolled() {
        return DateEnrolled;
    }

    public void setDateEnrolled(Date DateEnrolled) {
        this.DateEnrolled = DateEnrolled;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }
    
}
