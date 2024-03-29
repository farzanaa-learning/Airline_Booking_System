/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.airlinebooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SYED IMRAN
 */
public class AddCustomer extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddCustomer
     */
    public AddCustomer() {
        initComponents();
        AutoId();
    }
    Connection con;
    PreparedStatement pre;
    public void AutoId(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
       
            con=DriverManager.getConnection("jdbc:mysql://localhost/flight_booking", "root", "Shamshad@1");
            pre=con.prepareStatement("Select MAX(CustId) from addcust");
            ResultSet rs=pre.executeQuery();
            rs.next();
            if(rs.getString("MAX(CustId)")==null){
               autoCustomerId.setText("CS001");
            }else{
                int idLast=Integer.parseInt(rs.getString("MAX(CustId)").substring(2, rs.getString("MAX(CustId)").length()));
                idLast++;
                autoCustomerId.setText("CS"+String.format("%03d", idLast));
            }
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        labelCustomerId = new javax.swing.JLabel();
        labelFisrtName = new javax.swing.JLabel();
        labelLastName = new javax.swing.JLabel();
        labelNic_Id = new javax.swing.JLabel();
        labelPassportId = new javax.swing.JLabel();
        labelAddress = new javax.swing.JLabel();
        txtFisrtName = new javax.swing.JTextField();
        txtPassportId = new javax.swing.JTextField();
        txtNic_Id = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        labelGender = new javax.swing.JLabel();
        labelContact = new javax.swing.JLabel();
        labelDob = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        selectMale = new javax.swing.JRadioButton();
        selectFemale = new javax.swing.JRadioButton();
        addBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        selectDob = new com.toedter.calendar.JDateChooser();
        autoCustomerId = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setClosable(true);

        labelCustomerId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        labelCustomerId.setForeground(new java.awt.Color(255, 0, 102));
        labelCustomerId.setText("Customer Id ");

        labelFisrtName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelFisrtName.setText("First Name ");

        labelLastName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelLastName.setText("Last Name ");

        labelNic_Id.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelNic_Id.setText("NIC Id ");

        labelPassportId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelPassportId.setText("Passport Id ");

        labelAddress.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelAddress.setText("Address");

        txtPassportId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassportIdActionPerformed(evt);
            }
        });

        txtNic_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNic_IdActionPerformed(evt);
            }
        });

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        labelGender.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelGender.setText("Gender ");

        labelContact.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelContact.setText("Contact ");

        labelDob.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelDob.setText("Date Of Birth ");

        selectMale.setText("Male");
        selectMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectMaleActionPerformed(evt);
            }
        });

        selectFemale.setText("Female");
        selectFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFemaleActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        autoCustomerId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        autoCustomerId.setForeground(new java.awt.Color(0, 51, 153));
        autoCustomerId.setText("Cust Id ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(labelCustomerId)
                        .addGap(26, 26, 26)
                        .addComponent(autoCustomerId)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelPassportId)
                                            .addComponent(labelNic_Id))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtNic_Id, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                            .addComponent(txtPassportId)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelLastName)
                                            .addComponent(labelFisrtName))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLastName)
                                            .addComponent(txtFisrtName))))
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelContact)
                                                .addGap(40, 40, 40)
                                                .addComponent(txtContact))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(addBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                                .addComponent(cancelBtn)))
                                        .addGap(8, 8, 8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelDob)
                                            .addComponent(labelGender))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(selectMale)
                                                .addGap(37, 37, 37)
                                                .addComponent(selectFemale)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(selectDob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelAddress)
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCustomerId)
                    .addComponent(autoCustomerId))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelFisrtName)
                        .addComponent(txtFisrtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelDob))
                    .addComponent(selectDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelGender)
                            .addComponent(selectMale)
                            .addComponent(selectFemale))
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelPassportId)
                        .addComponent(txtPassportId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelContact)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNic_Id)
                    .addComponent(txtNic_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelBtn)
                            .addComponent(addBtn))
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAddress)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassportIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassportIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassportIdActionPerformed

    private void txtNic_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNic_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNic_IdActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void selectMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectMaleActionPerformed

    private void selectFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectFemaleActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try{
        String FN=txtFisrtName.getText();        
        String LN=txtLastName.getText();
        String custId=autoCustomerId.getText();
        String passport=txtPassportId.getText();
        String NIC=txtNic_Id.getText();
        String Address=txtAddress.getText();
        String contact=txtContact.getText();
        DateFormat df=new SimpleDateFormat("dd-MM-YYYY");
        String DOB=df.format(selectDob.getDate());
        String gender="";
        if(selectMale.isSelected()){
            gender="M";
        }else{
            gender="F";
        }
        
         Class.forName("com.mysql.jdbc.Driver");
       
        con=DriverManager.getConnection("jdbc:mysql://localhost/flight_booking", "root", "Shamshad@1");
        pre=con.prepareStatement("Insert into addcust(CustId, Fname, Lname, PassportId, NIC_ID, Address, DOB, Gender, Contact) value(?, ?, ?, ?, ?, ?, ?, ?, ?)");   
        pre.setString(1, custId);       
        pre.setString(2, FN);
        pre.setString(3, LN);
        pre.setString(4, passport);
        pre.setString(5, NIC);
        pre.setString(6, Address);
        pre.setString(7, DOB);
        pre.setString(8, gender);
        pre.setString(9, contact);

        pre.executeUpdate();
        JOptionPane.showMessageDialog(null, "Customer Data added Successfully");
        
        AutoId();
        custId=autoCustomerId.getText();
        
        txtFisrtName.setText("");        
        txtLastName.setText("");
        autoCustomerId.setText(custId);
        txtPassportId.setText("");
        txtNic_Id.setText("");
        txtAddress.setText("");
        txtContact.setText("");
        selectDob.setDate(null);
       if(selectMale.isSelected()){
            selectMale.setSelected(false);
        }else{
            selectFemale.setSelected(false);
        }
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        txtFisrtName.setText("");        
        txtLastName.setText("");
        autoCustomerId.setText("");
        txtPassportId.setText("");
        txtNic_Id.setText("");
        txtAddress.setText("");
        txtContact.setText("");
        selectDob.setDate(null);
       if(selectMale.isSelected()){
            selectMale.setSelected(false);
        }else{
            selectFemale.setSelected(false);
        }
    }//GEN-LAST:event_cancelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel autoCustomerId;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelContact;
    private javax.swing.JLabel labelCustomerId;
    private javax.swing.JLabel labelDob;
    private javax.swing.JLabel labelFisrtName;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelNic_Id;
    private javax.swing.JLabel labelPassportId;
    private com.toedter.calendar.JDateChooser selectDob;
    private javax.swing.JRadioButton selectFemale;
    private javax.swing.JRadioButton selectMale;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtFisrtName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNic_Id;
    private javax.swing.JTextField txtPassportId;
    // End of variables declaration//GEN-END:variables
}
