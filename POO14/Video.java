package POO14;

public class Video {
    private String nome;
    public static int totalVideos = 0;

    public Video(String nome) {
        this.nome = nome;
        totalVideos++;
    }

    public void play() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
