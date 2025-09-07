package Vídeo;

import java.util.List;

public class Estrategia {

    // Atributos
    private String tipo;
    private String agressor;
    private List<String> sequencia;

    // Construtor
    public Estrategia(String tipo, String agressor, List<String> sequencia) {
        this.tipo = tipo;
        this.agressor = agressor;
        this.sequencia = sequencia;
    }

    // Métodos
    /**
     * Detalha como a estratégia é pensada.
     *
     * @return Uma string que descreve a formulação do plano.
     */
    public String formular() {
        return "O " + this.agressor + " formula uma estratégia de " + this.tipo + ", pensando em cada passo.";
    }

    /**
     * Descreve a implementação do plano passo a passo.
     *
     * @return Uma string que explica a execução da estratégia.
     */
    public String executar() {
        return "A estratégia começa com a seguinte ação: " + this.sequencia.get(0) + ".";
    }

    /**
     * Explica o resultado inesperado da estratégia.
     *
     * @return Uma string que descreve a reviravolta no plano.
     */
    public String surpreender() {
        return "A estratégia consegue seu objetivo, surpreendendo o adversário.";
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public String getAgressor() {
        return agressor;
    }

    public List<String> getSequencia() {
        return sequencia;
    }
}
