package br.com.acme;

import java.io.Serializable;

/**
 *
 * @author Marcos Kuchak Filho
 */
public class Publisher implements Serializable {

    private String name;
    private String country;

    /**
     * Default constructor method.
     *
     */
    public Publisher() {

    }

    /**
     * Overloading constructor method.
     *
     * @param name nome publisher
     * @param country nome país
     */
    public Publisher(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCoutry(String country) {
        this.country = country;
    }

}
