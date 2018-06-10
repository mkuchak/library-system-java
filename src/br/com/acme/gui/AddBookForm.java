/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acme.gui;

import br.com.acme.AcademicLibrary;
import java.awt.Frame;
import br.com.acme.Author;
import br.com.acme.Book;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Willian P
 */
public class AddBookForm extends javax.swing.JDialog {

    private final Frame MainWindowForm;
    private List<Author> authors;
    private AcademicLibrary library;

    /**
     * Creates new form Book
     */
    public AddBookForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ArrayList<Author> authors;
        //library = ALManager.getInstance();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfTitle = new javax.swing.JTextField();
        jtfVolume = new javax.swing.JTextField();
        jtfYear = new javax.swing.JTextField();
        jtfIsbn = new javax.swing.JTextField();
        jtfLanguage = new javax.swing.JTextField();
        jtfPages = new javax.swing.JTextField();
        jbAddAuthor = new javax.swing.JButton();
        jbOk = new javax.swing.JButton();
        jbClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Book");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Book");

        jLabel2.setText("Title:");

        jLabel3.setText("Year:");

        jLabel4.setText("Volume:");

        jLabel5.setText("Language:");

        jLabel6.setText("ISBN:");

        jLabel7.setText("Pages:");

        jtfTitle.setName("jtfTitle"); // NOI18N

        jtfVolume.setName("jtfVolume"); // NOI18N

        jtfYear.setName("jtfYear"); // NOI18N

        jtfIsbn.setName("jtfIsbn"); // NOI18N

        jtfLanguage.setName("jtfLanguage"); // NOI18N
        jtfLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLanguageActionPerformed(evt);
            }
        });

        jtfPages.setName("jtfPages"); // NOI18N

        jbAddAuthor.setText("Add Author");
        jbAddAuthor.setName("jbAddAuthor"); // NOI18N
        jbAddAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddAuthorActionPerformed(evt);
            }
        });

        jbOk.setText("OK");
        jbOk.setName("jbOk"); // NOI18N
        jbOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOkActionPerformed(evt);
            }
        });

        jbClose.setText("Close");
        jbClose.setName("jbClose"); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jtfPages)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbAddAuthor)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtfVolume, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                .addComponent(jtfYear, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jtfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20)
                        .addComponent(jtfLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jbOk, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jbClose)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAddAuthor)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbOk)
                    .addComponent(jbClose))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLanguageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLanguageActionPerformed

    private void jbAddAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddAuthorActionPerformed
        AuthorForm author = new AuthorForm(this, true);
        author.setVisible(true); //exibe o dialog do author
        this.setVisible(false);//esconde a tela book

    }//GEN-LAST:event_jbAddAuthorActionPerformed

    private void jbOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkActionPerformed
        String title = jtfTitle.getText();
        String year = jtfYear.getText();
        String volume = jtfVolume.getText();
        String language = jtfLanguage.getText();
        String isbn = jtfIsbn.getText();
        String pages = jtfPages.getText();
        
        //b.setAuthors(authors);
        Book b = new Book(jtfLanguage.getText(), Long.parseLong(jtfIsbn.getText()), Short.parseShort(jtfPages.getText()), jtfTitle.getText(), Short.parseShort(jtfYear.getText()), Byte.parseByte(jtfVolume.getText()));            
         
        this.library.addPublication(b);
        
        GUIMessage.info("BOOK adicionado com sucesso");
        clearComponents();

    }//GEN-LAST:event_jbOkActionPerformed

    private void clearComponents() {
        jtfTitle.setText("");
        jtfYear.setText("");
        jtfVolume.setText("");
        jtfLanguage.setText("");
        jtfIsbn.setText("");
        jtfPages.setText("");
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
    private javax.swing.JButton jbAddAuthor;
    private javax.swing.JButton jbClose;
    private javax.swing.JButton jbOk;
    private javax.swing.JTextField jtfIsbn;
    private javax.swing.JTextField jtfLanguage;
    private javax.swing.JTextField jtfPages;
    private javax.swing.JTextField jtfTitle;
    private javax.swing.JTextField jtfVolume;
    private javax.swing.JTextField jtfYear;
    // End of variables declaration//GEN-END:variables
}
