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
import br.com.acme.Publication;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Marcos Kuchak Filho
 */
public class ArticleListForm extends javax.swing.JDialog {

    private AcademicLibrary library;

    /**
     * Creates new form ArticleListForm
     */
    public ArticleListForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        library = ALManager.getInstance();
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel rows = (DefaultTableModel) jtArticleList.getModel();
        TableModel model = jtArticleList.getModel();

        ArrayList<Publication> publications = library.getAllPublications();

        int line = 0;
        for (Publication p : publications) {
            if (p instanceof Article) {
                rows.addRow(new Object[]{});
                Article a = (Article) p;

                model.setValueAt(a.getTitle(), line, 0);

                List<Author> authors = a.getAuthors();
                String names = "";
                for (Author x : authors) {
                    names = names + x.getName() + ", ";
                }

                model.setValueAt(names, line, 1);

                model.setValueAt(a.getYear(), line, 2);
                model.setValueAt(a.getVolume(), line, 3);

                ArrayList<String> keyWords = a.getKeyWords();
                String s = "";
                /*for (String k : keyWords) {
                    s = s + k + ", ";
                }*/

                model.setValueAt(s, line, 4);
                model.setValueAt(a.getIssn(), line, 5);
                model.setValueAt(a.getStartPage() + "-" + a.getEndPage(), line, 6);
                model.setValueAt(a.getJournal().getName(), line, 7);
                model.setValueAt(a.getJournal().getImpactFactor(), line, 8);
                model.setValueAt(a.getJournal().getPublisher().getName(), line, 9);
                model.setValueAt(a.getJournal().getPublisher().getCountry(), line, 10);
                line++;
            }
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
        jtArticleList = new javax.swing.JTable();
        jbDelete = new javax.swing.JButton();
        jbClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Article List");
        setResizable(false);

        jtArticleList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Author", "Year", "Volume", "Keywords", "ISSN", "Pages", "Name", "Impact Factor", "Publisher", "Country"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtArticleList);

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
                .addGap(191, 191, 191)
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
        this.dispose();
    }//GEN-LAST:event_jbCloseActionPerformed

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        if (GUIMessage.action() == JOptionPane.YES_OPTION) {
            //action code here
            if (jtArticleList.getSelectedRow() != -1) {
                DefaultTableModel rows = (DefaultTableModel) jtArticleList.getModel();
                TableModel model = jtArticleList.getModel();

                ArrayList<Publication> publications = library.getAllPublications();
                String rowTitle = (String) model.getValueAt(jtArticleList.getSelectedRow(), 0);
                for (Publication p : publications) {
                    if (p instanceof Article) {
                        Article a = (Article) p;
                        if (a.getTitle().equals(rowTitle)) {
                            library.removePublication(a.getIssn());
                        }
                    }
                }
                rows.removeRow(jtArticleList.getSelectedRow());
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
    private javax.swing.JTable jtArticleList;
    // End of variables declaration//GEN-END:variables
}
