package br.com.acme;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Willian P
 */
public class AcademicLibrary extends ILibray {

    private String name;
    private String description;
    private String creationDate;
    private HashMap<String, User> users = new HashMap();
    private HashMap<Long, Article> articles = new HashMap();
    private HashMap<Long, Book> books = new HashMap();
    private boolean selectedLog;

    public AcademicLibrary(String name, String description, String creationDate) {

        //publications = new ArrayList<Publication>();
    }

    public AcademicLibrary(String name, String description) {
//        this.creationDate = new Date();
        this.name = name;
        this.description = description;
        this.users = new HashMap();
        this.articles = new HashMap();
        this.books = new HashMap();
        this.selectedLog = true;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    //Métodos da classe
    /*public short countArticles() {
        for (short p : publications) {

        }

        return p;//provisorio
    }*/
    public short countBooks() {
        return 0;//provisorio
    }

    public Article findArticle(long issn) {
        return null;//provisorio
    }

    public Article findArticle(String title) {
        return null;//provisorio
    }

    public Book findBook(long isbn) {
        return null;//provisorio
    }

    public Book findBook(String title) {
        return null;//provisorio
    }
}
