/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalityandhashingapp;

/**
 *
 * @author HP Mini
 */
public class Course {
    public String CourseID;
    public String CourseName;
    public float Cost;
    
    public Course(String courseID, String courseName, float cost){
        this.CourseID = courseID;
        this.CourseName = courseName;
        this.Cost = cost;        
    }
    
    public Course(){
        this("N/A", "N/A", 0);       
    }

    public String getCourseID() {
        return CourseID;
    }

    public void setCourseID(String CourseID) {
        this.CourseID = CourseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public float getCost() {
        return Cost;
    }

    public void setCost(float Cost) {
        this.Cost = Cost;
    }

    @Override
    public String toString() {
        return "Course{" + "CourseID=" + CourseID + ", CourseName=" + CourseName + ", Cost=" + Cost + '}';
    }
    
    
}
