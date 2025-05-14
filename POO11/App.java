package POO11;

import POO11.animais.Pombo;

public class App {
    public static void main(String[] args) {
        Pombo pombo = new Pombo("Correio");

        pombo.enviarCarta();
        System.out.println(pombo.getCartasEnviadas());
        pombo.voar();
    }
}
