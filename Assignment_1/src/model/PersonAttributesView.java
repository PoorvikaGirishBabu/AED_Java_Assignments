/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author poorv
 */
public class PersonAttributesView {
    
    private ArrayList<PersonAttributes> persondet;
    public PersonAttributesView(){
        this.persondet = new ArrayList<PersonAttributes>();
        
        
    }

    public ArrayList<PersonAttributes> getPersondet() {
        return persondet;
    }

    public void setPersondet(ArrayList<PersonAttributes> persondet) {
        this.persondet = persondet;
    }
    
    public PersonAttributes addNewPA(){
        PersonAttributes NewPA = new PersonAttributes();
        persondet.add(NewPA);
        return NewPA;
    }
    
    public void deletePerson(PersonAttributes pa){
        persondet.remove(pa);
    }
}
