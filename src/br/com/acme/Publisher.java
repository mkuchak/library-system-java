package br.com.acme;

/**
 *
 * @author Marcos Kuchak Filho
 */
public class Publisher {

    private String name;
    private String country;

    /**
     * Metodo construtor Default
     */
    public Publisher() {

    }

    /**
     * Overloading do método construtor
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
