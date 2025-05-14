package POO9a.classes;

public class Xadrez implements Jogo {

    @Override
    public void fechar() {
        System.out.println("Fechar");
    }

    @Override
    public void jogar() {
        System.out.println("Exibir menu");
        System.out.println("Exibir vídeo de jogadas no fundo");
    }

}
