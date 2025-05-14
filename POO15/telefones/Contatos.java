package POO15.telefones;

import java.util.ArrayList;

public class Contatos {
    private ArrayList<Contato> contatos;

    public Contatos() {
        this.contatos = new ArrayList<>();
    }

    public void adicionar(String nome, String numero) {
        Contato novoContato = new Contato(nome, numero);
        contatos.add(novoContato);
    }

    public void adicionar(Contato novoContato) {
        contatos.add(novoContato);
    }

    public String toString() {
        String informacao = "Contatos:\n";
        for (Contato contato : contatos) {
            informacao += contato + "\n";
        }
        return informacao;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void remover(Contato contato) {
        contatos.remove(contato);
    }

    public Contatos buscarContato(String palavra) {
        Contatos contatosFiltrados = new Contatos();
        for (Contato contato : contatos) {
            String nomeContato = contato.getNome();
            if (nomeContato.startsWith(palavra.toUpperCase())) {
                contatosFiltrados.adicionar(contato);
            }
        }
        System.out.println("---Contatos Filtrados---");
        return contatosFiltrados;
    }

}
