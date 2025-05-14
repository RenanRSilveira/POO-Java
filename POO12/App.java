package POO12;

import POO12.Jogo.Farm;
//import POO12.Jogo.Personagem;

public class App {
    public static void main(String[] args) {
        Farm goblin = new Farm("Goblin");
        // Personagem abc = new Personagem("abc");

        // System.out.println(abc);

        System.out.println(goblin);

        goblin.atacarSemArma();
        goblin.atacarComArma();

    }
}
