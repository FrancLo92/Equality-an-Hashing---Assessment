/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalityandhashingapp;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author HP Mini
 */
public class Student extends Person {
    private String StudentID;
    private String Program;
    private Date DateRegistered;
    private Enrollment Enrollment;

    //all arg constructor
    public Student(String name, String email, String telNum, String studentID, String program, Date dateRegistered) {
        super(name, email, telNum);
        this.StudentID = studentID;
        this.Program = program;
        this.DateRegistered = dateRegistered;
        this.Enrollment = new Enrollment();        
    }
    
    //no arg constructor
    public Student(){
        this(null,null,null,null,null,null);
    }


    // I used the ID as the equals criteria because its value is a unique identifier
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.StudentID, other.StudentID)) {
            return false;
        }
        return true;
    }
    
    
    
    @Override
    public String toString() {
        return "Student{" + "StudentID=" + StudentID + ", Program=" + Program + ", DateRegistered=" + DateRegistered + ", Enrollment=" + Enrollment.toString() + '}';
    }

    //getters & setters
    public Enrollment getEnrollment() {
        return Enrollment;
    }

    public void setEnrollment(Enrollment Enrollment) {
        this.Enrollment = Enrollment;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }

    public Date getDateRegistered() {
        return DateRegistered;
    }

    public void setDateRegistered(Date DateRegistered) {
        this.DateRegistered = DateRegistered;
    }
    
}
