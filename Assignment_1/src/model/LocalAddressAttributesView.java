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
public class LocalAddressAttributesView {
    
    private ArrayList<LocalAddressAttributes> LAdet;
    public LocalAddressAttributesView(){
        this.LAdet = new ArrayList<LocalAddressAttributes>();
    }
    
    public ArrayList<LocalAddressAttributes> getLAdet(){
        return LAdet;
        
    }
    
    public void setLAdet(ArrayList<LocalAddressAttributes> LAdet){
        this.LAdet = LAdet;
    }
    
    public LocalAddressAttributes addNewLA(){
      LocalAddressAttributes NewLA = new LocalAddressAttributes();
      LAdet.add(NewLA);
      return NewLA;
    }
    
     public void deleteLA(LocalAddressAttributes la){
        LAdet.remove(la);
    }
    
}
