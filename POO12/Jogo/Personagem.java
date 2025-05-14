package POO12.Jogo;

public abstract class Personagem {
    private String nome, classe;
    private int nivel;

    public Personagem(String nome) {
        this.nome = nome;
        this.classe = "Nenhuma";
        this.nivel = 1;
    }

    public abstract void atacarComArma();

    @Override
    public String toString() {
        String data = String.format("Nome: %s\nNível: %d\nClasse: %s\n", nome, nivel, classe);
        return data;
    }

    public void atacar() {
        System.out.printf("%s atacou\n", nome);
    }

    public final void atacarSemArma() {
        System.out.printf("%s atacou\n", nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
