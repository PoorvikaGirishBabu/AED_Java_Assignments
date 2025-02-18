/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Transcript;

import Business.CourseSchedule.CourseLoad;
import Business.CourseSchedule.SeatAssignment;
import Business.Profiles.StudentProfile;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author saisr
 */
public class Transcript {
    
    StudentProfile student;
    HashMap<String, CourseLoad> courseloadlist;
    CourseLoad currentcourseload;
    
    public Transcript(StudentProfile sp) {
        student = sp;
        courseloadlist = new HashMap();

    }
    public int getStudentSatisfactionIndex() {
        //for each courseload 
        //get seatassigmnets; 
        //for each seatassignment add 1 if like =true;
        return 0;
    }
    
    public CourseLoad newCourseLoad(String sem) {

        currentcourseload = new CourseLoad(sem, student);
        courseloadlist.put(sem, currentcourseload);
        return currentcourseload;
    }
    
    public CourseLoad getCurrentCourseLoad() {

        return currentcourseload;

    }
    
    public CourseLoad getCourseLoadBySemester(String semester) {

        return courseloadlist.get(semester);

    }
    
     public float getStudentTotalScore() {

        float sum = 0;

        for (CourseLoad cl : courseloadlist.values()) {
            sum = sum + cl.getSemesterScore();

        }
        return sum;
    }
    
     //sat index means student rated their courses with likes;
    public int getStudentSatifactionIndex() {
        ArrayList<SeatAssignment> courseregistrations = getCourseList();
        int sum = 0;
        for (SeatAssignment sa : courseregistrations) {

            if (sa.getLike()) {
                sum = sum + 1;
            }
        }
        return sum;
    }
    //generate a list of all courses taken so far (seetassignments) 
    //from multiple semesters (course loads)
    //from seat assignments we will be able to access the course offers

    public ArrayList<SeatAssignment> getCourseList() {
        ArrayList temp2;
        temp2 = new ArrayList();

        for (CourseLoad cl : courseloadlist.values()) { //extract cl list as objects --ignore label
            temp2.addAll(cl.getSeatAssignments()); //merge one array list to another
        }

        return temp2;

    }

     
     
    
    
    
    
    
    

    
    
}
