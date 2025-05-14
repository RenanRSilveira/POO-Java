package POO11.animais;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    public void lamber() {
        System.out.printf("%s está lambendo\n", getNome());
    }

    public void latir() {
        System.out.printf("%s está latindo\n", getNome());

    }
}
