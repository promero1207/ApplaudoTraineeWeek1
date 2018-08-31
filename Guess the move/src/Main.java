import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String unknownBook;

        Game game = new Game();
        unknownBook = game.getRandomMovie();
        game.play(unknownBook);

    }


}
