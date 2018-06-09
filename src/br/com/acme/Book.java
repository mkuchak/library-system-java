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
