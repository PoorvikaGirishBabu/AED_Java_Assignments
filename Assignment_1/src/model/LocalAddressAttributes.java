/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author poorv
 */
public class LocalAddressAttributes {
    
    private String LAfname;
    private String LAlname;
    private String LApassport;
    private String LAadd1;
    private String LAadd2;

    public String getLAfname() {
        return LAfname;
    }

    public void setLAfname(String LAfname) {
        this.LAfname = LAfname;
    }

    public String getLAlname() {
        return LAlname;
    }

    public void setLAlname(String LAlname) {
        this.LAlname = LAlname;
    }

    public String getLApassport() {
        return LApassport;
    }

    public void setLApassport(String LApassport) {
        this.LApassport = LApassport;
    }

    public String getLAadd1() {
        return LAadd1;
    }

    public void setLAadd1(String LAadd1) {
        this.LAadd1 = LAadd1;
    }

    public String getLAadd2() {
        return LAadd2;
    }

    public void setLAadd2(String LAadd2) {
        this.LAadd2 = LAadd2;
    }

    @Override
    public String toString(){
        return LAfname;
    }

}










