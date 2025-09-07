package ImagemVikMunizTorreEiffel;

public class Desenho {

    // Atributos
    private String ferramenta;
    private String movimento;
    private String linha;

    // Construtor
    public Desenho(String ferramenta, String movimento, String linha) {
        this.ferramenta = ferramenta;
        this.movimento = movimento;
        this.linha = linha;
    }

    // Método
    /**
     * Descreve a execução do traço artístico com o material.
     *
     * @return Uma string que explica a técnica usada no desenho.
     */
    public String executarTraco() {
        return "O artista usa uma " + this.ferramenta + " com um movimento de " + this.movimento + ", criando uma " + this.linha + ".";
    }

    // Getters
    public String getFerramenta() {
        return ferramenta;
    }

    public String getMovimento() {
        return movimento;
    }

    public String getLinha() {
        return linha;
    }
}