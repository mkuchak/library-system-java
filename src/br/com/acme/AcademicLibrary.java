package br.com.acme;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @authors Marcos Kuchak, Willian Patsche, William Hertz
 */
public class AcademicLibrary extends ILibray {

    private String name;
    private String description;
    private Date creationDate;
    private HashMap<String, User> users = new HashMap();
    private Map<Long, Article> articles;
    private Map<Long, Book> books;
    private boolean selectedLog;

    public AcademicLibrary(String name, String description) {
        this.name = name;
        this.description = description;
        this.creationDate = new Date();
        ArrayList publications = new ArrayList();

        //this.users = new HashMap();
        //this.articles = new HashMap();
        //this.books = new HashMap();
        //this.selectedLog = true;
    }

    /**
     * Set new user to library system
     *
     * @param login is used as object key
     * @param user saves on users
     */
    public void setUsers(String login, User user) { //aqui adiciona um usuário passando login e objeto
        this.users.put(login, user);
    }

    /**
     * Obtain the full list of users on library system
     *
     */
    public ArrayList<User> getUsers() { //retorna todos os usuários do map
        Collection<User> collectionUsers = this.users.values();
        ArrayList<User> getUsers = new ArrayList();
        for (User x : collectionUsers) {
            getUsers.add(x);
        }
        return getUsers;
    }

    /**
     * Add new user on map users
     *
     * @param user object user to add
     */
    public void addUsers(User user) {
        this.users.put(user.getLogin(), user);
    }

    /**
     * Remove some user on map users
     *
     * @param login searches on map by login and remove if found
     * @return true if user was removed and false if isn't
     */
    public boolean removeUser(String login) { //procura um usuário pelo login e remove(true) se encontrar, ou falso.
        if (this.users.containsKey(login)) {
            this.users.remove(login);
            return true;
        }
        return false;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
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
