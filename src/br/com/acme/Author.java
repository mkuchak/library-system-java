package br.com.acme;

import java.io.Serializable;

/**
 *
 * @author Marcos Kuchak Filho
 */
public class Author extends Person implements Serializable {

    private String afiliation;
    private boolean isCorrespondingAuthor;

    public Author(String name, String email) {
        super(name, email);
    }

    public Author(String name, String email, String afiliation, boolean isCorrespondingAuthor) {
        this(name, email);
        this.afiliation = afiliation;
        this.isCorrespondingAuthor = isCorrespondingAuthor;
    }

    public String getAfiliation() {
        return afiliation;
    }

    public void setAfiliation(String afiliation) {
        this.afiliation = afiliation;
    }

    public boolean isIsCorrespondingAuthor() {
        return isCorrespondingAuthor;
    }

    public void setIsCorrespondingAuthor(boolean isCorrespondingAuthor) {
        this.isCorrespondingAuthor = isCorrespondingAuthor;
    }

}
