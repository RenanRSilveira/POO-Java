package POO009a.classes;

public class TiroAoAlvo implements Jogo {

    @Override
    public void fechar() {
        System.out.println("Salvando no server");
    }

    @Override
    public void jogar() {
        System.out.println("Carregando o jogo");
        System.out.println("Conectando ao servidor");
        System.out.println("Carregando partida");
    }

}
