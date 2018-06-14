/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acme.gui;

import br.com.acme.ALManager;
import br.com.acme.AcademicLibrary;
import br.com.acme.Article;
import br.com.acme.Author;
import br.com.acme.Journal;
import br.com.acme.Publisher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcos Kuchak Filho
 */
public class AddArticleForm extends javax.swing.JDialog {

    private static List<Author> authors;
    private static ArrayList keyWords = new ArrayList();
    private final AcademicLibrary library;

    /**
     * Creates new form AddArticleForm
     *
     * @param parent
     * @param modal
     */
    public AddArticleForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        AddArticleForm.authors = new ArrayList();
        AddArticleForm.keyWords = new ArrayList();
        this.library = ALManager.getInstance();
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
        jtfTitle = new javax.swing.JTextField();
        jbAddAuthor = new javax.swing.JButton();
        jbAddKeyword = new javax.swing.JButton();
        jtfYear = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfVolume = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfLanguage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfIssn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfStartPage = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfEndPage = new javax.swing.JTextField();
        jbOk = new javax.swing.JButton();
        jbClose = new javax.swing.JButton();
        jpJournal = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfImpactFactor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtfPublisher = new javax.swing.JTextField();
        jtfCountry = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Title:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Article");

        jtfTitle.setName("jtfTitle"); // NOI18N

        jbAddAuthor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/icons/common/add.png"))); // NOI18N
        jbAddAuthor.setText("Add Author");
        jbAddAuthor.setName("jbAddAuthor"); // NOI18N
        jbAddAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddAuthorActionPerformed(evt);
            }
        });

        jbAddKeyword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/icons/common/filter.png"))); // NOI18N
        jbAddKeyword.setText("Add Keyword");
        jbAddKeyword.setName("jbAddKeyword"); // NOI18N
        jbAddKeyword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddKeywordActionPerformed(evt);
            }
        });

        jtfYear.setName("jtfYear"); // NOI18N

        jLabel3.setText("Year:");

        jtfVolume.setName("jtfVolume"); // NOI18N

        jLabel4.setText("Volume:");

        jtfLanguage.setName("jtfLanguage"); // NOI18N

        jLabel5.setText("Language:");

        jtfIssn.setName("jtfIssn"); // NOI18N

        jLabel6.setText("ISSN:");

        jtfStartPage.setName("jtfStartPage"); // NOI18N

        jLabel7.setText("Start Page:");

        jtfEndPage.setName("jtfEndPage"); // NOI18N

        jbOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/icons/common/check.png"))); // NOI18N
        jbOk.setText("OK");
        jbOk.setName("jbOk"); // NOI18N
        jbOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOkActionPerformed(evt);
            }
        });

        jbClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/acme/icons/common/close.png"))); // NOI18N
        jbClose.setText("Close");
        jbClose.setName("jbClose"); // NOI18N
        jbClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCloseActionPerformed(evt);
            }
        });

        jpJournal.setBorder(javax.swing.BorderFactory.createTitledBorder("Journal"));
        jpJournal.setToolTipText("");
        jpJournal.setName("jpJournal"); // NOI18N

        jLabel9.setText("Name:");

        jtfName.setName("jtfYear"); // NOI18N

        jLabel10.setText("Impact Factor:");

        jtfImpactFactor.setName("jtfYear"); // NOI18N

        jLabel11.setText("Publisher:");

        jLabel12.setText("Country:");

        jtfPublisher.setName("jtfYear"); // NOI18N

        jtfCountry.setName("jtfYear"); // NOI18N

        javax.swing.GroupLayout jpJournalLayout = new javax.swing.GroupLayout(jpJournal);
        jpJournal.setLayout(jpJournalLayout);
        jpJournalLayout.setHorizontalGroup(
            jpJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpJournalLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jpJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpJournalLayout.createSequentialGroup()
                        .addGroup(jpJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(42, 42, 42)
                        .addGroup(jpJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpJournalLayout.createSequentialGroup()
                        .addGroup(jpJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpJournalLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpJournalLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(63, 63, 63)))
                        .addGroup(jpJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfImpactFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jpJournalLayout.setVerticalGroup(
            jpJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpJournalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtfImpactFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtfPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtfCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel8.setText("End Page:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jtfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfStartPage, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfEndPage, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfIssn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbOk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbClose))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtfVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtfYear, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jbAddAuthor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbAddKeyword)))
                        .addGap(18, 18, 18)
                        .addComponent(jpJournal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpJournal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAddAuthor)
                            .addComponent(jbAddKeyword))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtfIssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtfEndPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jtfStartPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbOk)
                            .addComponent(jbClose))
                        .addGap(14, 14, 14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbAddAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddAuthorActionPerformed
        AuthorForm author = new AuthorForm(this, true, authors);
        author.setVisible(true);
    }//GEN-LAST:event_jbAddAuthorActionPerformed

    private void jbOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkActionPerformed
        if (validateForm()) {
            return;
        }

        String name = jtfName.getText();
        byte impactFactor = Byte.parseByte(jtfImpactFactor.getText());
        String publisher = jtfPublisher.getText();
        String country = jtfCountry.getText();
        long issn = Long.parseLong(jtfIssn.getText());
        short startPage = Short.parseShort(jtfStartPage.getText());
        short endPage = Short.parseShort(jtfEndPage.getText());
        String title = jtfTitle.getText();
        short year = Short.parseShort(jtfYear.getText());
        byte volume = Byte.parseByte(jtfVolume.getText());

        Journal journal = new Journal(jtfName.getText(), impactFactor, new Publisher(publisher, country));
        Article article = new Article(issn, (byte) 0, startPage, endPage, title, year, volume);

        article.setJournal(journal);
        article.setKeyWords(keyWords);
        article.setAuthors(authors);
        library.addPublication(article);

        clearForm();
        GUIMessage.info("Article added successfully.");
    }//GEN-LAST:event_jbOkActionPerformed

    private boolean validateForm() {
        String name = jtfName.getText();
        String publisher = jtfPublisher.getText();
        String country = jtfCountry.getText();
        String title = jtfTitle.getText();
        String language = jtfLanguage.getText();
        String authorsField = authors.toString();
        try {
            byte impactFactor = Byte.parseByte(jtfImpactFactor.getText());
            long issn = Long.parseLong(jtfIssn.getText());
            short startPage = Short.parseShort(jtfStartPage.getText());
            short endPage = Short.parseShort(jtfEndPage.getText());
            short year = Short.parseShort(jtfYear.getText());
            byte volume = Byte.parseByte(jtfVolume.getText());
        } catch (NumberFormatException ex) {
            GUIMessage.error("Fill all the fields with real values.");
            return true;
        }
        if ("[]".equals(authorsField)) {
            GUIMessage.error("Add some author for this article.");
            return true;
        }
        if (name.isEmpty()) {
            GUIMessage.error("The name field can not be null.");
            return true;
        }
        if (publisher.isEmpty()) {
            GUIMessage.error("The publisher field can not be null.");
            return true;
        }
        if (country.isEmpty()) {
            GUIMessage.error("The country field can not be null.");
            return true;
        }
        if (title.isEmpty()) {
            GUIMessage.error("The title field can not be null.");
            return true;
        }
        if (language.isEmpty()) {
            GUIMessage.error("The title field can not be null.");
            return true;
        }
        return false;
    }

    private void clearForm() {
        jtfName.setText("");
        jtfImpactFactor.setText("");
        jtfPublisher.setText("");
        jtfCountry.setText("");
        jtfIssn.setText("");
        jtfStartPage.setText("");
        jtfEndPage.setText("");
        jtfTitle.setText("");
        jtfLanguage.setText("");
        jtfYear.setText("");
        jtfVolume.setText("");
    }

    private void jbCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCloseActionPerformed

    private void jbAddKeywordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddKeywordActionPerformed
        KeywordForm keyword = new KeywordForm(this, true, keyWords);
        keyword.setVisible(true);
    }//GEN-LAST:event_jbAddKeywordActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        this.dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbAddAuthor;
    private javax.swing.JButton jbAddKeyword;
    private javax.swing.JButton jbClose;
    private javax.swing.JButton jbOk;
    private javax.swing.JPanel jpJournal;
    private javax.swing.JTextField jtfCountry;
    private javax.swing.JTextField jtfEndPage;
    private javax.swing.JTextField jtfImpactFactor;
    private javax.swing.JTextField jtfIssn;
    private javax.swing.JTextField jtfLanguage;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfPublisher;
    private javax.swing.JTextField jtfStartPage;
    private javax.swing.JTextField jtfTitle;
    private javax.swing.JTextField jtfVolume;
    private javax.swing.JTextField jtfYear;
    // End of variables declaration//GEN-END:variables
}
