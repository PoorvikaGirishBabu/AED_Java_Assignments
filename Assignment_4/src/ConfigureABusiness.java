/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/
package Business;

import Business.CourseCatalog.CourseCatalog;
import Business.CourseSchedule.CourseOffer;
import Business.CourseSchedule.CourseSchedule;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.EmployeeProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;
import Business.Profiles.FacultyProfile;
import Business.Profiles.FacultyDirectory;
import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;


/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Information Systems");
        CourseCatalog coursecatalog = business.getCourseCatalog();
        coursecatalog.newCourse("appeng", "info 5100", 4);
        coursecatalog.newCourse("Cloud", "info 7105", 4);
        coursecatalog.newCourse("Linux", "info 8105", 4);
        coursecatalog.newCourse("Web", "info 6105", 4);
        coursecatalog.newCourse("UIUX", "info 6305", 4);
        coursecatalog.newCourse("Web Development", "info 6310", 3);
        coursecatalog.newCourse("User Research Methods", "info 6320", 3);
        coursecatalog.newCourse("Visual Design Principles", "info 6330", 4);
        coursecatalog.newCourse("Interaction Design", "info 6340", 4);
        coursecatalog.newCourse("Prototyping and Wireframing", "info 6350", 3);

// Create Persons
      PersonDirectory persondirectory = business.getPersonDirectory();
// person representing sales organization        
        Person person001 = persondirectory.newPerson("John Smith");
        Person person002 = persondirectory.newPerson("Gina Montana");
        Person person003 = persondirectory.newPerson("Adam Rollen");
 
        Person person005 = persondirectory.newPerson("Jim Dellon");
        Person person006 = persondirectory.newPerson("Anna Shnider");
        Person person007 = persondirectory.newPerson("Laura Brown");
        Person person008 = persondirectory.newPerson("Jack While");
        Person person009 = persondirectory.newPerson("Fidelity");
        
        Person person010 = persondirectory.newPerson("William Lopez");
        Person person011 = persondirectory.newPerson("Ava Gonzalez");
        Person person012 = persondirectory.newPerson("James");
        Person person013 = persondirectory.newPerson("Isabella Martinez");
        Person person015 = persondirectory.newPerson("Mia Perez");
        Person person016 = persondirectory.newPerson("Alexander Wilson");
        Person person017 = persondirectory.newPerson("Sophia Davis"); //we use this as customer

// Create Admins to manage the business
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(person001);
        
        StudentDirectory studentdirectory = business.getStudentDirectory();
        StudentProfile studentprofile0 = studentdirectory.newStudentProfile(person003);
        
        FacultyDirectory facultydirectory = business.getFacultydirectory();
        FacultyProfile facultyprofile0 = facultydirectory.newFacultyProfile(person005);
        
        //create faculty
        
         

        FacultyProfile emp3 = facultydirectory.newFacultyProfile(person008);
        System.out.println("Yoo " + emp3.getPerson());
        FacultyProfile emp4 = facultydirectory.newFacultyProfile(person009);
        FacultyProfile emp5 = facultydirectory.newFacultyProfile(person010);
        FacultyProfile emp6 = facultydirectory.newFacultyProfile(person011);
        FacultyProfile emp7 = facultydirectory.newFacultyProfile(person012);
//        FacultyProfile emp4 = employeedirectory.newEmployeeProfile(f3);
//        FacultyProfile emp5 = employeedirectory.newEmployeeProfile(f2);
//        FacultyProfile emp6 = employeedirectory.newEmployeeProfile(f4);
//        FacultyProfile emp7 = employeedirectory.newEmployeeProfile(f5);

// creating new semesters schedule and addding faculty to course offer
        CourseSchedule courseschedule = business.newCourseSchedule("Fall2024");
        CourseOffer info5100_1 = courseschedule.newCourseOffer("info 5100");
        CourseOffer info7100_2 =courseschedule.newCourseOffer("info 7105");
         info5100_1.AssignAsTeacher(emp3);
         info7100_2.AssignAsTeacher(emp4);
         info5100_1.generatSeats(20);
         info7100_2.generatSeats(20);
        
        
        CourseSchedule courseschedule1 = business.newCourseSchedule("Fall2025");
        CourseOffer info5100_11 = courseschedule1.newCourseOffer("info 5100");
        CourseOffer info7100_12 =courseschedule1.newCourseOffer("info 7105");
        info7100_12.AssignAsTeacher(emp7);
        info5100_11.AssignAsTeacher(emp5);
        info5100_11.generatSeats(20);
        info7100_12.generatSeats(20);
        
        CourseSchedule courseschedule2 = business.newCourseSchedule("Spring2025");
        CourseOffer info5100_21 = courseschedule2.newCourseOffer("info 5100");
        CourseOffer info7100_22 =courseschedule2.newCourseOffer("info 8105");
        info7100_22.AssignAsTeacher(emp6);
        info5100_21.AssignAsTeacher(emp3);
        info5100_21.generatSeats(20);
        info7100_22.generatSeats(20);
        
        CourseSchedule courseschedule3 = business.newCourseSchedule("Spring2026");
        CourseOffer info5100_31 = courseschedule3.newCourseOffer("info 5100");
        CourseOffer info7100_32 =courseschedule3.newCourseOffer("info 7105");
        info7100_32.AssignAsTeacher(emp7);
        info5100_31.AssignAsTeacher(emp3);
        info5100_31.generatSeats(20);
        info7100_32.generatSeats(20);
        CourseSchedule courseschedule4 = business.newCourseSchedule("Fall2026");
        CourseOffer info5100_41 = courseschedule4.newCourseOffer("info 5100");
        CourseOffer info7100_42 =courseschedule4.newCourseOffer("info 7105");
        info7100_42.AssignAsTeacher(emp7);
        info5100_41.AssignAsTeacher(emp3);
        info5100_41.generatSeats(20);
        info7100_42.generatSeats(20);
        
        
        



   
// Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "admin", "****"); /// order products for one of the customers and performed by a sales person
        UserAccount ua4 = uadirectory.newUserAccount(studentprofile0, "adam", "****");
        UserAccount ua5= uadirectory.newUserAccount(facultyprofile0, "fac05","****");
        /// order products for one of the customers and performed by a sales person

        return business;

    }

}
