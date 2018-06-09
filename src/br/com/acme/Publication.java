package br.com.acme;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @authors Marcos Kuchak, Willian Patsche, William Hertz
 */
public abstract class Publication {

    private String title;
    private short year;
    private byte volume;
    private List<Author> authors;

    /**
     * Constructor default method
     */
    public Publication() {
        this.authors = new ArrayList();
    }

    /**
     * Overloading constructor method
     *
     * @param title publication title
     * @param year publication year
     * @param volume publication volume
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

    /**
     * Add object on list author
     *
     * @param author is the received object
     */
    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void removeAuthor(String name) {

    }

    /**
     * Return the list authors
     *
     * @return author
     */
    public List<Author> getAuthors() {
        return authors;
    }

}
