/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acme.gui;

import br.com.acme.ALManager;
import br.com.acme.AcademicLibrary;
import br.com.acme.User;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Marcos Kuchak Filho
 */
public class AccountListForm extends javax.swing.JDialog {

    private final AcademicLibrary library;

    /**
     * Creates new form AccountListForm
     *
     * @param parent
     * @param modal
     */
    public AccountListForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        library = ALManager.getInstance();
        populateTable();

    }

    private void populateTable() {
        DefaultTableModel rows = (DefaultTableModel) jtAccounts.getModel();
        TableModel model = jtAccounts.getModel();

        int line = 0;
        for (User u : library.getUsers()) {
            rows.addRow(new Object[]{});
            model.setValueAt(u.getName(), line, 0);
            model.setValueAt(u.getEmail(), line, 1);
            model.setValueAt(u.getPhone(), line, 2);
            model.setValueAt(u.getLogin(), line, 3);
            model.setValueAt(u.getPassword(), line, 4);
            line++;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtAccounts = new javax.swing.JTable();
        jbDelete = new javax.swing.JButton();
        jbClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Account List");
        setResizable(false);

        jtAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Phone", "Login", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtAccounts);

        jbDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/icons/common/garbage.png"))); // NOI18N
        jbDelete.setText("Delete");
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });

        jbClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/icons/common/close.png"))); // NOI18N
        jbClose.setText("Close");
        jbClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jbDelete)
                .addGap(32, 32, 32)
                .addComponent(jbClose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDelete)
                    .addComponent(jbClose))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbCloseActionPerformed

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        if (GUIMessage.action() == JOptionPane.YES_OPTION) {
            //action code here
            if (jtAccounts.getSelectedRow() != -1) {
                DefaultTableModel rows = (DefaultTableModel) jtAccounts.getModel();
                TableModel model = jtAccounts.getModel();
                library.removeUser((String) model.getValueAt(jtAccounts.getSelectedRow(), 3));
                rows.removeRow(jtAccounts.getSelectedRow());
            }
        }
    }//GEN-LAST:event_jbDeleteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbClose;
    private javax.swing.JButton jbDelete;
    private javax.swing.JTable jtAccounts;
    // End of variables declaration//GEN-END:variables
}
