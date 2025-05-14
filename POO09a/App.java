package POO9a;

import POO9a.classes.Pingpong;
import POO9a.classes.VideoGame;

public class App {
    public static void main(String[] args) {
        Pingpong pingPong = new Pingpong();
        VideoGame xDevOne = new VideoGame();

        xDevOne.ligar();
        xDevOne.jogar(pingPong);
    }
}
