/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acme.gui;

import br.com.acme.User;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Certa
 */
public class LoginForm extends javax.swing.JDialog {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
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

        jLabel1 = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jpfPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbValidate = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Academic Libray Control System");

        jtfLogin.setText("admin");
        jtfLogin.setName("jtfLogin"); // NOI18N
        jtfLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfLoginKeyPressed(evt);
            }
        });

        jpfPassword.setText("admin");
        jpfPassword.setName("jpfPassword"); // NOI18N
        jpfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpfPasswordKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/icons/common/door-key.png"))); // NOI18N
        jLabel2.setText("Password:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/icons/common/unlocked.png"))); // NOI18N
        jLabel3.setText("Login:");

        jbValidate.setText("Login");
        jbValidate.setName("jbValidate"); // NOI18N
        jbValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbValidateActionPerformed(evt);
            }
        });

        jbCancel.setText("Cancel");
        jbCancel.setName("jbCancel"); // NOI18N
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jpfPassword)
                                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbValidate)
                    .addComponent(jbCancel))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbValidateActionPerformed
        String login = jtfLogin.getText().trim(); //trim remove espaço em branco da string
        String password = new String(jpfPassword.getPassword());

        User usr = new User(login, password);
        if (usr.isValid()) { //Logged in
            MainWindowForm form = new MainWindowForm(this, usr); //Open app
            form.setVisible(true);
            this.setVisible(false); //Hide login form, but mantain on memory
            //this.dispose(); //Kill form and release from memory
        } else { //Not logged
            GUIMessage.info("Invalid user or password.");

        }
    }//GEN-LAST:event_jbValidateActionPerformed

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        if (GUIMessage.exit() == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jbCancelActionPerformed

    private void validateUser() {
        String login = jtfLogin.getText().trim(); //Trim remove string spaces
        String password = new String(jpfPassword.getPassword());

        User usr = new User(login, password);
        if (usr.isValid()) {
            MainWindowForm form = new MainWindowForm(this, usr);
            form.setVisible(true);
            jtfLogin.setText("");
            jpfPassword.setText("");
            jtfLogin.requestFocus();
            this.setVisible(false);
        } else {
            GUIMessage.info("Invalid user access.");
        }
    }

    private void jpfPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfPasswordKeyPressed
        if (evt.getKeyCode() == com.sun.glass.events.KeyEvent.VK_ENTER) {
            validateUser();
        }
    }//GEN-LAST:event_jpfPasswordKeyPressed

    private void jtfLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfLoginKeyPressed
        if (evt.getKeyCode() == com.sun.glass.events.KeyEvent.VK_ENTER) {
            validateUser();
        }
    }//GEN-LAST:event_jtfLoginKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbValidate;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JTextField jtfLogin;
    // End of variables declaration//GEN-END:variables
}
