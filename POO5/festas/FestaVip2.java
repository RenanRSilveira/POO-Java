package POO5.festas;

public class FestaVip2 {
    int qtdCafe = 30;
    int qtdSalgados = 50;

    void entrar() {
        beberCafe();
        System.out.println(qtdCafe);
    }

    private void beberCafe() {
        qtdCafe--;
        System.out.println("Bebeu 1 xícara de café");
    }

}
