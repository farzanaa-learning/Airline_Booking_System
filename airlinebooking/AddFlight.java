/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.airlinebooking;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SYED IMRAN
 */
public class AddFlight extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddCustomer
     */
    public AddFlight() {
        initComponents();
        
        AutoId();
    }

    Connection con;
    PreparedStatement pre;

    public void AutoId() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost/flight_booking", "root", "Shamshad@1");
            pre = con.prepareStatement("Select MAX(FlightId) from addflight");
            ResultSet rs = pre.executeQuery();
            rs.next();
            if (rs.getString("MAX(FlightId)") == null) {
                autoFlightId.setText("F001");
            } else {
                int idLast = Integer.parseInt(rs.getString("MAX(FlightId)").substring(1, rs.getString("MAX(FlightId)").length()));
                idLast++;
                autoFlightId.setText("F" + String.format("%03d", idLast));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
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
        labelFlightId = new javax.swing.JLabel();
        labelFlightName = new javax.swing.JLabel();
        ftxtFightName = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelDepartureTime = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelDuration = new javax.swing.JLabel();
        labelFair = new javax.swing.JLabel();
        txtFair = new javax.swing.JTextField();
        txtArrivalTime = new javax.swing.JTextField();
        txtDepartureTime = new javax.swing.JTextField();
        labelArrivalTime = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        labelArrival = new javax.swing.JLabel();
        labelDot = new javax.swing.JLabel();
        selectDeparture = new javax.swing.JComboBox<>();
        selectArrival = new javax.swing.JComboBox<>();
        labelDeparture = new javax.swing.JLabel();
        selectDot = new com.toedter.calendar.JDateChooser();
        cancelBtn = new javax.swing.JButton();
        autoFlightId = new javax.swing.JLabel();

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

        setBackground(new java.awt.Color(221, 221, 221));
        setClosable(true);

        labelFlightId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        labelFlightId.setForeground(new java.awt.Color(255, 0, 102));
        labelFlightId.setText("Flight Id ");

        labelFlightName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelFlightName.setText("Flight Name");

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        labelDepartureTime.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelDepartureTime.setText("Departure Time");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        labelDuration.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelDuration.setText("Duration");

        labelFair.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelFair.setText("Flight Charge");

        labelArrivalTime.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelArrivalTime.setText("Arrival Time");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDepartureTime)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelDuration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelFair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labelArrivalTime)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel5)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDuration, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(txtFair)
                    .addComponent(txtDepartureTime)
                    .addComponent(txtArrivalTime))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelArrivalTime)
                    .addComponent(txtArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDepartureTime)
                    .addComponent(txtDepartureTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDuration)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFair)
                    .addComponent(txtFair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        labelArrival.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelArrival.setText("Arrival");

        labelDot.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelDot.setText("Date Of Travel");

        selectDeparture.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select", "Mumbai", "Bangalore", "Delhi", "Kolkata", "Chennai", }));

        selectArrival.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Mumbai", "Bangalore", "Delhi", "Kolkata", "Chennai",}));

        labelDeparture.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelDeparture.setText("Departure");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelDeparture)
                    .addComponent(selectDeparture, 0, 141, Short.MAX_VALUE)
                    .addComponent(selectArrival, 0, 141, Short.MAX_VALUE)
                    .addComponent(labelArrival)
                    .addComponent(labelDot)
                    .addComponent(selectDot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelArrival)
                .addGap(7, 7, 7)
                .addComponent(selectArrival, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelDeparture)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(labelDot)
                .addGap(18, 18, 18)
                .addComponent(selectDot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        autoFlightId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        autoFlightId.setForeground(new java.awt.Color(0, 51, 153));
        autoFlightId.setText("Flight Id ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(labelFlightName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ftxtFightName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelFlightId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(autoFlightId, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFlightId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(autoFlightId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFlightName)
                            .addComponent(ftxtFightName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {

            String F = ftxtFightName.getText();
            String Arrival = selectArrival.getSelectedItem().toString();
            String Flightid = autoFlightId.getText();
            String Departure = selectDeparture.getSelectedItem().toString();
            String Duration = txtDuration.getText();
            String Arrival_time = txtArrivalTime.getText();
            String Departure_time = txtDepartureTime.getText();
            String charge = txtFair.getText();
            
            
            
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-YYYY");
            selectDot.getJCalendar().setMinSelectableDate(new Date());
            String DOt = df.format(selectDot.getDate());

            if (Arrival.equalsIgnoreCase(Departure)) {
                JOptionPane.showMessageDialog(this, " Error Arrival and Departure are same ");
                ftxtFightName.setText("");
                selectArrival.setSelectedItem(null);
                autoFlightId.setText("");
                selectDeparture.setSelectedItem(null);
                txtDuration.setText("");
                txtFair.setText("");
                txtArrivalTime.setText("");
                txtDepartureTime.setText("");
                selectDot.setDate(null);
            } else {
                Class.forName("com.mysql.jdbc.Driver");

                con = DriverManager.getConnection("jdbc:mysql://localhost/flight_booking", "root", "Shamshad@1");
                pre = con.prepareStatement("Insert into addflight(FlightId, Flight_name, Arival, Departure, TravelDate, ArrivalTime, DepartureTime, duration, charge) value(?, ?, ?, ?, ?, ?, ?, ?, ?)");
                pre.setString(1, Flightid);
                pre.setString(2, F);
                pre.setString(3, Arrival);
                pre.setString(4, Departure);
                pre.setString(5, DOt);
                pre.setString(6, Arrival_time);
                pre.setString(7, Departure_time);
                pre.setString(8, Duration);
                pre.setString(9, charge);

                pre.executeUpdate();
                JOptionPane.showMessageDialog(null, "Flight Data added Successfully");

                AutoId();
                Flightid = autoFlightId.getText();
                
                ftxtFightName.setText("");
                selectArrival.setSelectedItem(0);
                autoFlightId.setText(Flightid);
                selectDeparture.setSelectedItem(0);
                txtArrivalTime.setText("");
                txtDepartureTime.setText("");
                txtDuration.setText("");
                txtFair.setText("");
                selectDot.setDate(null);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
                ftxtFightName.setText("");
                selectArrival.setSelectedItem(0);
                autoFlightId.setText("");
                selectDeparture.setSelectedItem(0);
                txtFair.setText("");
                txtDuration.setText("");
                txtArrivalTime.setText("");
                txtDepartureTime.setText("");
                selectDot.setDate(null);
    }//GEN-LAST:event_cancelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel autoFlightId;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField ftxtFightName;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelArrival;
    private javax.swing.JLabel labelArrivalTime;
    private javax.swing.JLabel labelDeparture;
    private javax.swing.JLabel labelDepartureTime;
    private javax.swing.JLabel labelDot;
    private javax.swing.JLabel labelDuration;
    private javax.swing.JLabel labelFair;
    private javax.swing.JLabel labelFlightId;
    private javax.swing.JLabel labelFlightName;
    private javax.swing.JComboBox<String> selectArrival;
    private javax.swing.JComboBox<String> selectDeparture;
    private com.toedter.calendar.JDateChooser selectDot;
    private javax.swing.JTextField txtArrivalTime;
    private javax.swing.JTextField txtDepartureTime;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtFair;
    // End of variables declaration//GEN-END:variables
}
