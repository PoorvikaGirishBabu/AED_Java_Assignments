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
public class AdminDirectory {
    Business business;
    ArrayList<AdminProfile> employeelist;

    public AdminDirectory(Business d) {

        business = d;
        employeelist = new ArrayList();

    }

    public AdminProfile newEmployeeProfile(Person p) {

        AdminProfile sp = new AdminProfile(p);
        employeelist.add(sp);
        return sp;
    }

    public AdminProfile findEmployee(String id) {

        for (AdminProfile sp : employeelist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
}
