/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.CourseSchedule.CourseSchedule;

/**
 *
 * @author saisr
 */
public class BusinessAccount {
     Business department;
    public BusinessAccount(Business d){
        department = d;
    }
        
    public int calculateRevenuesBySemester(String semester) {

        CourseSchedule css = department.getCourseSchedule(semester);

        return css.calculateTotalRevenues();

    }
}
