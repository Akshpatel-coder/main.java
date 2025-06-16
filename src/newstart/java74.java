package newstart;
import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100) + 1; // 1 to 100
    }

    void takeUserInput() {
        System.out.print("Guess the number (1 to 100): ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.println("Congratulations! You guessed it in " + noOfGuesses + " tries.");
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low...");
        } else {
            System.out.println("Too high...");
        }
        return false;
    }
}

public class java74 {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
