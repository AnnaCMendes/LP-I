import Musica.Sentimento;
import Musica.Referencial;
import Musica.Comunicacao;

import ImagemVikMunizJohnLennon.Fotografia;
import  ImagemVikMunizJohnLennon.Material;
import  ImagemVikMunizJohnLennon.Retrato;

import java.util.Date;
import java.util.InputMismatchException;

import ImagemVikMunizTorreEiffel.Desenho;
import ImagemVikMunizTorreEiffel.Percepcao;
import ImagemVikMunizTorreEiffel.Percepcao;
import ImagemVikMunizTorreEiffel.Processo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Imagem.Personagem;
import Imagem.Estrutura;
import Imagem.Objeto;

import Vídeo.Ambiente;
import Vídeo.Emocao;
import Vídeo.Estrategia;

import TesteMesa.CalculoMedia;
import java.util.Scanner;


@SuppressWarnings("unused")

public class Main {

    public static void main(String[] args) {

        // Instanciando o objeto da classe Sentimento
        Sentimento meuAmor = new Sentimento("amor", "grande", "coração");
        System.out.println(meuAmor.expressar());
        System.out.println("---");

        // Instanciando o objeto da classe Comunicacao
        Comunicacao comunicacaoPorPalavras = new Comunicacao("palavras", "limitação da linguagem", true);
        System.out.println(comunicacaoPorPalavras.transmitir());
        System.out.println("---");

        // Instanciando o objeto da classe Referencial
        Referencial universo = new Referencial("o céu e as estrelas", "tamanho e beleza");
        System.out.println(universo.compararComAmor());

// -------- Imagem Vik Muniz: John Lennon --------

        // Objeto da classe Material
        Material cafe = new Material("café", "grãos e líquido", "vasto volume de grãos e duas xícaras");
        System.out.println(cafe.transformar());
        System.out.println("---");

        // Objeto da classe Retrato
        Retrato retratoLennon = new Retrato("John Lennon", "olhos", "xícaras com café");
        System.out.println(retratoLennon.detalhar());
        System.out.println("---");

        // Objeto da classe Fotografia
        // Usamos new Date() para simular a data de hoje.
        Fotografia fotoFinal = new Fotografia("impressão fotográfica", new Date(), "registrar e expor a obra");
        System.out.println(fotoFinal.registrarArte());

// -------- Imagem Vik Muniz: John Lennon --------

        // Objeto da classe Percepcao
        List<String> sentidos = Arrays.asList("visão", "olfato");
        Percepcao ilusaoOtica = new Percepcao("fotografia bidimensional", sentidos, "surpresa");
        System.out.println(ilusaoOtica.desafiarPerspectiva());
        System.out.println("---");

        // Objeto da classe Desenho
        Desenho tracosCalda = new Desenho("seringa", "pingando", "fina e contínua");
        System.out.println(tracosCalda.executarTraco());
        System.out.println("---");

        // Objeto da classe Processo
        Processo documentacaoFinal = new Processo(3, "dias", true);
        System.out.println(documentacaoFinal.documentar());

// -------- Imagem Dooble--------
        // 1. Objeto da Classe Personagem: O homem de barba vermelha no centro da imagem.
        Personagem homemDeBarba = new Personagem("homem", "barba vermelha", "interagindo");
        System.out.println("--- Personagem ---");
        System.out.println(homemDeBarba.interagir());
        System.out.println(homemDeBarba.expressar());
        System.out.println(homemDeBarba.mover());
        System.out.println("------------------\n");


        // 2. Objeto da Classe Estrutura: A pizzaria com pizza gigante no canto superior direito.
        Estrutura pizzaria = new Estrutura("comercial", "amarelo", "prédio retangular");
        System.out.println("--- Estrutura ---");
        System.out.println(pizzaria.iluminar());
        System.out.println(pizzaria.abrigar());
        System.out.println(pizzaria.formarCenario());
        System.out.println("------------------\n");


        // 3. Objeto da Classe Objeto: O foguete vermelho no canto superior esquerdo.
        Objeto foguete = new Objeto("veículo voador", "alongado com ponta", "metal");
        System.out.println("--- Objeto ---");
        System.out.println(foguete.flutuar());
        System.out.println(foguete.adicionarDetalhe());
        System.out.println(foguete.chamarAtencao());
        System.out.println("------------------\n");

// -------- Vídeo--------

        // 1. Objeto da Classe Ambiente: A casa da Mônica.
        Ambiente casaDaMonica = new Ambiente("casa da Mônica", "clara", "suspense");
        System.out.println("--- Ambiente ---");
        System.out.println(casaDaMonica.mudarLocal());
        System.out.println(casaDaMonica.criarClima());
        System.out.println(casaDaMonica.influenciarAcao());
        System.out.println("------------------\n");


        // 2. Objeto da Classe Estratégia: O plano de vingança de Mônica.
        List<String> passos = Arrays.asList("conseguir foto de Cebolinha", "chantagear", "rasgar a foto de ameaça");
        Estrategia planoDaMonica = new Estrategia("vingança", "Mônica", passos);
        System.out.println("--- Estratégia ---");
        System.out.println(planoDaMonica.formular());
        System.out.println(planoDaMonica.executar());
        System.out.println(planoDaMonica.surpreender());
        System.out.println("------------------\n");


        // 3. Objeto da Classe Emoção: O desespero de Mônica.
        Emocao desesperoDaMonica = new Emocao("desespero", "Mônica", 9);
        System.out.println("--- Emoção ---");
        System.out.println(desesperoDaMonica.manifestar());
        System.out.println(desesperoDaMonica.influenciarComportamento());
        System.out.println(desesperoDaMonica.mudarEstado());
        System.out.println("------------------\n");

// ===================== CalculoMedia =====================
        Scanner scanner = new Scanner(System.in);

        // 1. Ler as notas do teclado
        System.out.println("Digite a nota da Prova 1 (P1):");
        double p1 = scanner.nextDouble();

        System.out.println("Digite a nota da Entrega E1:");
        double e1 = scanner.nextDouble();

        System.out.println("Digite a nota da Entrega E2:");
        double e2 = scanner.nextDouble();

        System.out.println("Digite a nota da Prova substitutiva (SUB):");
        double sub = scanner.nextDouble();

        System.out.println("Digite a nota de Atividades extras (X):");
        double x = scanner.nextDouble();

        System.out.println("Digite a nota de Aprendizagem por Projeto Integrado (API):");
        double api = scanner.nextDouble();

        // 2. Calcular a média final
        double mediaFinal = calcularMedia(p1, e1, e2, api, sub, x);

        // 3. Imprimir o resultado
        System.out.println("\nA média final é: " + String.format("%.2f", mediaFinal));

        scanner.close();

    }

    private static double calcularMedia(double p1, double e1, double e2, double api, double sub, double x) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularMedia'");
    }
}

