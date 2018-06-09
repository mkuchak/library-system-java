package br.com.acme;

/**
 *
 * @author Willian P
 */
public class Publication {

    private String title;
    private short year;
    private byte volume;
    
    public class defaul{
    
       Author a = new Author();
    
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
