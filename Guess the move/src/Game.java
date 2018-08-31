import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    /***
     * Method that creates the file from the text document
     * @return created file from the text document
     */
    public File loadFile(){
        File file = new File("movies.txt");
        return file;
    }


    /**
     * Method that fills an Array with the movies titles that contains the file.
     * @return list of movies from the file
     */
    public ArrayList<String> readFile(){
        Scanner scanner = null;
        ArrayList<String> book = new ArrayList<>();
        File file = loadFile();
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        if(scanner != null) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                book.add(line);
            }
        }
        return book;
    }

    /**
     * Method that teturns a random title from the movies list
     * @return movie name from the list
     */
    public String getRandomMovie(){
        int number;
        ArrayList<String> books = readFile();
        if(books.size() != 0) {
            number = (int) (Math.random() * books.size());
            return books.get(number);
        }
        else{
            return "";
        }
    }

    /***
     * Method for playing game, game logic is done here.
     * @param unknownBook movie name for playing
     */
    public void play(String unknownBook){

        int score;
        String guessedLetter,tempString;
        Scanner scanner;
        Boolean band;

        score = 0;
        band = true;

        if(!unknownBook.equals("")) {
            //Dashed word is created here
            StringBuilder stringBuilder = new StringBuilder(unknownBook);

            for (int i = 0; i < unknownBook.length(); i++) {
                if (unknownBook.charAt(i) != ' ')
                    stringBuilder.setCharAt(i, '-');
            }


            System.out.println("You are guessing:" + stringBuilder);
            scanner = new Scanner(System.in);
            while (score < 10 && band) {
                System.out.format("You have guessed (%d) wrong letters:\n", score);

                //Request letter from user
                System.out.print("Guess a letter: ");
                guessedLetter = scanner.nextLine();

                if (unknownBook.contains(guessedLetter)) {
                    for (int i = 0; i < unknownBook.length(); i++) {
                        if (guessedLetter.equals(String.valueOf(unknownBook.charAt(i)))) {
                            stringBuilder.setCharAt(i, guessedLetter.charAt(0));
                        }

                    }
                } else {
                    score += 1;
                }

                if (score > 9)
                    System.out.println("You loose!");
                else {
                    System.out.println("You are guessing:" + stringBuilder);
                }

                if (unknownBook.equals(stringBuilder.toString())) {
                    band = false;
                    System.out.println("You win!");
                }
            }

        }
    }
}
