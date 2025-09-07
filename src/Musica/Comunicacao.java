package Musica;

public class Comunicacao {

    // Atributos
    private String tipo;
    private String barreira;
    private boolean intencionalidade;

    // Construtor
    public Comunicacao(String tipo, String barreira, boolean intencionalidade) {
        this.tipo = tipo;
        this.barreira = barreira;
        this.intencionalidade = intencionalidade;
    }

    // Método
    /**
     * Simula a tentativa de transmitir uma mensagem, indicando se a barreira dificulta a comunicação.
     *
     * @return Uma string que reflete o resultado da tentativa de comunicação.
     */
    public String transmitir() {
        if (this.intencionalidade && this.barreira != null && !this.barreira.isEmpty()) {
            return "Tentando comunicar através de " + this.tipo + ", mas a " + this.barreira + " é um obstáculo.";
        } else {
            return "A comunicação foi realizada com sucesso através de " + this.tipo + ".";
        }
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public String getBarreira() {
        return barreira;
    }

    public boolean isIntencionalidade() {
        return intencionalidade;
    }
}