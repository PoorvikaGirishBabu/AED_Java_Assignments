/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author poorv
 */
public class BankAccountAttributes {
    private String BAfname;
    private String BAlname;
    private String BAPassport;
    private String AccountType;
    private String debtAmt;
    private String creditAmt;

    public String getBAfname() {
        return BAfname;
    }

    public void setBAfname(String BAfname) {
        this.BAfname = BAfname;
    }

    public String getBAlname() {
        return BAlname;
    }

    public void setBAlname(String BAlname) {
        this.BAlname = BAlname;
    }

    public String getBAPassport() {
        return BAPassport;
    }

    public void setBAPassport(String BAPassport) {
        this.BAPassport = BAPassport;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    public String getDebtAmt() {
        return debtAmt;
    }

    public void setDebtAmt(String debtAmt) {
        this.debtAmt = debtAmt;
    }

    public String getCreditAmt() {
        return creditAmt;
    }

    public void setCreditAmt(String creditAmt) {
        this.creditAmt = creditAmt;
    }
    
    @Override
    public String toString(){
        return BAfname;
    }
    
}
