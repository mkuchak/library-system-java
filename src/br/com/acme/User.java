package br.com.acme;

import java.util.Date;

/**
 *
 * @authors Marcos Kuchak, Willian Patsche, William Hertz
 */
public class User extends Person {

    private String name;
    private String email;
    private String phone;
    private String login;
    private String password;
    private Date lastAccess;
    private final String LOGIN = "admin";
    private final String PASSWORD = "admin";

    public User(String name, String email, String phone, String login, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.login = login;
        this.password = password;
        lastAccess = new Date();
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        lastAccess = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    /*
    * @method isValid é utilizado para verificar se o login e senha do usuario são os mesmos no arquivo persistido
    * @return retorna true se o login e senha estão corretos
     */
    public boolean isValid() {
        //return this.login.equalsIgnoreCase(LOGIN) && this.password.equalsIgnoreCase(PASSWORD);
        if (this.login.equalsIgnoreCase(login) && this.password.equalsIgnoreCase(password)) {
            return true;
        }
        if (this.login.equalsIgnoreCase(LOGIN) && this.password.equalsIgnoreCase(PASSWORD)) {
            return true;
        }
        return false;
    }

}
