package POO11;

import POO11.animais.Animal;

public class Ave extends Animal {

    public Ave(String nome) {
        super(nome);
    }

    public void voar() {
        System.out.printf("%s voou", getNome());
    }

}
