package Backend;

import java.util.Random;

public class Dado {
    private static Cartinha[] cartas = new Cartinha[6];

    public Dado(Cartinha c1, Cartinha c2, Cartinha c3, Cartinha c4, Cartinha c5, Cartinha c6) {
        cartas[0] = c1;
        cartas[1] = c2;
        cartas[2] = c3;
        cartas[3] = c4;
        cartas[4] = c5;
        cartas[5] = c6;
    }

    public Cartinha lancar() {
        Random random = new Random();
        int indice = random.nextInt(6); // Gera um número entre 0 e 5
        return cartas[indice];
    }
}
