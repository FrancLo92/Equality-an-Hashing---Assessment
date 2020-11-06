/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparators;

import equalityandhashingapp.Enrollment;
import java.util.Comparator;

/**
 *
 * @author HP Mini
 */
public class EnrollmentSortById implements Comparator<Enrollment> {
    
    public int compare(Enrollment e1, Enrollment e2)
    {
        return e1.EnrollmentID - e2.EnrollmentID;
    } 
    
}
