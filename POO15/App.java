package POO15;

import POO15.telefones.Contato;
import POO15.telefones.Contatos;
import POO15.telefones.Telefone;

public class App {
    public static void main(String[] args) {
        Telefone telefone = new Telefone("40028922");

        Contato contato = new Contato("Renan", "987654123");
        Contato contato2 = new Contato("Rosa", "123456654");
        Contato contato3 = new Contato("Silva", "98765423");
        Contatos telefoneContatos = telefone.getContatos();
        telefoneContatos.adicionar(contato);
        telefoneContatos.adicionar(contato2);
        telefoneContatos.adicionar(contato3);

        telefone.ligar(contato2);
        telefone.ligar(contato3);

        System.out.println(telefone.getLigacoes());

    }
}
