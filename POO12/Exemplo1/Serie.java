package POO12.Exemplo1;

public class Serie {
    private String nome;
    private int temporadas, ano;

    public Serie(String nome, int temporadas, int ano) {
        this.nome = nome;
        this.temporadas = temporadas;
        this.ano = ano;
    }

    @Override
    public String toString() {
        String informacoes = String.format("Nome: %s\nTemporadas: %d\nAno: %d\n", nome, temporadas, ano);
        return informacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
