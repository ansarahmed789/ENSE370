//Name: Ansar Ahmed
//SID: 200470692
//Date: 28th January 2025

import java.util.Scanner;
import java.io.Console;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Console console = System.console();

        
        System.out.println("Player 1, enter the secret word:");
        char[] Array1 = console.readPassword(); 
        String theSecretWord = new String(Array1).toUpperCase();

        
        System.out.println("\n\n\n\n\n"); 
        System.out.println("The game begins!\n");

        
        char[] Array2 = new char[theSecretWord.length()];
        for (int i = 0; i < Array2.length; i++) {
            Array2[i] = '*';
        }

        int incorrectGuesses = 0;
        final int maximumIncorrectguesses = 5;
        boolean wordGuessed = false;

        
        while (incorrectGuesses < maximumIncorrectguesses && !wordGuessed) {
            System.out.println("Current word: " + new String(Array2));
            System.out.println("Incorrect guesses remaining: " + (maximumIncorrectguesses - incorrectGuesses));
            System.out.print("Guess a letter or the entire word: ");

            String guess = scanner.nextLine().toUpperCase();

            if (guess.length() == 1) {
                char guessedLetter = guess.charAt(0);
                boolean correctGuess = false;

                for (int i = 0; i < theSecretWord.length(); i++) {
                    if (theSecretWord.charAt(i) == guessedLetter && Array2[i] == '*') {
                        Array2[i] = guessedLetter;
                        correctGuess = true;
                    }
                }

                if (!correctGuess) {
                    System.out.println("Wrong guess!");
                    incorrectGuesses++;
                } else {
                    System.out.println("Correct guess!");
                }
            } else if (guess.equals(theSecretWord)) {
                wordGuessed = true;
                break;
            } else {
                System.out.println("Wrong word guess!");
                incorrectGuesses = maximumIncorrectguesses;
            }

            if (new String(Array2).equals(theSecretWord)) {
                wordGuessed = true;
            }
        }

        if (wordGuessed) {
            System.out.println("Congratulations! You guessed the word: " + theSecretWord);
        } else {
            System.out.println("Game over! The word was: " + theSecretWord);
        }

        scanner.close();
    }
}