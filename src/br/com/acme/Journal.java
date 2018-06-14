package br.com.acme;

import java.io.Serializable;

/**
 *
 * @author Marcos Kuchak Filho
 */
public class Journal implements Serializable {

    private String name;
    private byte impactFactor;
    private Publisher publisher;

    public Journal() {

    }

    /**
     * Overloading constructor method.
     *
     * @param name
     * @param impactFactor
     * @param publisher
     */
    public Journal(String name, byte impactFactor, Publisher publisher) {
        this.impactFactor = impactFactor;
        this.name = name;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public byte getImpactFactor() {
        return impactFactor;
    }

    public void setImpactFactor(byte impactFactor) {
        this.impactFactor = impactFactor;
    }

}
