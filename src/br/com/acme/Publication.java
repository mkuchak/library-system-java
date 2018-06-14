package br.com.acme;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Marcos Kuchak Filho
 */
public abstract class Publication implements Serializable {

    private String title;
    private short year;
    private byte volume;
    private List<Author> authors;

    /**
     * Constructor default method
     */
    public Publication() {
        authors = new ArrayList();
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

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    /**
     * Add object on list author
     *
     * @param author is the received object
     */
    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    /**
     * Remove object on list author
     *
     * @param name is the object name that will be removed
     */
    public void removeAuthor(String name) {
        if (authors.contains(name)) {
            authors.remove(name);
        }
    }

    /**
     * Return the list authors
     *
     * @return author
     */
    public List<Author> getAuthors() {
        return this.authors;
    }
    /*public List<Author> getAuthors() {
        Collection<Author> collectionAuthors = this.authors;
        ArrayList<Author> getAuthors = new ArrayList();
        for (Author i : collectionAuthors) {
            getAuthors.add(i);
        }
        return getAuthors;
    }*/

}
