/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Main;

import com.teacher.attendance;
import com.user.frmLogin;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;

/**
 *
 * @author prerna badoni
 */
public class teacher_form extends javax.swing.JFrame {

    /**
     * Creates new form teacher_form
     */
    public teacher_form() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRoll = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        btnCheck1 = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnAddAtt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText(" ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Enter Roll_no:");

        txtRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRollActionPerformed(evt);
            }
        });

        btnCheck.setBackground(new java.awt.Color(153, 204, 255));
        btnCheck.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCheck.setText(" Check attendance");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btnCheck1.setBackground(new java.awt.Color(153, 204, 255));
        btnCheck1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCheck1.setText(" Check Student Details");
        btnCheck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheck1ActionPerformed(evt);
            }
        });

        btncancel.setBackground(new java.awt.Color(255, 0, 0));
        btncancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btncancel.setText("cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnAddAtt.setBackground(new java.awt.Color(153, 204, 255));
        btnAddAtt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddAtt.setText("ADD ATTENDANCE");
        btnAddAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btnCheck1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(btncancel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnAddAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheck1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnAddAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btncancel)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Attendance Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(149, 149, 149))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRollActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your
        if(txtRoll.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please Enter roll_no!");
            txtRoll.setText("");
            txtRoll.grabFocus(); 
        }
        else
        {
            String rn=txtRoll.getText();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/attendance_system","root","");
                if(con!=null)
                {
                    System.out.println("Connected");
                }
                else
                {
                    System.out.println("Connection is not done");
                }
                String s = "SELECT * FROM attendance_record WHERE  roll_no = ?";
                  try (PreparedStatement preparedStatement = con.prepareStatement(s)) {
                preparedStatement.setString(1, rn);
                //preparedStatement.setString(2, pass);
                  ResultSet resultSet = preparedStatement.executeQuery();
                  StringBuilder attendance_details=new StringBuilder();



                  while(resultSet.next())
                  {
                     // System.out.println("Login successful");
                      String record = resultSet.getString("attendance");
                Date date = resultSet.getDate("date");
                attendance_details.append ("\nAttendance Record: ").append(record).append("\nDate: ").append(date);
                }
if(attendance_details.length()>0)
{
                      
                      JOptionPane.showMessageDialog(this,attendance_details.toString(),"Attendance Details", JOptionPane.INFORMATION_MESSAGE);
                      }
                  
                  else
                  {
                      System.out.println("Access Unsuccessful");
                    JOptionPane.showMessageDialog(this, "Attendance Record not found for the entered roll_no");
                      txtRoll.setText("");
                       
                        txtRoll.requestFocus();
                  }
                     
                      
                  }
                  /*else
                  {
                      JOptionPane.showMessageDialog(this,"Invalid username and password");
                      txtUser.setText("");
                       txtPass.setText("");
                        txtUser.requestFocus();
                  }*/
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnCheck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheck1ActionPerformed
        // TODO add your handling code here:
        if(txtRoll.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please Enter roll_no!");
            txtRoll.setText("");
            txtRoll.grabFocus(); 
        }
        else
        {
            String rno=txtRoll.getText();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/attendance_system","root","");
                if(con!=null)
                {
                    System.out.println("Connected");
                }
                else
                {
                    System.out.println("Connection is not done");
                }
                String r = "SELECT * FROM student WHERE  roll_no = ?";
                  try (PreparedStatement preparedStatement = con.prepareStatement(r)) {
                preparedStatement.setString(1, rno);
                //preparedStatement.setString(2, pass);
                  ResultSet resultSet = preparedStatement.executeQuery();
                  StringBuilder details=new StringBuilder();
                  if(resultSet.next())
                  {
                      
                   String n = resultSet.getString("name");
                   String cont=resultSet.getString("contact");
                   details.append ("\nname : ").append(n).append("\ncontact: ").append(cont);
                   JOptionPane.showMessageDialog(this,details.toString(),"Details ", JOptionPane.INFORMATION_MESSAGE);
                  }
                  else
                  {
                      System.out.println("Access Unsuccessful");
                    JOptionPane.showMessageDialog(this, "Details  not found for the entered roll_no");
                      txtRoll.setText("");
                       
                        txtRoll.requestFocus();
                  }
                      
                  }
                  } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
                  
            
        
                  
    }//GEN-LAST:event_btnCheck1ActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnAddAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAttActionPerformed
        // TODO add your handling code here:
        if(txtRoll.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please Enter roll_no!");
            txtRoll.setText("");
            txtRoll.grabFocus(); 
        }
        else
        {
        attendance at=new attendance();
        this.hide();
        at.show();
        }
        
    }//GEN-LAST:event_btnAddAttActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(teacher_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacher_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacher_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacher_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teacher_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAtt;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnCheck1;
    private javax.swing.JButton btncancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtRoll;
    // End of variables declaration//GEN-END:variables
}
