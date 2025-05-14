package POO15.telefones;

public class Telefone {
    private String numeroChip;
    private Contatos contatos;
    private Ligacoes ligacoes;

    public Telefone(String numeroChip) {
        this.numeroChip = numeroChip;
        this.contatos = new Contatos();
        this.ligacoes = new Ligacoes();
    }

    public void ligar(String numeroDestino) {
        Ligacao ligacao = new Ligacao(numeroChip, numeroDestino);
        ligacao.ligar();
        ligacoes.adicionar(ligacao);
    }

    public void ligar(Contato numeroDestino) {
        ligar(numeroDestino.getNumero());
    }

    public String getNumeroChip() {
        return numeroChip;
    }

    public Contatos getContatos() {
        return contatos;
    }

    public Ligacoes getLigacoes() {
        return ligacoes;
    }

}
