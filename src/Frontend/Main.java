package Frontend;
import Backend.Dado;
import Backend.TAbul;

import console.Console;
import Backend.Cartinha;
import cores.Cor;
import cores.StringColorida;
import mecanicas.Carta;

public class Main {
    // private static Yahtzee jogo;
    StringColorida ct1 = new StringColorida("1", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
    StringColorida ct2 = new StringColorida("2", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
    StringColorida ct3 = new StringColorida("3", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
    StringColorida ct4 = new StringColorida("4", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
    StringColorida ct5 = new StringColorida("5", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
    StringColorida ct6 = new StringColorida("6", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
    StringColorida vazio = new StringColorida(" ", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);

    Cartinha vazio1 = new Cartinha(vazio);
    Cartinha c1 = new Cartinha(ct1);
    Cartinha c2 = new Cartinha(ct2);
    Cartinha c3 = new Cartinha(ct3);
    Cartinha c4 = new Cartinha(ct4);
    Cartinha c5 = new Cartinha(ct5);
    Cartinha c6 = new Cartinha(ct6);

    Dado dado = new Dado(c1, c2, c3, c4, c5, c6);

    public static void lancarDado() {
        StringColorida ct1 = new StringColorida("1", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
        StringColorida ct2 = new StringColorida("2", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
        StringColorida ct3 = new StringColorida("3", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
        StringColorida ct4 = new StringColorida("4", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
        StringColorida ct5 = new StringColorida("5", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
        StringColorida ct6 = new StringColorida("6", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
        StringColorida vazio = new StringColorida(" ", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);

        Cartinha vazio1 = new Cartinha(vazio);
        Cartinha c1 = new Cartinha(ct1);
        Cartinha c2 = new Cartinha(ct2);
        Cartinha c3 = new Cartinha(ct3);
        Cartinha c4 = new Cartinha(ct4);
        Cartinha c5 = new Cartinha(ct5);
        Cartinha c6 = new Cartinha(ct6);

        Dado dado = new Dado(c1, c2, c3, c4, c5, c6);

        Cartinha cartaSorteada = dado.lancar();




        Console.println("Lado caido: " + cartaSorteada);

    }


    public static void main(String[] args) {


        TAbul ta2b = new TAbul(7, 7, c3);


        Main.lancarDado();
        Main.lancarDado();
        Main.lancarDado();
        Main.lancarDado();
        Main.lancarDado();
        Console.println("");
        Console.println(ta2b);
       // Console.println(tab);
    }

}
    /*public static void lancarDado() {
        StringColorida ct1 = new StringColorida("1", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
        StringColorida ct2 = new StringColorida("2", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
        StringColorida ct3 = new StringColorida("3", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
        StringColorida ct4 = new StringColorida("4", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
        StringColorida ct5 = new StringColorida("5", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
        StringColorida ct6 = new StringColorida("6", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);
        StringColorida vazio = new StringColorida(" ", Cor.PRETO, Cor.FUNDO_BRANCO_BRANCO);

        Cartinha vazio1 = new Cartinha(vazio);
        Cartinha c1 = new Cartinha(ct1);
        Cartinha c2 = new Cartinha(ct2);
        Cartinha c3 = new Cartinha(ct3);
        Cartinha c4 = new Cartinha(ct4);
        Cartinha c5 = new Cartinha(ct5);
        Cartinha c6 = new Cartinha(ct6);

        Dado dado = new Dado(c1, c2, c3, c4, c5, c6);

        Cartinha cartaSorteada = dado.lancar();

        Console.println("Carta eh esse " + cartaSorteada);
        TAbul tab = new TAbul(7, 7, c3);



        Console.println("Carta sorteada: " + cartaSorteada);

    }
}

 /*       boolean sair = false;
        jogo = new Yahtzee();


        StringColorida cartateste = new StringColorida("*", Cor.AZUL, Cor.FUNDO_AMARELO);
        Cartinha a = new Cartinha(cartateste);




        while (!sair) {
            exibirMenuPrincipal();

            int opcao = ConsoleUtils.lerInt("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    iniciarNovoJogo();
                    break;
                case 2:
                    carregarJogo();
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            if (!sair) {
                ConsoleUtils.pause();
            }
        }

        System.out.println("Obrigado por jogar Yahtzee!");
    }

    private static void exibirMenuPrincipal() {
        System.out.println("Menu Principal:");
        System.out.println("1. Iniciar novo jogo");
        System.out.println("2. Carregar partida");
        System.out.println("3. Sair");
    }

    private static void iniciarNovoJogo() {
        jogo = new Yahtzee();
        jogo.setJogoEmAndamento(true);
        System.out.println("Novo jogo iniciado.");
        jogo.jogar();
        jogo.mostrarPontuacao();
        exibirTelaDePause();
    }

    private static void carregarJogo() {
        String nomeArquivo = ConsoleUtils.lerString("Digite o nome do arquivo para carregar o jogo: ");
        jogo = Yahtzee.carregarJogo(nomeArquivo);
        if (jogo != null) {
            System.out.println("Jogo carregado com sucesso.");
            jogo.mostrarPontuacao();
            exibirTelaDePause();
        } else {
            System.out.println("Erro ao carregar o jogo.");
        }
    }

    private static void exibirTelaDePause() {
        boolean voltarAoJogo = false;

        while (jogo.isJogoEmAndamento() && !voltarAoJogo) {
            System.out.println("Tela de Pause:");
            System.out.println("1. Iniciar novo jogo");
            System.out.println("2. Carregar partida de um arquivo");
            System.out.println("3. Salvar partida em um arquivo");
            System.out.println("4. Voltar para o Jogo");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.println("6. Sair do jogo");

            int opcao = ConsoleUtils.lerInt("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    iniciarNovoJogo();
                    break;
                case 2:
                    carregarJogo();
                    break;
                case 3:
                    String nomeArquivo = ConsoleUtils.lerString("Digite o nome do arquivo para salvar o jogo: ");
                    jogo.salvarJogo(nomeArquivo);
                    System.out.println("Jogo salvo com sucesso.");
                    break;
                case 4:
                    voltarAoJogo = true;
                    break;
                case 5:
                    jogo.setJogoEmAndamento(false);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }*/

