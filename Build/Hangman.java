package Build;

import java.util.HashSet;
import java.util.Scanner;

public class Hangman {

    String secretWord;
    int attempts;
    StringBuilder guessedWord;
    HashSet<Character> guessLetters;

    public Hangman(String secretWord, int attempts) {
        this.secretWord = secretWord;
        this.attempts = attempts;
        this.guessedWord = new StringBuilder(secretWord.replace(".","_"));
        this.guessLetters = new HashSet<>();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int remainingAttempts = attempts;

        while (remainingAttempts > 0 && !guessedWord.toString().equals(secretWord)){
            System.out.println("Attempts remaining: "+ remainingAttempts);
            System.out.println("Guessed word: " + guessedWord);
            System.out.println("Enter a letter to guess: ");
            char guess = scanner.next().charAt(0);

            if(guessLetters.contains(guess)){
                System.out.println("You've already guessed this letter");
                continue;
            }

            guessLetters.add(guess);

            if (secretWord.indexOf(guess) >= 0) {
                for (int i = 0; i < secretWord.length(); i++) {
                    if(secretWord.charAt(i) == guess)
                        guessedWord.setCharAt(i, guess);
                }
            } else
                remainingAttempts--;

        }
        if(guessedWord.equals(secretWord))
            System.out.println("Congratulations! you guessed the secret word: " + secretWord);
        else
            System.out.println("Sorry, you're out of attempts. the secret word was: " + secretWord);
    }

}
class HangmanGame {
    public static void main(String[] args) {
        Hangman hangman = new Hangman("example", 8);
        hangman.play();
    }
}
