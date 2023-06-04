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
public class TicketGeneration extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddCustomer
     */
    public TicketGeneration() {
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
        labelDot = new javax.swing.JLabel();
        labelFlightName = new javax.swing.JLabel();
        txtDot = new javax.swing.JTextField();
        txtPassportId = new javax.swing.JTextField();
        labelSeats = new javax.swing.JLabel();
        TxtFlightName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelTicketId = new javax.swing.JLabel();
        txtTicketId = new javax.swing.JTextField();
        seachTicketIdBtn = new javax.swing.JButton();
        labelDeparture = new javax.swing.JLabel();
        labelArrival = new javax.swing.JLabel();
        txtDeparture = new javax.swing.JTextField();
        labelCustomerName = new javax.swing.JLabel();
        labelArrivalTime = new javax.swing.JLabel();
        labelFair = new javax.swing.JLabel();
        labelTotalPrice = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        txtArrivaltime = new javax.swing.JTextField();
        txtSeat = new javax.swing.JTextField();
        txtFair = new javax.swing.JTextField();
        labelPassportId = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        labelClassOfTravel = new javax.swing.JLabel();
        txtClassOFTravel = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();
        txtArrival = new javax.swing.JTextField();

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

        labelDot.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelDot.setText("Date Of Travel");

        labelFlightName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelFlightName.setText("Flight Name");

        txtPassportId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassportIdActionPerformed(evt);
            }
        });

        labelSeats.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelSeats.setText("No. Of Seats");

        TxtFlightName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFlightNameActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("Welcome to Jolly Journey Ticket Generation");

        labelTicketId.setBackground(new java.awt.Color(0, 102, 102));
        labelTicketId.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelTicketId.setForeground(new java.awt.Color(255, 255, 255));
        labelTicketId.setText("Ticket Id");

        seachTicketIdBtn.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        seachTicketIdBtn.setText("Search");
        seachTicketIdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seachTicketIdBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTicketId, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTicketId, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(seachTicketIdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTicketId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTicketId, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(seachTicketIdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        labelDeparture.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelDeparture.setText("Departure");

        labelArrival.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelArrival.setText("Arrival");

        txtDeparture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartureActionPerformed(evt);
            }
        });

        labelCustomerName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelCustomerName.setText("Customer Name ");

        labelArrivalTime.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelArrivalTime.setText("Arrival Time");

        labelFair.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelFair.setText("Charge");

        labelTotalPrice.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelTotalPrice.setText("Total Cost");

        txtFair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFairActionPerformed(evt);
            }
        });

        labelPassportId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelPassportId.setText("Passport Id");

        txtTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPriceActionPerformed(evt);
            }
        });

        labelClassOfTravel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelClassOfTravel.setText("Class of Travel");

        cancelBtn.setText("Cancel Ticket");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        txtArrival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArrivalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDeparture)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelPassportId)
                                .addGap(69, 69, 69)
                                .addComponent(txtPassportId, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelArrival)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtArrival, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCustomerName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelFlightName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtFlightName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotalPrice)
                    .addComponent(labelFair, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSeats)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDot)
                            .addComponent(labelArrivalTime)))
                    .addComponent(labelClassOfTravel))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClassOFTravel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArrivaltime, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDot, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFair, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCustomerName)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDot))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassportId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArrivaltime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelArrivalTime)
                    .addComponent(labelPassportId))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtFlightName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSeats)
                    .addComponent(labelFlightName))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelArrival)
                    .addComponent(labelClassOfTravel)
                    .addComponent(txtClassOFTravel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDeparture)
                    .addComponent(txtDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFair)
                    .addComponent(txtFair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTotalPrice)
                            .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDepartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartureActionPerformed

    private void txtPassportIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassportIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassportIdActionPerformed

    private void TxtFlightNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFlightNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFlightNameActionPerformed

    private void txtFairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFairActionPerformed

    private void txtTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPriceActionPerformed

    private void seachTicketIdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seachTicketIdBtnActionPerformed
        String TicketId = txtTicketId.getText();
        try {

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost/flight_booking", "root", "Shamshad@1");
            pre = con.prepareStatement("Select * from ticket where TicketId=?");

            pre.setString(1, TicketId);

            ResultSet rs = pre.executeQuery();

            if (rs.next() == false) {
                JOptionPane.showMessageDialog(null, "Record not found");
                
            } else {
//TicketId,custId,Fname,Lname,Passport,FlightId,,,,,,Duration,,,, 
                String FN = rs.getString("Fname");
                String LN = rs.getString("Lname");
                String passport = rs.getString("Passport");
                String Flightname = rs.getString("Flightname");
                String Arrival = rs.getString("Arrival");
                String Departure = rs.getString("Departure");
                String DOT = rs.getString("TravelDate");
                Date df = new SimpleDateFormat("dd-MM-YYYY").parse(DOT);
               
                String Arrival_time = rs.getString("ArrivalTime");
                String CT = rs.getString("Travelclass");
                String seats = rs.getString("Seats");
                String charge = rs.getString("Charge");
                String totalCost = rs.getString("Total");
                txtCustomerName.setText(FN.trim() + " " + LN.trim());
                txtPassportId.setText(passport.trim());
                TxtFlightName.setText(Flightname.trim());
                txtArrival.setText(Arrival.trim());
                txtDeparture.setText(Departure.trim());
                txtDot.setText(DOT.trim());
                txtArrivaltime.setText(Arrival_time.trim());
                txtSeat.setText(seats.trim());
                txtClassOFTravel.setText(CT.trim());
                txtFair.setText(charge.trim());
                txtTotalPrice.setText(totalCost.trim());
            }

            

        }catch (ClassNotFoundException ex) {Logger.getLogger(BookFlight.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {Logger.getLogger(BookFlight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TicketGeneration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_seachTicketIdBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        String Ticketid = txtTicketId.getText();
        try {

            Class.forName("com.mysql.jdbc.Driver");

            
               con = DriverManager.getConnection("jdbc:mysql://localhost/flight_booking", "root", "Shamshad@1");
               pre = con.prepareStatement("delete from ticket where TicketId=?"); 
               pre.setString(1, Ticketid);
               txtCustomerName.setText("");
                txtPassportId.setText("");
                TxtFlightName.setText("");
                txtArrival.setText("");
                txtDeparture.setText("");
                txtDot.setText("");
                txtArrivaltime.setText("");
                txtSeat.setText("");
                txtClassOFTravel.setText("");
                txtFair.setText("");
                txtTotalPrice.setText("");
               pre.executeUpdate();
                JOptionPane.showMessageDialog(null, "Ticket Cancelled");
            

            

        }catch (ClassNotFoundException ex) {Logger.getLogger(BookFlight.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {Logger.getLogger(BookFlight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void txtArrivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArrivalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArrivalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtFlightName;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelArrival;
    private javax.swing.JLabel labelArrivalTime;
    private javax.swing.JLabel labelClassOfTravel;
    private javax.swing.JLabel labelCustomerName;
    private javax.swing.JLabel labelDeparture;
    private javax.swing.JLabel labelDot;
    private javax.swing.JLabel labelFair;
    private javax.swing.JLabel labelFlightName;
    private javax.swing.JLabel labelPassportId;
    private javax.swing.JLabel labelSeats;
    private javax.swing.JLabel labelTicketId;
    private javax.swing.JLabel labelTotalPrice;
    private javax.swing.JButton seachTicketIdBtn;
    private javax.swing.JTextField txtArrival;
    private javax.swing.JTextField txtArrivaltime;
    private javax.swing.JTextField txtClassOFTravel;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtDeparture;
    private javax.swing.JTextField txtDot;
    private javax.swing.JTextField txtFair;
    private javax.swing.JTextField txtPassportId;
    private javax.swing.JTextField txtSeat;
    private javax.swing.JTextField txtTicketId;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
