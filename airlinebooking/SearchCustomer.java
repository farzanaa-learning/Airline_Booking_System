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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SYED IMRAN
 */
public class SearchCustomer extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddCustomer
     */
    public SearchCustomer() {
        initComponents();
        
    }
    Connection con;
    PreparedStatement pre;

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
        txtCustomerId = new javax.swing.JTextField();
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
        searchCustomerBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        selectDob = new com.toedter.calendar.JDateChooser();

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
        setFrameIcon(null);

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

        txtFisrtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFisrtNameActionPerformed(evt);
            }
        });

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

        searchCustomerBtn.setText("Search");
        searchCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(labelCustomerId)
                .addGap(31, 31, 31)
                .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(searchCustomerBtn)
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
                                        .addGap(12, 12, 12)
                                        .addComponent(updateBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cancelBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelContact)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(selectFemale)
                                                .addGap(41, 41, 41))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(txtContact)))))
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDob)
                                    .addComponent(labelGender))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(selectMale)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(selectDob, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                        .addGap(21, 21, 21))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAddress)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustomerId)
                    .addComponent(searchCustomerBtn))
                .addGap(20, 20, 20)
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelBtn)
                            .addComponent(updateBtn))
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAddress)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void searchCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerBtnActionPerformed
        String custId = txtCustomerId.getText();
        try {

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost/flight_booking", "root", "Shamshad@1");
            pre = con.prepareStatement("Select * from addcust where CustId=?");
            
            pre.setString(1, custId);

            ResultSet rs = pre.executeQuery();

            if (rs.next() == false) {
                JOptionPane.showMessageDialog(null, "Record not found");
                txtFisrtName.setText("");
                txtLastName.setText("");
                txtCustomerId.setText("");
                txtPassportId.setText("");
                txtNic_Id.setText("");
                txtAddress.setText("");
                txtContact.getText();
                selectDob.setDate(null);
                if (selectMale.isSelected()) {
                    selectMale.setSelected(false);
                } else {
                    selectFemale.setSelected(false);
                }
            } else {
                
                String FN = rs.getString("Fname");
                String LN = rs.getString("Lname");

                String passport = rs.getString("PassportId");
                String NIC = rs.getString("NIC_ID");
                String Address = rs.getString("Address");
                String contact = rs.getString("Contact");

                String DOB = rs.getString("DOB");
                Date df = new SimpleDateFormat("dd-MM-YYYY").parse(DOB);
                String gender = rs.getString("Gender");
                if (gender.equals(selectFemale)) {
                    selectMale.setSelected(false);
                    selectFemale.setSelected(true);
                } else {
                    selectMale.setSelected(true);
                    selectFemale.setSelected(false);
                }

                txtFisrtName.setText(FN.trim());
                txtLastName.setText(LN.trim());
                txtPassportId.setText(passport.trim());
                txtNic_Id.setText(NIC.trim());
                txtAddress.setText(Address.trim());
                txtContact.setText(contact.trim());
                selectDob.setDate(df);

            }


        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchCustomerBtnActionPerformed

    private void txtFisrtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFisrtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFisrtNameActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
       txtFisrtName.setText("");        
        txtLastName.setText("");
        txtCustomerId.setText("");
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

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        
        try{
        String FN=txtFisrtName.getText();        
        String LN=txtLastName.getText();
        String custId=txtCustomerId.getText();
        String passport=txtPassportId.getText();
        String NIC=txtNic_Id.getText();
        String Address=txtAddress.getText();
        String contact=txtContact.getText();
        DateFormat df=new SimpleDateFormat("DD-MM-YYYY");
        String DOB=df.format(selectDob.getDate());
        String gender="";
        if(selectMale.isSelected()){
            gender="M";
        }else{
            gender="F";
        }
        
         Class.forName("com.mysql.jdbc.Driver");
       
        con=DriverManager.getConnection("jdbc:mysql://localhost/flight_booking", "root", "Shamshad@1");
        pre=con.prepareStatement("update addcust set Fname=?, Lname=?, PassportId=?, NIC_ID=?, Address=?, DOB=?, Gender=?, Contact=? where custId=?");   
               
        pre.setString(1, FN);
        pre.setString(2, LN);
        pre.setString(3, passport);
        pre.setString(4, NIC);
        pre.setString(5, Address);
        pre.setString(6, DOB);
        pre.setString(7, gender);
        pre.setString(8, contact);
        pre.setString(9, custId);

        pre.executeUpdate();
        JOptionPane.showMessageDialog(null, "Customer Data Updated Successfully");
        
        
        txtFisrtName.setText("");        
        txtLastName.setText("");
        txtCustomerId.setText("");
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
            Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton searchCustomerBtn;
    private com.toedter.calendar.JDateChooser selectDob;
    private javax.swing.JRadioButton selectFemale;
    private javax.swing.JRadioButton selectMale;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtFisrtName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNic_Id;
    private javax.swing.JTextField txtPassportId;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
