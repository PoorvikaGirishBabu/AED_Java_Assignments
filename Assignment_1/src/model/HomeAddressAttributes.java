/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author poorv
 */
public class HomeAddressAttributes {
    private String hfname;
    private String hlname;
    private String hpassport;
    private String hHA1;
    private String hHA2;

    public String getHfname() {
        return hfname;
    }

    public void setHfname(String hfname) {
        this.hfname = hfname;
    }

    public String getHlname() {
        return hlname;
    }

    public void setHlname(String hlname) {
        this.hlname = hlname;
    }

    public String getHpassport() {
        return hpassport;
    }

    public void setHpassport(String hpassport) {
        this.hpassport = hpassport;
    }

    public String gethHA1() {
        return hHA1;
    }

    public void sethHA1(String hHA1) {
        this.hHA1 = hHA1;
    }

    public String gethHA2() {
        return hHA2;
    }

    public void sethHA2(String hHA2) {
        this.hHA2 = hHA2;
    }
    
    
    @Override
    public String toString(){
        return hfname;
    }
    
}
