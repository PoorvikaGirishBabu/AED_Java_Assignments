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
public class HomeAddressAttributesView {
private ArrayList<HomeAddressAttributes> HAdet;
public HomeAddressAttributesView(){
    this.HAdet = new ArrayList<HomeAddressAttributes>();
    
}

public ArrayList<HomeAddressAttributes> getHAdet(){
    return HAdet;
}

public void setHAdet(ArrayList<HomeAddressAttributes> HAdet) {
    this.HAdet = HAdet;
}

public HomeAddressAttributes addNewHA(){
    
    HomeAddressAttributes NewHA = new HomeAddressAttributes();
    HAdet.add(NewHA);
    return NewHA;
    
}

    public void deleteHA(HomeAddressAttributes selectedHA) {
        HAdet.remove(selectedHA);
    }
}
