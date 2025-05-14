package POO15.telefones;

import java.util.ArrayList;

public class Ligacoes {
    private ArrayList<Ligacao> ligacoes;

    public Ligacoes() {
        this.ligacoes = new ArrayList<>();
    }

    public void adicionar(Ligacao novaLigacao) {
        ligacoes.add(novaLigacao);
    }

    public String toString() {
        String informacao = "Ligações:\n";
        for (Ligacao ligacao : ligacoes) {
            informacao += ligacao;
        }
        return informacao;
    }
}
