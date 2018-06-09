package br.com.acme;

import java.util.ArrayList;

/**
 *
 * @authors Marcos Kuchak, Willian Patsche, William Hertz
 */
public class Article extends Publication {

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
     * Método construtor que cria um objeto da classe publication com todos os
     * parametros
     *
     * @param issn é o numero do Article
     * @param issue é o numero do Article
     * @param startPage é o numero de paginas iniciais
     * @param endPage é o numero de paginas finais
     * @param title é o titulo do Article
     * @param year é o ano do Article
     * @param volume é o numero do volume do Article
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

    public ArrayList<String> getKeyWords() {
        return null;//provisorio
    }

    public boolean removeKeyWords(String key) {
        return false;//provisorio
    }
    
}
