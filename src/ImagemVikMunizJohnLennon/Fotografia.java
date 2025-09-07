package ImagemVikMunizJohnLennon;

import java.util.Date;

public class Fotografia {

    // Atributos
    private String formato;
    private Date data;
    private String proposito;

    // Construtor
    public Fotografia(String formato, Date data, String proposito) {
        this.formato = formato;
        this.data = data;
        this.proposito = proposito;
    }

    // Método
    /**
     * Documenta a obra, registrando sua existência para a posteridade.
     *
     * @return Uma string que descreve o propósito da fotografia.
     */
    public String registrarArte() {
        return "A " + this.formato + " foi criada em " + this.data + " com o propósito de " + this.proposito + ".";
    }

    // Getters
    public String getFormato() {
        return formato;
    }

    public Date getData() {
        return data;
    }

    public String getProposito() {
        return proposito;
    }
}