/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Business;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author saisr
 */
public class FacultyDirectory {
    Business department;
    ArrayList<FacultyProfile> teacherlist;

    public ArrayList<FacultyProfile> getTeacherlist() {
        return teacherlist;
    }

    public FacultyDirectory(Business d) {

        department = d;
        teacherlist = new ArrayList();

    }

    public FacultyProfile newFacultyProfile(Person p) {

        FacultyProfile sp = new FacultyProfile(p);
        teacherlist.add(sp);
        return sp;
    }
    
//    public FacultyProfile getTopProfessor(){
//        
//        double bestratingsofar = 0.0;
//        FacultyProfile BestProfSofar = null;
//        for(FacultyProfile fp: teacherlist)
////           if(fp.getProfAverageOverallRating()>bestratingsofar){
////           bestratingsofar = fp.getProfAverageOverallRating();
//           BestProfSofar = fp;
//           }
//        return BestProfSofar;
//        
//    }

    public FacultyProfile findTeachingFaculty(String id) {

        for (FacultyProfile sp : teacherlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
