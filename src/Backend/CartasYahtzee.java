package Backend;

import Backend.Cartinha;
import cores.Cor;
import cores.StringColorida;
import mecanicas.Carta;

public class CartasYahtzee {
private StringColorida frente;
private boolean viradaParaCima;

public void Carta(StringColorida frente, boolean viradaParaCima) {
    if (frente == null) {
        throw new IllegalArgumentException("Frente e verso não podem ser nulos.");
    }
    this.frente = frente;
    this.viradaParaCima = viradaParaCima;


}

public StringColorida getFrente() {
    return frente;
}

public StringColorida getFaceParaCima() {
    return frente;
}

public boolean estaViradaParaCima() {
    return viradaParaCima;
}

//public abstract Carta copia();

public String toString() {
    return "Carta{" +
            "frente=" + frente +
            ", verso=" + verso +
            ", viradaParaCima=" + viradaParaCima +
            '}';
}



}
