package POO14;

public class App {
    public static void main(String[] args) {
        Filme filme = new Filme("Neymar");
        Serie serie = new Serie("Chris", 5, 20);

        filme.play();
        System.out.println();
        // filme.play("Inglês");
        // filme.play("Espanhol", "Italiano");

        System.out.println(serie);
        serie.setAudio("Inglês");
        serie.setLegenda("Português");
        serie.play(2, 4);
        System.out.println(Video.totalVideos);

    }
}
