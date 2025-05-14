package POO14;

public class Serie extends Filme {
    private int temporadas, episodiosPorTemorada, temporadaAtual, episodioAtual;

    public Serie(String nome, int temporadas, int episodiosPorTemorada) {
        super(nome);
        this.temporadas = temporadas;
        this.episodiosPorTemorada = episodiosPorTemorada;
        this.temporadaAtual = 1;
        this.episodioAtual = 1;

    }

    @Override
    public String toString() {
        return String.format("Série %s %dx%02d (audio %s, legenda %s)", getNome(),
                temporadaAtual,
                episodioAtual,
                getAudio(),
                getLegenda());
    }

    public void play(int temporada, int episodio) {
        if (validarEpisodio(temporada, episodio)) {
            this.temporadaAtual = temporada;
            this.episodioAtual = episodio;
            System.out.println(toString());
        } else {
            System.out.println("Números inválidos");
        }

    }

    private boolean validarEpisodio(int temporada, int episodio) {
        if (temporada == 0 || episodio == 0) {
            return false;
        } else if (temporada > this.temporadas || episodio > episodiosPorTemorada) {
            return false;
        } else {
            return true;
        }

    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporada) {
        this.temporadas = temporada;
    }

    public int getEpisodiosPorTemorada() {
        return episodiosPorTemorada;
    }

    public void setEpisodiosPorTemorada(int episodiosPorTemorada) {
        this.episodiosPorTemorada = episodiosPorTemorada;
    }

    public int getTemporadaAtual() {
        return temporadaAtual;
    }

    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }

    public int getEpisodioAtual() {
        return episodioAtual;
    }

    public void setEpisodioAtual(int episodioAtual) {
        this.episodioAtual = episodioAtual;
    }

}
