package br.com.acme;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Marcos Kuchak Filho
 */
public class User extends Person {

    private String name;
    private String email;
    private String phone;
    private String login;
    private String password;
    private Date lastAccess;
    private AcademicLibrary libray;
    private final String LOGIN = "admin";
    private final String PASSWORD = "admin";

    public User(String name, String email, String phone, String login, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.login = login;
        this.password = password;
        this.lastAccess = new Date();
    }

    public User(String login, String password) {
        libray = ALManager.getInstance();
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
        if (this.login.equalsIgnoreCase(LOGIN) && this.password.equalsIgnoreCase(PASSWORD)) {
            return true;
        }
        for (User usr : libray.getUsers()) {
            System.out.println(usr.getName());
            if (this.login.equalsIgnoreCase(usr.getLogin()) && this.password.equalsIgnoreCase(usr.getPassword())) {
                return true;
            }
        }
        return false;
    }

}
