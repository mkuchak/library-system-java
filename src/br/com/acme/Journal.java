package br.com.acme;

/**
 *
 * @author Marcos Kuchak Filho
 */
public class Journal {

    private String name;
    private byte impactFactor;
    private Publisher publisher;

    public Journal() {

    }

    /**
     * Overloading do método construtor
     *
     * @param name do Journal
     * @param impactFactor do Journal
     * @param publisher do Journal
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

    public byte getImpactFactor() {
        return impactFactor;
    }

    /* @param impactFactor é um atributo de Journal
    * @method setImpactFactor é utilizado para modificar o valor se for < 0 lança uma exception pedindo para atribuir um valor que seja > 0
    * @return retorna o valor de impactFactor
     */
    public void setImpactFactor(byte impactFactor) throws IllegalArgumentException {
        if (impactFactor < 0) {
            String msg = "Valor do campo Impact Factor não pode ser NEGATIVO!!!";
            IllegalArgumentException ex = new IllegalArgumentException(msg);
            throw ex;
        } else {
            this.impactFactor = impactFactor;
        }
    }

}
