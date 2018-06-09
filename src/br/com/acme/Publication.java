package br.com.acme;

import java.util.List;

/**
 *
 * @author Willian P
 */
public class Publication {

    private String title;
    private short year;
    private byte volume;
    private List<Author> authors;
    
     /**
     * Método construtor default
     */
    public Publication(){
           Author a = new Author();  
    }
       
     /**
     * Overloading do método construtor
     * @param title é o título da publicação
     * @param year é o ano da publicação
     * @param volume é o volume da publicação
     */
    public Publication(String title, short year, byte volume) {
        this.title = title;
        this.year = year;
        this.volume = volume;
    }
  

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public byte getVolume() {
        return volume;
    }

    public void setVolume(byte volume) {
        this.volume = volume;
    }
  
    
}
