package Vídeo;

public class Ambiente {

    // Atributos
    private String local;
    private String iluminacao;
    private String atmosfera;

    // Construtor
    public Ambiente(String local, String iluminacao, String atmosfera) {
        this.local = local;
        this.iluminacao = iluminacao;
        this.atmosfera = atmosfera;
    }

    // Métodos
    /**
     * Descreve a transição para um novo cenário.
     *
     * @return Uma string que detalha a mudança de local.
     */
    public String mudarLocal() {
        return "A cena muda para a " + this.local + ", onde um novo evento está prestes a acontecer.";
    }

    /**
     * Demonstra como o ambiente contribui para a sensação do momento.
     *
     * @return Uma string que explica o clima criado pelo ambiente.
     */
    public String criarClima() {
        return "O ambiente com sua atmosfera de " + this.atmosfera + " prepara o público para o que está por vir.";
    }

    /**
     * Explica como o local influencia as ações dos personagens.
     *
     * @return Uma string que descreve a influência do local.
     */
    public String influenciarAcao() {
        return "A ação é influenciada pelo ambiente, que permite ou restringe certos movimentos.";
    }

    // Getters
    public String getLocal() {
        return local;
    }

    public String getIluminacao() {
        return iluminacao;
    }

    public String getAtmosfera() {
        return atmosfera;
    }
}
