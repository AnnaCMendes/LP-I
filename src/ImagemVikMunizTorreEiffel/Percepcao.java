package ImagemVikMunizTorreEiffel;

import java.util.List;

public class Percepcao {

    // Atributos
    private String ilusao;
    private List<String> sentidosEnvolvidos;
    private String reacaoInicial;

    // Construtor
    public Percepcao(String ilusao, List<String> sentidosEnvolvidos, String reacaoInicial) {
        this.ilusao = ilusao;
        this.sentidosEnvolvidos = sentidosEnvolvidos;
        this.reacaoInicial = reacaoInicial;
    }

    // Método
    /**
     * Descreve como a obra desafia a perspectiva do observador.
     *
     * @return Uma string que detalha a ilusão criada pela obra.
     */
    public String desafiarPerspectiva() {
        return "A obra cria uma " + this.ilusao + ". A " + this.reacaoInicial + " inicial do público é parte da experiência.";
    }

    // Getters
    public String getIlusao() {
        return ilusao;
    }

    public List<String> getSentidosEnvolvidos() {
        return sentidosEnvolvidos;
    }

    public String getReacaoInicial() {
        return reacaoInicial;
    }
}
