package POO006;

import POO006.Record.Product;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Renan");
        pessoa.setIdade(24);
        pessoa.setAltura(1.83);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());
        System.out.println();

        Product produto = new Product("Celular", 10);
        System.out.println(produto.name() + " " + produto.price());
        System.out.println(produto.toString());

    }
}
