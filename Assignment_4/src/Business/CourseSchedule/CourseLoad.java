/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CourseSchedule;

import Business.Profiles.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author saisr
 */
public class CourseLoad {
    String semester;
    StudentProfile sp;
    public StudentProfile getSp() {
        return sp;
    }
    public ArrayList<SeatAssignment> getSeatassignments() {
        return seatassignments;
    }
    ArrayList<SeatAssignment> seatassignments;
    
    public CourseLoad(String s,StudentProfile ss){
        seatassignments = new ArrayList();
        semester = s;
        this.sp=ss;
    }
    public SeatAssignment newSeatAssignment(CourseOffer co){
        System.out.println("hello1 "+co);
        Seat seat = co.getEmptySeat();
        System.out.println(seat+"seat");// seat linked to courseoffer
        if (seat==null) return null;
        SeatAssignment sa = seat.newSeatAssignment(this);
        seatassignments.add(sa);  //add to students course 
        
        return sa;
        
    }
    
    public void registerStudent(SeatAssignment sa){
        
        System.out.println(sa);
        System.out.println("what is this " + this);
        sa.assignSeatToStudent(this);
        seatassignments.add(sa);
    }
    
    public float getSemesterScore(){ //total score for a full semeter
        float sum = 0;
        for (SeatAssignment sa: seatassignments){
            sum = sum + sa.GetCourseStudentScore();
        }
        return sum;
    }
        public ArrayList<SeatAssignment> getSeatAssignments(){
            return seatassignments;
        }
        
    
    

            

     
    
}
