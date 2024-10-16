/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WorkAreas.AdminRole.ManagePersonnelWorkResp;

import Business.Business;
import Business.Person.Person;
import Business.Profiles.AdminDirectory;
import Business.Profiles.AdminProfile;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.FacultyProfile;
import Business.Profiles.Profile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;
import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


import javax.swing.JPanel;

/**
 *
 * @author kal bugrara
 */
public class ManagePersonsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliersJPanel
     */
    JPanel CardSequencePanel;
    Business business;


    public ManagePersonsJPanel(Business bz, JPanel jp) {
        CardSequencePanel = jp;
        this.business = bz;
        initComponents();

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Btnsave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtps = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        lbltitle1 = new javax.swing.JLabel();
        txtun = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(null);

        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        add(Back);
        Back.setBounds(20, 270, 74, 23);

        Next.setText("Next >>");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        add(Next);
        Next.setBounds(470, 420, 80, 23);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Manage Personnel (HR)");
        add(jLabel2);
        jLabel2.setBounds(21, 20, 100, 28);

        Btnsave.setText("Save");
        Btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsaveActionPerformed(evt);
            }
        });
        add(Btnsave);
        Btnsave.setBounds(470, 280, 72, 23);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Role: ");
        add(jLabel4);
        jLabel4.setBounds(90, 170, 70, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("UserName: ");
        add(jLabel5);
        jLabel5.setBounds(60, 120, 120, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Password:");
        add(jLabel6);
        jLabel6.setBounds(90, 210, 110, 25);

        txtps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpsActionPerformed(evt);
            }
        });
        add(txtps);
        txtps.setBounds(180, 220, 140, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "faculty", "admin", "student" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1);
        jComboBox1.setBounds(180, 170, 74, 22);

        lbltitle1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbltitle1.setText("Create Person & Credentials");
        add(lbltitle1);
        lbltitle1.setBounds(140, 20, 300, 32);
        add(txtun);
        txtun.setBounds(180, 120, 140, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Person Name: ");
        add(jLabel3);
        jLabel3.setBounds(50, 70, 130, 30);

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        add(txtid);
        txtid.setBounds(180, 70, 150, 22);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
 //       ((java.awt.CardLayout)CardSequencePanel.getLayout()).show(CardSequencePanel, "IdentifyEventTypes");

    }//GEN-LAST:event_BackActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
        
        AdministerPersonJPanel mppd = new AdministerPersonJPanel(business, CardSequencePanel);
        CardSequencePanel.add(mppd);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_NextActionPerformed

    private void BtnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsaveActionPerformed
        // TODO add your handling code here:
        String tid = txtid.getText();
        String trole= (String)jComboBox1.getSelectedItem();
        String tun= txtun.getText();
        String tps= txtps.getText();

        Person p= business.getPersonDirectory().newPerson(tid);
        AdminDirectory ad = business.getAdmindirectory();
        FacultyDirectory employeedirectory = business.getFacultydirectory();
        UserAccountDirectory uadirectory = business.getUseraccountdirectory();

        StudentDirectory sd = business.getStudentdirectory();
        if("faculty".equals(trole)){FacultyProfile p1 = employeedirectory.newFacultyProfile(p);
            UserAccount ua13= uadirectory.newUserAccount(p1, tun, tps);
        }
        else if("admin".equals(trole)){        AdminProfile p1= ad.newEmployeeProfile(p);
            UserAccount ua13= uadirectory.newUserAccount(p1, tun, tps);

      }
        else if("student".equals(trole)){StudentProfile p1= sd.newStudentProfile(p);
            UserAccount ua13= uadirectory.newUserAccount(p1, tun, tps);
        }

    }//GEN-LAST:event_BtnsaveActionPerformed

    private void txtpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpsActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Btnsave;
    private javax.swing.JButton Next;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbltitle1;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtps;
    private javax.swing.JTextField txtun;
    // End of variables declaration//GEN-END:variables

}