
public class Main{
    public static void main(String[] args) {
        String unknownBook;

        Game game = new Game();
        unknownBook = game.getRandomMovie();
        game.play(unknownBook);

    }

}
