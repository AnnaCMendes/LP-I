package Imagem;

public class Personagem {

    // Atributos
    private String tipo;
    private String acessorio;
    private String atividade;

    // Construtor
    public Personagem(String tipo, String acessorio, String atividade) {
        this.tipo = tipo;
        this.acessorio = acessorio;
        this.atividade = atividade;
    }

    // Métodos
    /**
     * Descreve como o personagem se relaciona com outros elementos.
     *
     * @return Uma string que detalha a interação do personagem.
     */
    public String interagir() {
        return "O " + this.tipo + " está interagindo com a cena ao " + this.atividade + ".";
    }

    /**
     * Indica a expressão ou postura do personagem.
     *
     * @return Uma string que descreve a expressão do personagem.
     */
    public String expressar() {
        return "Ele parece estar com os braços estendidos, como se estivesse expressando surpresa.";
    }

    /**
     * Descreve o tipo de movimento que o personagem está fazendo.
     *
     * @return Uma string que descreve o movimento.
     */
    public String mover() {
        return "O personagem se move pelo cenário, talvez em busca de algo.";
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public String getAcessorio() {
        return acessorio;
    }

    public String getAtividade() {
        return atividade;
    }
}
