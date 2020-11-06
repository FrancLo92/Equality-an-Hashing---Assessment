/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalityandhashingapp;

import java.util.Objects;

/**
 *
 * @author HP Mini
 */
public class Course {
    public String CourseID;
    public String CourseName;
    public double Cost;
    
    //all args constructor
    public Course(String courseID, String courseName, double cost){
        this.CourseID = courseID;
        this.CourseName = courseName;
        this.Cost = cost;        
    }
    
    //no args constructor
    public Course(){
        this(null,null,0);       
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
        final Course other = (Course) obj;
        if (!Objects.equals(this.CourseID, other.CourseID)) {
            return false;
        }
        return true;
    }

    
    // getters & setters
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

    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }

    @Override
    public String toString() {
        return "Course{" + "CourseID=" + CourseID + ", CourseName=" + CourseName + ", Cost=" + Cost + '}';
    }
    
    
}
