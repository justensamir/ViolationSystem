
import Classes.exciption;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import Classes.*;import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.util.Vector;
import javax.swing.UIManager;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tawfek
 */

public class Login extends javax.swing.JFrame {
   
    private Object jTextField1;
    String b="basem",pass="12345";

     String u_name=new String();
    public Login() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        initComponents();
   
        try{
      //  JFXPanel j=new JFXPanel();
       // String uri=new File("firework.wav").toURI().toString();
       // new MediaPlayer(new Media (uri)).play();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        user_name = new javax.swing.JTextField();
        passs = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        show = new javax.swing.JCheckBox();
        admin = new javax.swing.JRadioButton();
        head = new javax.swing.JRadioButton();
        inspector = new javax.swing.JRadioButton();
        member = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 102, 204));
        setLocation(new java.awt.Point(220, 90));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 102), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 102, 102), new java.awt.Color(255, 102, 51)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_name.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        user_name.setBorder(null);
        user_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        user_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_nameMouseClicked(evt);
            }
        });
        user_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_nameActionPerformed(evt);
            }
        });
        jPanel2.add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 210, 30));

        passs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passs.setBorder(null);
        passs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passsMousePressed(evt);
            }
        });
        passs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passsActionPerformed(evt);
            }
        });
        jPanel2.add(passs, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 210, 30));

        jButton1.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jButton1.setText("Login");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 270, 30));

        jLabel2.setFont(new java.awt.Font("Gabriola", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Violation System");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, 50));

        jLabel3.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel3.setText("Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        jLabel4.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel4.setText("Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 210, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 210, 10));

        show.setBackground(new java.awt.Color(255, 255, 255));
        show.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, 20));

        admin.setBackground(new java.awt.Color(255, 255, 255));
        admin.setFont(new java.awt.Font("Gabriola", 0, 20)); // NOI18N
        admin.setText("Admin");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        jPanel2.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 20));

        head.setBackground(new java.awt.Color(255, 255, 255));
        head.setFont(new java.awt.Font("Gabriola", 0, 20)); // NOI18N
        head.setText("Head");
        head.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headActionPerformed(evt);
            }
        });
        jPanel2.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, 20));

        inspector.setBackground(new java.awt.Color(255, 255, 255));
        inspector.setFont(new java.awt.Font("Gabriola", 0, 20)); // NOI18N
        inspector.setText("Inspector");
        inspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inspectorActionPerformed(evt);
            }
        });
        jPanel2.add(inspector, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, 20));

        member.setBackground(new java.awt.Color(255, 255, 255));
        member.setFont(new java.awt.Font("Gabriola", 0, 20)); // NOI18N
        member.setText("Member");
        member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberActionPerformed(evt);
            }
        });
        jPanel2.add(member, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 340, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\kolia\\My PRojet\\oop\\BG\\Main Project oop\\2.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 110, 470, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // prog.setVisible(true);

        if((admin.isSelected()&&member.isSelected()&&inspector.isSelected())||(admin.isSelected()&&member.isSelected())||(member.isSelected()&&inspector.isSelected())||(admin.isSelected()&&inspector.isSelected()))
        {
                           exciption w=new exciption( "Choose One Jop");
            JOptionPane.showMessageDialog(rootPane,w.view_exciption());
            // prog.setValue(100);
        }
        else if(!admin.isSelected()&&!member.isSelected()&&!inspector.isSelected()&&!head.isSelected())
        {
             exciption w=new exciption( "You should be sure that you Enter a Right Job  ");
            JOptionPane.showMessageDialog(rootPane,w.view_exciption());
        }
        else   if(user_name.getText().equals("")||passs.getText().equals(""))
        {
              exciption w=new exciption( "Enter User_Name and User_password  ");
            JOptionPane.showMessageDialog(rootPane,w.view_exciption());
        }
        else {
        if(admin.isSelected()){
            if(user_name.getText().equals(b)&&passs.getText().equals(pass)){
                Admin a=new Admin();
                a.setVisible(true);
                this.setVisible(false);
            }
            else {
                        exciption w=new exciption("Invalid User_Name Or Password !");
            JOptionPane.showMessageDialog(rootPane,w.view_exciption());
            }
            //prog.setValue(100);
        }
        else if(inspector.isSelected())
        {

            inspec a;
            try {
                a = new inspec();
                if(a.login(user_name.getText(), passs.getText(),"inspector")){
                    Inspector2 s =new Inspector2(user_name.getText());
                    s.setVisible(true);
                    this.setVisible(false);
                }
                else {
                                       exciption w=new exciption("Invalid User_Name Or Password !");
            JOptionPane.showMessageDialog(rootPane,w.view_exciption());
                }
            }
            catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(member.isSelected())
        {
            member a;
            try {
                a = new member();
                if(a.login(user_name.getText(), passs.getText(),"member")){
                    hearing h=new hearing();
                    h.setVisible(true);
                    this.setVisible(false);
                }
                else {
                                    exciption w=new exciption("Invalid User_Name Or Password !");
            JOptionPane.showMessageDialog(rootPane,w.view_exciption());
                }
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(head.isSelected())
        {
            headd k;
            try {
                k = new headd();
                if(k.login(user_name.getText(), passs.getText(),"head")){
                    head h=new head();
                    h.setVisible(true);
                    this.setVisible(false);
                }
                else {
                                     exciption w=new exciption("Invalid User_Name Or Password !");
            JOptionPane.showMessageDialog(rootPane,w.view_exciption());
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passsActionPerformed
        //prog.setValue(100);
    }//GEN-LAST:event_passsActionPerformed

    private void passsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passsMousePressed

    }//GEN-LAST:event_passsMousePressed

    private void passsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passsMouseClicked
        // TODO add your handling code here:

        passs.setText("");
    }//GEN-LAST:event_passsMouseClicked

    private void user_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_nameActionPerformed

    }//GEN-LAST:event_user_nameActionPerformed

    private void user_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_nameMouseClicked
        // TODO add your handling code here:

        u_name= user_name.getText();
        if(u_name.equals("User Name"))
        {
            user_name.setText("");
            // prog.setValue(100);
        }
    }//GEN-LAST:event_user_nameMouseClicked

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
        if(show.isSelected()){
            passs.setEchoChar((char)0);
        }
        else{
            passs.setEchoChar('*');
        }
    }//GEN-LAST:event_showActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
        
            
                head.setSelected(false);
            
                member.setSelected(false);
            
                inspector.setSelected(false);
        
    }//GEN-LAST:event_adminActionPerformed

    private void headActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headActionPerformed
        // TODO add your handling code here:
        
                admin.setSelected(false);
           
                member.setSelected(false);
            
                inspector.setSelected(false);
        
    }//GEN-LAST:event_headActionPerformed

    private void inspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inspectorActionPerformed
        // TODO add your handling code here:
        
                head.setSelected(false);
            
                member.setSelected(false);
           
                admin.setSelected(false);
        
    }//GEN-LAST:event_inspectorActionPerformed

    private void memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberActionPerformed
        // TODO add your handling code here:
       
                head.setSelected(false);
            
                admin.setSelected(false);
           
                inspector.setSelected(false);
        
    }//GEN-LAST:event_memberActionPerformed

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
               // if ("Nimbus".equals(info.getName())) {
               //     javax.swing.UIManager.setLookAndFeel(info.getClassName());
                 //   break;
               // }
                 UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
           
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton admin;
    private javax.swing.JRadioButton head;
    private javax.swing.JRadioButton inspector;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton member;
    private javax.swing.JPasswordField passs;
    private javax.swing.JCheckBox show;
    private javax.swing.JTextField user_name;
    // End of variables declaration//GEN-END:variables
}
