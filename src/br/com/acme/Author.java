package br.com.acme;

/**
 *
 * @author Willian P
 */
public class Author extends Person{

    private String afiliation;
    private boolean isCorrespondingAuthor;

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
