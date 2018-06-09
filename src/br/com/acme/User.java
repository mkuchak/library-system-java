package br.com.acme;

import java.util.Date;

/**
 *
 * @authors Marcos Kuchak, Willian Patsche, William Hertz
 */
public class User extends Person {

    private String phone;
    private String login;
    private String password;
    private Date lastAccess;
    private final String LOGIN = "admin";
    private final String PASSWORD = "admin";

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        lastAccess = new Date();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValid() {
        return this.login.equalsIgnoreCase(LOGIN) && this.password.equalsIgnoreCase(PASSWORD);
    }

}
