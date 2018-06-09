package br.com.acme;

/**
 * @authors Marcos Kuchak, Willian Patsche, William Hertz
 */
public class Journal {

    private String name;
    private byte impactFactor;
    private Publisher publisher;

   public Journal(){
        
    }

     /**
     * Overloading do método construtor
     * @param name do Journal
     * @param impactFactor do Journal
     * @param publisher do Journal
     */
   
    public Journal(String name, byte impactFactor, Publisher publisher) {
        this.name = name;
        this.impactFactor = impactFactor;
        this.publisher = publisher;
    }
     
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
