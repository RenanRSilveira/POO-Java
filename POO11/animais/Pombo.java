package POO11.animais;

import POO11.Ave;

public class Pombo extends Ave {
    private int cartasEnviadas = 2;

    public Pombo(String nome) {
        super(nome);
    }

    public void fazerPruu() {
        System.out.println("Pruuuuu");
    }

    public void enviarCarta() {
        System.out.printf("%s enviou uma carta\n", getNome());
        cartasEnviadas++;
    }

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }

}
