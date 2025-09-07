package Imagem;

public class Estrutura {

    // Atributos
    private String funcao;
    private String corPrincipal;
    private String arquitetura;

    // Construtor
    public Estrutura(String funcao, String corPrincipal, String arquitetura) {
        this.funcao = funcao;
        this.corPrincipal = corPrincipal;
        this.arquitetura = arquitetura;
    }

    // Métodos
    /**
     * Descreve como a estrutura está iluminada.
     *
     * @return Uma string que detalha a iluminação da estrutura.
     */
    public String iluminar() {
        return "A " + this.arquitetura + " está iluminada por dentro, com suas janelas brilhando.";
    }

    /**
     * Indica o propósito da estrutura em abrigar algo ou alguém.
     *
     * @return Uma string que descreve a função de abrigo.
     */
    public String abrigar() {
        return "Esta " + this.arquitetura + " parece abrigar pessoas ou atividades.";
    }

    /**
     * Demonstra como a estrutura compõe a paisagem.
     *
     * @return Uma string que descreve a função cenográfica da estrutura.
     */
    public String formarCenario() {
        return "A " + this.arquitetura + " com sua cor " + this.corPrincipal + " se destaca, formando um cenário vibrante e complexo.";
    }

    // Getters
    public String getFuncao() {
        return funcao;
    }

    public String getCorPrincipal() {
        return corPrincipal;
    }

    public String getArquitetura() {
        return arquitetura;
    }
}
