package POO09a;

import POO09a.classes.Pingpong;
import POO09a.classes.VideoGame;

public class App {
    public static void main(String[] args) {
        Pingpong pingPong = new Pingpong();
        VideoGame xDevOne = new VideoGame();

        xDevOne.ligar();
        xDevOne.jogar(pingPong);
    }
}
