package ImagemVikMunizJohnLennon;

public class Retrato {

    // Atributos
    private String personagem;
    private String caracteristicaPrincipal;
    private String elementoRepresentativo;

    // Construtor
    public Retrato(String personagem, String caracteristicaPrincipal, String elementoRepresentativo) {
        this.personagem = personagem;
        this.caracteristicaPrincipal = caracteristicaPrincipal;
        this.elementoRepresentativo = elementoRepresentativo;
    }

    // Método
    /**
     * Detalha os elementos que compõem o retrato na obra.
     *
     * @return Uma string que descreve a composição do retrato.
     */
    public String detalhar() {
        return "O retrato de " + this.personagem + " tem seus " + this.caracteristicaPrincipal + " formados por " + this.elementoRepresentativo + ".";
    }

    // Getters
    public String getPersonagem() {
        return personagem;
    }

    public String getCaracteristicaPrincipal() {
        return caracteristicaPrincipal;
    }

    public String getElementoRepresentativo() {
        return elementoRepresentativo;
    }
}