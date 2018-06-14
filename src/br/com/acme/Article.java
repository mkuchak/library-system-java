package br.com.acme;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Marcos Kuchak Filho
 */
public class Article extends Publication implements Serializable {

    private ArrayList<String> keyWords = new ArrayList();
    private long issn;
    private byte issue;
    private short startPage;
    private short endPage;
    private Journal journal;

    public Article() {
        super();
    }

    /**
     * Constructor method to create a new object from publication class with all
     * parameters.
     *
     * @param issn id key
     * @param issue article number (not implemented)
     * @param startPage initial number page
     * @param endPage last number page
     * @param title title from article
     * @param year year released
     * @param volume volume edition
     */
    public Article(long issn, byte issue, short startPage, short endPage, String title, short year, byte volume) {
        super(title, year, volume);
        this.keyWords = keyWords;
        this.issn = issn;
        this.issue = issue;
        this.startPage = startPage;
        this.endPage = endPage;
        this.journal = journal;
    }

    public void setKeyWords(ArrayList<String> keyWords) {
        for (String i : keyWords) {
            this.keyWords.add(i);
        }
    }

    public Journal getJournal() {
        return journal;
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    public byte getIssue() {
        return issue;
    }

    public void setIssue(byte issue) {
        this.issue = issue;
    }

    public short getStartPage() {
        return startPage;
    }

    public void setStartPage(short startPage) {
        this.startPage = startPage;
    }

    public short getEndPage() {
        return endPage;
    }

    public void setEndPage(short endPage) {
        this.endPage = endPage;
    }

    public void addKeyWord(String key) {

    }

    public ArrayList<String> getKeyWords() {
        return null;
    }

    public boolean removeKeyWords(String key) {
        return false;
    }

}
