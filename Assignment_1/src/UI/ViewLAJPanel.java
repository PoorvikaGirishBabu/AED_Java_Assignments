/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.LocalAddressAttributes;
import model.LocalAddressAttributesView;

/**
 *
 * @author poorv
 */
public class ViewLAJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewLAJPanel
     */
    
    LocalAddressAttributesView LAView;
    public ViewLAJPanel(LocalAddressAttributesView LAView) {
        initComponents();
        this.LAView = LAView;
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
        txtLAfname = new javax.swing.JTextField();
        txtLAlname = new javax.swing.JTextField();
        txtLApassport = new javax.swing.JTextField();
        txtLAadd1 = new javax.swing.JTextField();
        txtLAadd2 = new javax.swing.JTextField();
        lblCreateLocalAddress = new javax.swing.JLabel();
        lblLAfname = new javax.swing.JLabel();
        lblLAlname = new javax.swing.JLabel();
        lblLApassport = new javax.swing.JLabel();
        lblLAadd1 = new javax.swing.JLabel();
        lblLAadd2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLA = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        txtLAfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLAfnameActionPerformed(evt);
            }
        });

        txtLAlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLAlnameActionPerformed(evt);
            }
        });

        txtLAadd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLAadd2ActionPerformed(evt);
            }
        });

        lblCreateLocalAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCreateLocalAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateLocalAddress.setText("View Local Address");

        lblLAfname.setText("LA First Name:");

        lblLAlname.setText("LA Last Name:");

        lblLApassport.setText("LA Passport:");

        lblLAadd1.setText("LA House Address 1:");

        lblLAadd2.setText("LA House Address 2:");

        tblLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "fname", "lname", "Passport"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLA);

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
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLAadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLAadd2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLApassport, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLAlname, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLAfname, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLAadd2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtLAfname)
                        .addComponent(txtLAlname, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addComponent(txtLApassport, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addComponent(txtLAadd1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                .addContainerGap(260, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCreateLocalAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView)
                .addGap(27, 27, 27)
                .addComponent(btnDelete)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(lblCreateLocalAddress)
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblLAfname)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLAlname)
                            .addComponent(txtLAfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLApassport)
                            .addComponent(txtLApassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLAadd1)
                            .addComponent(txtLAadd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLAadd2)
                            .addComponent(txtLAadd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtLAlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLAfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLAfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLAfnameActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int SelectedRowIndex = tblLA.getSelectedRow();
        
        if (SelectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to View");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblLA.getModel();
        LocalAddressAttributes selectedLA =   (LocalAddressAttributes)model.getValueAt(SelectedRowIndex, 0);
        
        txtLAfname.setText(selectedLA.getLAfname());
        txtLAlname.setText(selectedLA.getLAlname());
        txtLApassport.setText(selectedLA.getLApassport());
        txtLAadd1.setText(selectedLA.getLAadd1());
        txtLAadd2.setText(selectedLA.getLAadd2());

        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int SelectedRowIndex = tblLA.getSelectedRow();
        
        if (SelectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this,"This LA detail is deleted");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblLA.getModel();
        LocalAddressAttributes selectedLA =   (LocalAddressAttributes)model.getValueAt(SelectedRowIndex, 0);
        
        LAView.deleteLA(selectedLA);
        
        JOptionPane.showMessageDialog(this, "Person Record Deleted");
        
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtLAlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLAlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLAlnameActionPerformed

    private void txtLAadd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLAadd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLAadd2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateLocalAddress;
    private javax.swing.JLabel lblLAadd1;
    private javax.swing.JLabel lblLAadd2;
    private javax.swing.JLabel lblLAfname;
    private javax.swing.JLabel lblLAlname;
    private javax.swing.JLabel lblLApassport;
    private javax.swing.JTable tblLA;
    private javax.swing.JTextField txtLAadd1;
    private javax.swing.JTextField txtLAadd2;
    private javax.swing.JTextField txtLAfname;
    private javax.swing.JTextField txtLAlname;
    private javax.swing.JTextField txtLApassport;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblLA.getModel();
        model.setRowCount(0);
        
        for (LocalAddressAttributes la : LAView.getLAdet()){
           Object[] row = new Object[3];
           row[0]= la;
           row[1] = la.getLAlname();
           row[2] = la.getLApassport();
           
           model.addRow(row);
           
        }
        
    }
    

    
}
