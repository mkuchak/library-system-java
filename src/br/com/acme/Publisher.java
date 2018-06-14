package br.com.acme;

/**
 *
 * @author Marcos Kuchak Filho
 */
public class Publisher {

    private String name;
    private String coutry;

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
    public Publisher(String name, String coutry) {
        this.name = name;
        this.coutry = coutry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoutry() {
        return coutry;
    }

    public void setCoutry(String coutry) {
        this.coutry = coutry;
    }

}
