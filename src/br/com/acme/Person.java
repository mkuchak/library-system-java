package br.com.acme;

/**
 *
 * @authors Marcos Kuchak, Willian Patsche, William Hertz
 */
public abstract class Person {

    private String name;
    private String email;

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

}
