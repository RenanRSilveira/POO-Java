package POO23;

public class App {
    public static void main(String[] args) {
        /*  Record é uma classe que já inclui os Getters, além do .equals()
         *  e o hashCode(), não temos os Setters.
         *  No exemplo, a classe PessoaRecord() equivale a classe Pessoa();.
         * -> Limitações:
         *   .Os campos são implicitamente final, ou seja, não podem ser modificados após a criação.
         *   .Não podem herdar de outras classes
         *   .PODEM implementar interfaces.
         *  Use record para simplificar seu código quando estiver lidando com classes imutáveis que só
         *  armazenam dados. Menos código, mais clareza, e tudo com performance sólida e segurança.
         */

        PessoaRecord p1 = new PessoaRecord("Renan", 25);

        System.out.println(p1.nome());
    }
}

record PessoaRecord(String nome, int idade) {
    
}

final class Pessoa {
    private final String nome;
    private final int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String nome() { return nome; }
    public int idade() { return idade; }

    @Override
    public boolean equals(Object o) { return true; }

    @Override
    public int hashCode() { return 0; }

    @Override
    public String toString() {
        return "Pessoa[nome=" + nome + ", idade=" + idade + "]";
    }
}
