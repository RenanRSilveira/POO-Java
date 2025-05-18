package POO02;

public class App {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();

        heroi.nome = "Hércules";
        heroi.nivel = 2;
        heroi.forca = 16;

        heroi.mostrar_status();
        System.out.println();
        heroi.ataque("Goblin", "");
    }

}
