/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparators;

import equalityandhashingapp.Course;
import java.util.Comparator;

/**
 *
 * @author HP Mini
 */
public class CourseSortById implements Comparator<Course>{
    
    public int compare(Course c1, Course c2)
    {
        return c1.CourseID - c2.CourseID;
    } 
    
}
