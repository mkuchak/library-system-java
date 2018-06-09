package br.com.acme;

/**
 *
 * @authors Marcos Kuchak, Willian Patsche, William Hertz
 */
public class Journal {

    private String name;
    private byte impactFactor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getImpactFactor() {
        return impactFactor;
    }

    public void setImpactFactor(byte impactFactor) {
        this.impactFactor = impactFactor;
    }

}
