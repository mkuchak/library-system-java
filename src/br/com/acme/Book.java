package br.com.acme;

/**
 *
 * @authors Marcos Kuchak, Willian Patsche, William Hertz
 */
public class Book extends Publication {

    private String language;
    private long isbn;
    private short pages;

    public Book() {
        super();
    }

     /**
     * Método construtor com parâmetros (overloading)
     * @param language linguagem do book
     * @param isbn isbn do book
     * @param pages numero de pages do book
     * @param title title do book
     * @param year ano do book
     * @param volume volume do book
     */
      public Book(String language, long isbn, short pages, String title, short year, byte volume) {
        super(title, year, volume);
        this.language = language;
        this.isbn = isbn;
        this.pages = pages;
    }
    
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public short getPages() {
        return pages;
    }

    public void setPages(short pages) {
        this.pages = pages;
    }

}
