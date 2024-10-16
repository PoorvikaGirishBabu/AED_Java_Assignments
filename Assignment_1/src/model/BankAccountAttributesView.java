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
public class BankAccountAttributesView {
    
    private ArrayList<BankAccountAttributes> BankACdet;
    public BankAccountAttributesView(){
        
        this.BankACdet = new ArrayList<BankAccountAttributes>();
    }
    
    public ArrayList<BankAccountAttributes> getBankACdet(){
        return BankACdet;
    }
    
    public void setBankACdet(ArrayList<BankAccountAttributes> BankACdet) {
        this.BankACdet = BankACdet;
    }
    
    public BankAccountAttributes addNewBA(){
        BankAccountAttributes NewBA = new BankAccountAttributes();
        BankACdet.add(NewBA);
        return NewBA;
    }

    public void deleteBA(BankAccountAttributes selectedBA) {
       BankACdet.remove(selectedBA);
    }
    
    
}
