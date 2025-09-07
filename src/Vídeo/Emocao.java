package Vídeo;

public class Emocao {

    // Atributos
    private String nome;
    private String personagem;
    private int intensidade;

    // Construtor
    public Emocao(String nome, String personagem, int intensidade) {
        this.nome = nome;
        this.personagem = personagem;
        this.intensidade = intensidade;
    }

    // Métodos
    /**
     * Descreve como a emoção é expressa pelo personagem.
     *
     * @return Uma string que detalha a manifestação da emoção.
     */
    public String manifestar() {
        return "O " + this.personagem + " manifesta um sentimento de " + this.nome + ", visível em sua expressão facial.";
    }

    /**
     * Explica como a emoção afeta o comportamento do personagem.
     *
     * @return Uma string que descreve a influência da emoção.
     */
    public String influenciarComportamento() {
        return "A " + this.nome + " de intensidade " + this.intensidade + "/10 influencia as próximas ações do " + this.personagem + ".";
    }

    /**
     * Demonstra a evolução do estado emocional do personagem.
     *
     * @return Uma string que descreve a mudança de emoção.
     */
    public String mudarEstado() {
        return "O estado de " + this.nome + " muda à medida que a história avança, evoluindo para outro sentimento.";
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getPersonagem() {
        return personagem;
    }

    public int getIntensidade() {
        return intensidade;
    }
}
