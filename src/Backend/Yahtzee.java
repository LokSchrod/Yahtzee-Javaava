/*package Backend;

import java.io.*;
import java.util.ArrayList;
import cores.StringColorida;
import java.util.List;

public class Yahtzee implements Serializable {
    private static final long serialVersionUID = 1L;

    private PilhaDeCartas pilhaDeCartas;
    private List<CartaSimples> maoAtual;
    private int[] pontuacao;
    private boolean jogoEmAndamento;

    public Yahtzee() {
        pilhaDeCartas = new PilhaDeCartas();
        maoAtual = new ArrayList<>();
        pontuacao = new int[5];
        inicializarCartas();
    }

    private void inicializarCartas() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < 4; j++) {
                pilhaDeCartas.insereTopo(new CartaSimples(i));
            }
        }
        pilhaDeCartas.embaralha();
    }

    public void jogar() {
        maoAtual = pilhaDeCartas.compra(5).compraTudo();
        System.out.println("Cartas compradas:");
        for (int i = 0; i < maoAtual.size(); i++) {
            CartaSimples carta = maoAtual.get(i);
            System.out.println(carta.getFrente().getTexto());
            pontuacao[i] = carta.getValor();
        }
    }

    public void mostrarPontuacao() {
        System.out.println("Pontuação: ");
        for (int p : pontuacao) {
            System.out.print(p + " ");
        }
        System.out.println();
    }

    public void salvarJogo(String arquivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(this);
        } catch (IOException e) {
            System.err.println("Erro ao salvar o jogo: " + e.getMessage());
        }
    }

    public static Yahtzee carregarJogo(String arquivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
            return (Yahtzee) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar o jogo: " + e.getMessage());
            return null;
        }
    }

    public boolean isJogoEmAndamento() {
        return jogoEmAndamento;
    }

    public void setJogoEmAndamento(boolean jogoEmAndamento) {
        this.jogoEmAndamento = jogoEmAndamento;
    }
}
*/