package Musica;

public class Referencial {

    // Atributos
    private String nome;
    private String atributoComparativo;
    private boolean statusComparacao;

    // Construtor
    public Referencial(String nome, String atributoComparativo) {
        this.nome = nome;
        this.atributoComparativo = atributoComparativo;
        this.statusComparacao = false; // Valor padrão, será atualizado pelo método
    }

    // Método
    /**
     * Compara o referencial com o amor, verificando se ele é maior ou mais bonito.
     *
     * @return Uma string que afirma que o referencial não supera o amor.
     */
    public String compararComAmor() {
        this.statusComparacao = false;
        return "Nem mesmo " + this.nome + ", com todo o seu " + this.atributoComparativo + ", é maior que o meu amor.";
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getAtributoComparativo() {
        return atributoComparativo;
    }

    public boolean isStatusComparacao() {
        return statusComparacao;
    }
}