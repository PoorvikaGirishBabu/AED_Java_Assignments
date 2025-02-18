/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BankAccountAttributes;
import model.BankAccountAttributesView;

/**
 *
 * @author poorv
 */
public class ViewBankAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewBankAccountJPanel
     */
    BankAccountAttributesView BAView;
    public ViewBankAccountJPanel(BankAccountAttributesView BAView) {
        initComponents();
        this.BAView = BAView;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtdebtAmt = new javax.swing.JTextField();
        lblCreateBankAccount = new javax.swing.JLabel();
        lblBAfname = new javax.swing.JLabel();
        lblBAlname = new javax.swing.JLabel();
        lblBApassport = new javax.swing.JLabel();
        lblAccType = new javax.swing.JLabel();
        txtBAfname = new javax.swing.JTextField();
        lbldebtAmt = new javax.swing.JLabel();
        txtBAlname = new javax.swing.JTextField();
        txtBApassport = new javax.swing.JTextField();
        txtAccType = new javax.swing.JTextField();
        lblcreditAmt = new javax.swing.JLabel();
        txtCreditAmt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBA = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        txtdebtAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdebtAmtActionPerformed(evt);
            }
        });

        lblCreateBankAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCreateBankAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateBankAccount.setText("View Bank Account");

        lblBAfname.setText("BA First Name:");

        lblBAlname.setText("BA Last Name:");

        lblBApassport.setText("BA Passport:");

        lblAccType.setText("Account Type:");

        txtBAfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBAfnameActionPerformed(evt);
            }
        });

        lbldebtAmt.setText("Debt Amt:");

        lblcreditAmt.setText("Credit Amt:");

        txtCreditAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditAmtActionPerformed(evt);
            }
        });

        tblBA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "First name", "Last name", "Passport"
            }
        ));
        jScrollPane1.setViewportView(tblBA);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCreateBankAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdebtAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBAfname)
                                .addComponent(txtBAlname, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(txtBApassport, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(txtAccType, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(txtCreditAmt)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView)
                .addGap(39, 39, 39)
                .addComponent(btnDelete)
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBAfname, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBAlname, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBApassport, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldebtAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcreditAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCreateBankAccount)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBAlname)
                    .addComponent(txtBAfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBAfname)
                    .addComponent(txtBAlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBApassport)
                    .addComponent(txtBApassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccType)
                    .addComponent(txtAccType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldebtAmt)
                    .addComponent(txtdebtAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcreditAmt)
                    .addComponent(txtCreditAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBAfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBAfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBAfnameActionPerformed

    private void txtCreditAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreditAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditAmtActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int SelectedRowIndex = tblBA.getSelectedRow();
        
        if (SelectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this,"This BA detail is deleted");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblBA.getModel();
        BankAccountAttributes selectedBA =   (BankAccountAttributes)model.getValueAt(SelectedRowIndex, 0);
        
        BAView.deleteBA(selectedBA);
        
        JOptionPane.showMessageDialog(this, "Person Record Deleted");
        
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int SelectedRowIndex = tblBA.getSelectedRow();
        
        if (SelectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to View");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblBA.getModel();
        BankAccountAttributes selectedBA =   (BankAccountAttributes)model.getValueAt(SelectedRowIndex, 0);
        
        txtBAfname.setText(selectedBA.getBAfname());
        txtBAlname.setText(selectedBA.getBAlname());
        txtBApassport.setText(selectedBA.getBAPassport());
        txtAccType.setText(selectedBA.getAccountType());
        txtCreditAmt.setText(selectedBA.getCreditAmt());
        txtdebtAmt.setText(selectedBA.getDebtAmt());
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtdebtAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdebtAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdebtAmtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAccType;
    private javax.swing.JLabel lblBAfname;
    private javax.swing.JLabel lblBAlname;
    private javax.swing.JLabel lblBApassport;
    private javax.swing.JLabel lblCreateBankAccount;
    private javax.swing.JLabel lblcreditAmt;
    private javax.swing.JLabel lbldebtAmt;
    private javax.swing.JTable tblBA;
    private javax.swing.JTextField txtAccType;
    private javax.swing.JTextField txtBAfname;
    private javax.swing.JTextField txtBAlname;
    private javax.swing.JTextField txtBApassport;
    private javax.swing.JTextField txtCreditAmt;
    private javax.swing.JTextField txtdebtAmt;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
         
        DefaultTableModel model = (DefaultTableModel) tblBA.getModel();
        model.setRowCount(0);
        
        for (BankAccountAttributes ba : BAView.getBankACdet()){
           Object[] row = new Object[3];
           row[0]= ba;
           row[1] = ba.getBAlname();
           row[2] = ba.getBAPassport();
           
           model.addRow(row);
           
        }
        
    }

    }

