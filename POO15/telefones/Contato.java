package POO15.telefones;

public class Contato {
    private String nome, numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String toString() {
        String a = String.format("Nome: %s\tNúmero: %s", nome, numero);
        return a;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

}
