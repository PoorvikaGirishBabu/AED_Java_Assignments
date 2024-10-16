/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CourseSchedule;

import Business.CourseCatalog.Course;

/**
 *
 * @author saisr
 */
public class SeatAssignment {
    
  float grade; //(Letter grade mappings: A=4.0, A-=3.7, B+=3.3, B=3.0, )
    Seat seat;
    boolean like; //true means like and false means not like
    public CourseLoad getCourseload() {
        return courseload;
    }
    CourseLoad courseload;
    public SeatAssignment(CourseLoad cl, Seat s){
        seat = s;
        courseload = cl;
    }
     
    public boolean getLike(){
        return like;
    }
    public void assignSeatToStudent(CourseLoad cl){
        courseload = cl;
    }
    
    public int getCreditHours(){
        return seat.getCourseCredits();
       
    }
    public Seat getSeat(){
        return seat;
    }
    public CourseOffer getCourseOffer(){
        
        return seat.getCourseOffer();
    }
    public Course getAssociatedCourse(){
        
        return getCourseOffer().getSubjectCourse();
    }
    public float GetCourseStudentScore(){
        return getCreditHours()*grade;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public void setCourseload(CourseLoad courseload) {
        this.courseload = courseload;
    }
    public float getGPA(){
        float gpa = (this.grade / 100) * 4.0f;
        float roundedGPA = Math.round(gpa * 100.0f) / 100.0f;
        return roundedGPA;
    }

    
    
}
