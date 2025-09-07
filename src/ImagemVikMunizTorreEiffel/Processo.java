package ImagemVikMunizTorreEiffel;

public class Processo {

    // Atributos
    private int fase;
    private String duracao;
    private boolean efemeridade;

    // Construtor
    public Processo(int fase, String duracao, boolean efemeridade) {
        this.fase = fase;
        this.duracao = duracao;
        this.efemeridade = efemeridade;
    }

    // Método
    /**
     * Registra o processo de criação da obra, focando em sua natureza temporária.
     *
     * @return Uma string que descreve a fase e a duração do processo.
     */
    public String documentar() {
        String natureza = this.efemeridade ? "A obra é efêmera." : "A obra é permanente.";
        return "A fase " + this.fase + " do processo levou " + this.duracao + ". " + natureza;
    }

    // Getters
    public int getFase() {
        return fase;
    }

    public String getDuracao() {
        return duracao;
    }

    public boolean isEfemeridade() {
        return efemeridade;
    }
}