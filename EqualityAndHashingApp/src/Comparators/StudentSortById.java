/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparators;

import equalityandhashingapp.Student;
import java.util.Comparator;

/**
 *
 * @author HP Mini
 */
public class StudentSortById implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.StudentID - s2.StudentID;
    }
    
}
