package Imagem;

public class Objeto {

    // Atributos
    private String tipo;
    private String forma;
    private String materialAparente;

    // Construtor
    public Objeto(String tipo, String forma, String materialAparente) {
        this.tipo = tipo;
        this.forma = forma;
        this.materialAparente = materialAparente;
    }

    // Métodos
    /**
     * Descreve como o objeto se move no ar.
     *
     * @return Uma string que descreve o movimento do objeto.
     */
    public String flutuar() {
        return "O " + this.tipo + " de forma " + this.forma + " flutua calmamente sobre os prédios.";
    }

    /**
     * Explica o que o objeto contribui para a complexidade da obra.
     *
     * @return Uma string que detalha a função do objeto.
     */
    public String adicionarDetalhe() {
        return "O " + this.tipo + " adiciona um detalhe fantasioso ao cenário urbano.";
    }

    /**
     * Indica se o objeto se destaca na cena.
     *
     * @return Uma string que descreve o destaque do objeto.
     */
    public String chamarAtencao() {
        return "O " + this.tipo + " com sua cor vibrante se destaca e chama a atenção na cena.";
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public String getForma() {
        return forma;
    }

    public String getMaterialAparente() {
        return materialAparente;
    }
}
