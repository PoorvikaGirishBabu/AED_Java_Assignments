/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.CourseSchedule.CourseOffer;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author saisr
 */
public class FacultyProfile extends Profile {
    Person person;

    public Person getPerson() {
        return person;
    }
    ArrayList <FacultyAssignment> facultyassignments;
    public FacultyProfile(Person p) {
        super(p);
        this.person =p;

        facultyassignments = new ArrayList();
    }
//    public  double getProfAverageOverallRating(){
//        
//        double sum = 0.0;
        //for each facultyassignment extract class rating
        //add them up and divide by the number of teaching assignmnet;
//        for(FacultyAssignment fa: facultyassignments){
//            
//            sum = sum + fa.getRating();
//            
//        }
        //divide by the total number of faculty assignments
        
//        return sum/(facultyassignments.size()*1.0); //this ensure we have double/double
        
//    }

//    public FacultyAssignment AssignAsTeacher(CourseOffer co){
        
//        FacultyAssignment fa = new FacultyAssignment(this, co);
//        facultyassignments.add(fa);
        
//        return fa;
//    }
    
//    public FacultyProfile getCourseOffer(String courseid){
//        return null; //complete it later
//    }

//    public boolean isMatch(String id) {
//        if (person.getPersonId().equals(id)) {
//            return true;
//        }
//        return false;
//    }
//    @Override
//    public String getRole(){
//        return  "faculty";
//    }

    @Override
    public String getRole() {
return  "faculty";    }
}