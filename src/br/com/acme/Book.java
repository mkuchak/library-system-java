package br.com.acme;

/**
 *
 * @author Marcos Kuchak Filho
 */
public class Book extends Publication {

    private String language;
    private long isbn;
    private short pages;

    public Book() {
        super();
    }

    /**
     * Constructor method with parameters.
     *
     * @param language
     * @param isbn id key
     * @param pages
     * @param title
     * @param year
     * @param volume
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
