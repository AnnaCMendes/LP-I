package Musica;

public class Sentimento {

    // Atributos
    private String valor;
    private String dimensao;
    private String origem;

    // Construtor
    public Sentimento(String valor, String dimensao, String origem) {
        this.valor = valor;
        this.dimensao = dimensao;
        this.origem = origem;
    }

    // Método
    /**
     * Tenta expressar o sentimento em palavras, ressaltando a dificuldade dessa tarefa.
     *
     * @return Uma frase que descreve a dificuldade de expressar o sentimento.
     */
    public String expressar() {
        return "Eu tenho tanto pra lhe falar, mas com palavras não sei dizer como é " + this.dimensao + " o meu " + this.valor + " por você.";
    }

    // Getters
    public String getValor() {
        return valor;
    }

    public String getDimensao() {
        return dimensao;
    }

    public String getOrigem() {
        return origem;
    }
}