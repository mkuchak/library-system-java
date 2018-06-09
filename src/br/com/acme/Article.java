package br.com.acme;

import java.util.ArrayList;

/**
 *
 * @authors Marcos Kuchak, Willian Patsche, William Hertz
 */
public class Article extends Publication {

    private ArrayList<String> keyWords;
    private long issn;
    private byte issue;
    private short startPage;
    private short endPage;
    private Journal journal;

    public Article() {
        ArrayList keyWords = new ArrayList();

    }

    public Article(long issn, byte issue, short startPage, short endPage, String title, short year, byte volume) {
        //super(title, year, volume);
        this.issn = issn;
        this.issue = issue;
        this.startPage = startPage;
        this.endPage = endPage;
    }

    public void setKeyWords(ArrayList<String> keyWords) {
        //this.keyWords = keyWords;
        keyWords.forEach((i) -> {
            this.keyWords.add(i);
        });
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

    //Demais metódos solicitados no diagrama
    public void addKeyWord(String key) {

    }

    /*public ArrayList<String> getKeyWords() {

    }

    public boolean removeKeyWords(String key) {

    }*/
}
