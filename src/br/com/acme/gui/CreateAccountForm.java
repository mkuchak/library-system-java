/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acme.gui;

import br.com.acme.AcademicLibrary;

import javax.swing.JOptionPane;

import br.com.acme.User;
import java.awt.Frame;

/**
 *
 * @author
 */
public class CreateAccountForm extends javax.swing.JDialog {

    private AcademicLibrary library;
    private Frame MainWindowForm;

    /**
     * Creates new form CreateAccountForm
     */
    public CreateAccountForm(java.awt.Frame parent, boolean modal) {
        //library = ALManager.getInstance();
        super(parent, modal);
        this.MainWindowForm = parent;
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
        jtfName = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jtfLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbCreate = new javax.swing.JButton();
        jbClose = new javax.swing.JButton();
        jtfPhone = new javax.swing.JFormattedTextField();
        jpfPassword = new javax.swing.JPasswordField();
        jpfPasswordConfirm = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Create User Account");

        jtfName.setName("jtfName"); // NOI18N

        jtfEmail.setName("jtfEmail"); // NOI18N

        jtfLogin.setName("jtfLogin"); // NOI18N

        jLabel2.setText("Name: ");

        jLabel3.setText("Email: ");

        jLabel4.setText("Phone:");

        jLabel5.setText("Login:");

        jLabel6.setText("Password:");

        jbCreate.setText("Create");
        jbCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCreateActionPerformed(evt);
            }
        });

        jbClose.setText("Close");
        jbClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCloseActionPerformed(evt);
            }
        });

        try {
            jtfPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("Confirm Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbClose, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfEmail)
                            .addComponent(jtfLogin)
                            .addComponent(jtfPhone)
                            .addComponent(jpfPassword)
                            .addComponent(jpfPasswordConfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpfPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCreate)
                    .addComponent(jbClose))
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCreateActionPerformed
        String name = jtfName.getText();
        String email = jtfEmail.getText();
        String phone = jtfPhone.getText();
        String login = jtfLogin.getText().trim();
        String password = jpfPassword.getText();
        if (!validateForm().isEmpty()) {
            GUIMessage.error(validateForm());
            return;
        }
        User usr = new User(name, email, phone, login, password);
        clearForm();
        GUIMessage.info("User added successfully.");
    }//GEN-LAST:event_jbCreateActionPerformed

    private String validateForm() {
        String name = jtfName.getText();
        String email = jtfEmail.getText();
        String phone = jtfPhone.getText();
        String login = jtfLogin.getText().trim();
        String password = jpfPassword.getText();
        String confirmPassword = jpfPasswordConfirm.getText();
        if (name.isEmpty()) {
            return "The name field can not be null.";
        }
        if (email.isEmpty()) {
            return "The e-mail field can not be null.";
        }
        if ("(  )      -    ".equals(phone)) {
            return "The phone field can not be null.";
        }
        if (login.isEmpty()) {
            return "The login field can not be null.";
        }
        if (password.isEmpty()) {
            return "The password field can not be null.";
        }
        if (!password.equals(confirmPassword)) {
            return "The confirm password must be identical as password field.";
        }
        return "";
    }

    private void clearForm() {
        jtfName.setText("");
        jtfEmail.setText("");
        jtfPhone.setText("");
        jtfLogin.setText("");
        jpfPassword.setText("");
        jpfPasswordConfirm.setText("");
    }

    private void jbCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloseActionPerformed
        this.setVisible(false);
        this.MainWindowForm.setVisible(true);
    }//GEN-LAST:event_jbCloseActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbClose;
    private javax.swing.JButton jbCreate;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JPasswordField jpfPasswordConfirm;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfName;
    private javax.swing.JFormattedTextField jtfPhone;
    // End of variables declaration//GEN-END:variables
}
