package br.com.acme;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Marcos Kuchak Filho
 */
public class AcademicLibrary extends ILibrary implements Serializable {

    private String name;
    private String description;
    private Date creationDate;
    private HashMap<String, User> users = new HashMap();     //Key: Login
    private HashMap<Long, Article> articles = new HashMap(); //Key: ISSN (e.g. 1018-4783)
    private HashMap<Long, Book> books = new HashMap();       //Key: ISBN (e.g. 978-3-16-148410-0)
    private boolean selectedLog;

    public AcademicLibrary(String name, String description) {
        this.name = name;
        this.description = description;
        this.creationDate = new Date();
        ArrayList publications = new ArrayList();
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
     * @return
     */
    public ArrayList<User> getUsers() {
        Collection<User> collectionUsers = this.users.values();
        ArrayList<User> getUsers = new ArrayList();
        for (User i : collectionUsers) {
            getUsers.add(i);
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
    public boolean removeUser(String login) {
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

    /**
     * Add new publication on ArrayList publication.
     *
     * @param p
     */
    @Override
    public void addPublication(Publication p) {
        if (p instanceof Book) {
            books.put(((Book) p).getIsbn(), (Book) p);
        } else if (p instanceof Article) {
            articles.put(((Article) p).getIssn(), (Article) p);
        }
    }

    /**
     * Removes some publication.
     *
     * @param id
     * @return
     */
    @Override
    public boolean removePublication(long id) {
        if (this.articles.containsKey(id)) {
            this.articles.remove(id);
            return true;

        } else if (this.books.containsKey(id)) {
            this.books.remove(id);
            return true;
        }

        return false;
    }

    /**
     * Get all publications on ArrayList.
     *
     * @return publication
     */
    public ArrayList<Publication> getAllPublications() {
        ArrayList<Publication> publication = new ArrayList(articles.values());
        publication.addAll(books.values());
        return publication;
    }

    public short countBooks() {
        return 0;
    }

    public Article findArticle(long issn) {
        return null;
    }

    public Article findArticle(String title) {
        return null;
    }

    /**
     * Find book from ISBN.
     *
     * @param isbn
     * @return Book
     */
    public Book findBook(long isbn) {
        return books.get(isbn);

    }

    /**
     * Find book from title.
     *
     * @param title
     * @return Book
     */
    public Book findBook(String title) {
        Set<Long> keys = books.keySet();
        for (Long key : keys) {
            if (title.equalsIgnoreCase(books.get(key).getTitle())) {
                return books.get(key);
            }
        }
        return null;
    }

    /**
     * Find user to check if exists.
     *
     * @param login
     * @return user object
     */
    public User findUser(String login) {
        if (this.users.containsKey(login)) {
            return this.users.get(login);
        }
        return null;
    }
}
