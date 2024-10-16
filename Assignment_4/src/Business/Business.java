
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.CourseCatalog.Course;
import Business.CourseCatalog.CourseCatalog;
import Business.CourseSchedule.CourseLoad;
import Business.CourseSchedule.CourseOffer;
import Business.CourseSchedule.CourseSchedule;
import Business.Degree.Degree;
import Business.Person.PersonDirectory;
import Business.Profiles.AdminDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;
import Business.Profiles.FacultyDirectory;

import Business.UserAccounts.UserAccountDirectory;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Business {

    String name;
    PersonDirectory persondirectory; //all people profiles regardless of the role

    EmployeeDirectory employeedirectory;

    public UserAccountDirectory getUseraccountdirectory() {
        return useraccountdirectory;
    }
    UserAccountDirectory useraccountdirectory;

    public StudentDirectory getStudentdirectory() {
        return studentdirectory;
    }
    StudentDirectory studentdirectory;
     HashMap<String, CourseSchedule> mastercoursecatalog;
     CourseCatalog coursecatalog;
    FacultyDirectory facultydirectory;
    AdminDirectory admindirectory;
    Degree degree;


    public Business(String n) {
        name = n;
        mastercoursecatalog = new HashMap<>();
        persondirectory = new PersonDirectory();
        employeedirectory = new EmployeeDirectory(this);
        useraccountdirectory = new UserAccountDirectory();
        studentdirectory = new StudentDirectory();
        coursecatalog = new CourseCatalog(this);
        facultydirectory= new FacultyDirectory(this);
        admindirectory = new AdminDirectory(this);
        Degree degree = new Degree("MSIS");


    }

    public AdminDirectory getAdmindirectory() {
        return admindirectory;
    }

    public FacultyDirectory getFacultydirectory() {
        return facultydirectory;
    }

    public void setFacultydirectory(FacultyDirectory facultydirectory) {
        this.facultydirectory = facultydirectory;
    }
     public HashMap<String, CourseSchedule> getMastercoursecatalog() {
        return mastercoursecatalog;
    }


    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }


    public EmployeeDirectory getEmployeeDirectory() {
        return employeedirectory;
    }

    public StudentDirectory getStudentDirectory(){
        return studentdirectory;
    }
     public void RegisterForAClass(String studentid, String cn, String semester) {

        StudentProfile sp = studentdirectory.findStudent(studentid);

        CourseLoad cl = sp.getCurrentCourseLoad();

        CourseSchedule cs = mastercoursecatalog.get(semester);

        CourseOffer co = cs.getCourseOfferByNumber(cn);

        co.assignEmptySeat(cl);

    }
     
    public void addCoreCourse(Course c) {
        degree.addCoreCourse(c);

    }

    public void addElectiveCourse(Course c) {
        degree.addElectiveCourse(c);

    }

    

    public CourseSchedule newCourseSchedule(String semester) {

        CourseSchedule cs = new CourseSchedule(semester, coursecatalog);
        mastercoursecatalog.put(semester, cs);
        return cs;
    }

    public CourseSchedule getCourseSchedule(String semester) {

        return mastercoursecatalog.get(semester);

    }

    public CourseCatalog getCourseCatalog() {

        return coursecatalog;

    }

    public Course newCourse(String n, String nm, int cr) {

        Course c = coursecatalog.newCourse(n, nm, cr);
        return c;
    }

    public int calculateRevenuesBySemester(String semester) {

        CourseSchedule css = mastercoursecatalog.get(semester);

        return css.calculateTotalRevenues();

    }

  

}
