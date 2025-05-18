package POO02;

public class Personagem {
    String nome;
    int nivel, forca;

    void mostrar_status() {
        System.out.printf("%s tem o nível %d e força %d", nome, nivel, forca);
    }

    int dano_causado() {
        int dano = forca / 2;
        return dano;
    }

    void ataque(String alvo, String tipo) {
        if (tipo.length() == 0) {
            System.out.printf("%s atacou %s e causou %d de dano", nome, alvo, dano_causado());
        } else {
            System.out.printf("%s atacou %s com %s e causou %d de dano", nome, alvo, tipo, dano_causado());
        }
    }
}