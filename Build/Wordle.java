package Build;

import java.util.Scanner;

public class Wordle {
    String secretWord;
    int attempts;

    public Wordle(String secretWord, int attempts) {
        this.secretWord = secretWord;
        this.attempts = attempts;

    }

    public static void main(String[] args) {
        Wordle word = new Wordle("example", 6);
        word.play();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int remainAttempts = attempts;
        while (remainAttempts > 0) {
            System.out.println("attempts remaining : " + remainAttempts);
            System.out.println("Enter your guess");
            String guess = scanner.nextLine();

            if (guess.length() != secretWord.length()) {
                System.out.println("Invalid guess please enter a word with the same length as the secret word.");
                continue;
            }
            int correctChars = 0;
            int correctPositions = 0;

            for (int i = 0; i < secretWord.length(); i++) {
                char c = guess.charAt(i);
                if (c == secretWord.charAt(i))
                    correctPositions++;
                else if (secretWord.indexOf(c) >= 0)
                    correctChars++;
            }

            if (correctPositions == secretWord.length()){
                System.out.println("Congratulations! You guessed the secret word" + secretWord);
                break;
            } else {
                System.out.println("Correct characters: " + correctChars);
                System.out.println("Correct Positions: " + correctPositions);
                remainAttempts--;
            }

        }
        if (remainAttempts == 0)
            System.out.println("Sorry, you're out if attempts, the secret word was "+ secretWord);
    }
}
