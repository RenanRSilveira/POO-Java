package POO09a.classes;

public class VideoGame {
    private Jogo jogo;
    private boolean estaLigado = false;

    public void ligar() {
        System.out.println("Ligando o vídeo-game");
        estaLigado = true;
    }

    public void jogar(Jogo jogo) {
        if (estaLigado == true) {
            System.out.println("Iniciando o jogo");
            this.jogo = jogo;
            jogo.jogar();
        } else {
            System.out.println("O vídeo-game está desligado");
        }
    }

    public void fechar() {
        if (estaLigado == true) {
            System.out.println("Fechando o jogo");
            if (jogo != null) {
                jogo.fechar();
                jogo = null;
            } else {
                System.out.println("Não tem jogo rodando");
            }
        }

    }
}
