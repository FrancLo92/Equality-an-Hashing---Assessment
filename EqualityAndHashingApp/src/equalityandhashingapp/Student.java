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
public class Student extends Person {
    private String StudentID;
    private String Program;
    private Date DateRegistered;
    private Enrollment Enrollment;

    public Student(String name, String email, String telNum, String studentID, String program, Date dateRegistered) {
        super(name, email, telNum);
        this.StudentID = studentID;
        this.Program = program;
        this.DateRegistered = dateRegistered;
        this.Enrollment = new Enrollment();        
    }

    @Override
    public String toString() {
        return "Student{" + "StudentID=" + StudentID + ", Program=" + Program + ", DateRegistered=" + DateRegistered + ", Enrollment=" + Enrollment.toString() + '}';
    }

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
