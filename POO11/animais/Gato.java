package POO11.animais;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    public void miar() {
        System.out.printf("%s está miando\n", getNome());
    }
}
