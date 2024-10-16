/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author poorv
 */
public class PersonDirectory {
    private ArrayList<Person> personList;

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public PersonDirectory() {
        this.personList = new ArrayList<Person>();
    }
    
    public Person addPerson(){
        Person person = new Person();
        personList.add(person);
        return person;
    }
    
    public void deletePerson(Person person){
      personList.remove(person);
      
    }

    public Person searchPerson(String searchAttribute){
        for(Person person:personList){
            if(person.getFirstName().equals(searchAttribute) || person.getLastName().equals(searchAttribute)){
                return person;
            }
        }
        return null;
    }
    
    
}
