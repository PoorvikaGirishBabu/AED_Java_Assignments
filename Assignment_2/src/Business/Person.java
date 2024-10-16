/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import Business.Address;

/**
 *
 * @author poorv
 */
public class Person {
    private String FirstName;
    private String LastName;
    private String SSN;
    private String LicenseNumber;
    private Address Homeaddress;
    private Address WorkAddress;
    
    
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getLicenseNumber() {
        return LicenseNumber;
    }

    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    public Address getHomeaddress() {
        return Homeaddress;
    }

    public void setHomeaddress(Address Homeaddress) {
        this.Homeaddress = Homeaddress;
    }

    public Address getWorkAddress() {
        return WorkAddress;
    }

    public void setWorkAddress(Address WorkAddress) {
        this.WorkAddress = WorkAddress;
    }

    @Override
    public String toString(){
        return FirstName;
    }
    
    
}
