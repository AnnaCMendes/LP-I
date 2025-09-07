package ImagemVikMunizJohnLennon;

public class Material {

    // Atributos
    private String nome;
    private String estado;
    private String quantidade;

    // Construtor
    public Material(String nome, String estado, String quantidade) {
        this.nome = nome;
        this.estado = estado;
        this.quantidade = quantidade;
    }

    // Método
    /**
     * Descreve o processo de transformação do material em uma obra de arte.
     *
     * @return Uma string que detalha a transformação do material.
     */
    public String transformar() {
        return "O artista transforma " + this.quantidade + " de " + this.nome + " em " + this.estado + " para criar a obra.";
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public String getQuantidade() {
        return quantidade;
    }
}