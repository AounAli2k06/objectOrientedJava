import java.util.*;

public class GuessTheNum {

    Scanner sc = new Scanner(System.in);

    int random;
    int numOfGuesses;
    int userInput;

    public GuessTheNum() {
        random = (int) (Math.random() * 100) + 1;
    }

    public void takeUserInput() {
        userInput = sc.nextInt();
        numOfGuesses++;
    }

    public boolean isCorrectNum() {
        return userInput == random;
    }

    public static void main(String[] args) {
        GuessTheNum game = new GuessTheNum();
        System.out.println(game.random);

        while (true) {
            game.takeUserInput();

            if (game.isCorrectNum()) {
                break;
            }

            if (game.userInput > game.random) {
                System.out.println("Your number is greater");
            } else {
                System.out.println("Your number is lesser");
            }
        }
        System.out.println("numbers match!, you took " + game.numOfGuesses + " turns");

    }
}
