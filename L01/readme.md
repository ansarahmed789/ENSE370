# Hangman Game - README

## Introduction

This is a simple version of the classic "Hangman" game written in Java. It was created as part of a lab assignment to explore basic Java concepts like arrays, loops, and user input handling. The game uses two arrays—one for the secret word and another for tracking the guessed progress—and updates the game state dynamically as guesses are made.

## How to Play the Game

1. **Player 1:**
   - When the game starts, Player 1 is asked to enter the secret word.
   - The input is hidden (thanks to the `Console.readPassword()` method) so Player 2 won’t see it while they type.

2. **Player 2:**
   - After Player 1 enters the word, the game clears the screen and starts the guessing phase.
   - Player 2 will guess one letter or the entire word at a time.
   - For each guess:
     - If a letter is guessed:
       - The program checks if it exists in the secret word.
       - If it does, it updates the guessed word and shows progress.
       - If not, it counts as a wrong guess.
     - If the entire word is guessed:
       - If correct, Player 2 wins immediately.
       - If wrong, the game ends, and Player 2 loses.
   - After each guess, the game shows the current guessed word and how many wrong guesses are left.

3. **End Conditions:**
   - The game ends when:
     - Player 2 correctly guesses the entire word.
     - Player 2 uses all 5 allowed incorrect guesses.

4. **Winning and Losing:**
   - Player 2 wins by correctly guessing the word.
   - If Player 2 runs out of guesses, they lose, and the secret word is revealed.

## How This Lab Was Tackled

### Key Concepts Used:

1. **Two Arrays:**
   - The first array stores the secret word entered by Player 1.
   - The second array holds the current guessed progress (initially filled with `'*'`).

2. **Comparing Arrays:**
   - Each time Player 2 guesses a letter, it’s compared to the characters in the secret word.
   - Matches are updated in the guessed word array.

3. **Game Loop:**
   - A `while` loop controls the game and continues until Player 2 either guesses the word or uses up all incorrect guesses.
   - Within the loop, the game:
     - Shows the current guessed word.
     - Asks for Player 2’s input (letter or full word).
     - Updates the guessed progress or tracks incorrect guesses based on input.

4. **Hiding the Secret Word:**
   - `Console.readPassword()` is used to hide Player 1’s input so Player 2 doesn’t see it.

5. **Feedback:**
   - The program provides instant feedback for each guess (correct or wrong).
   - It keeps Player 2 informed of their progress and remaining attempts.

## How to Run the Program

1. Compile the program using the `javac` command:
 javac Hangman.java

2. Run the program:
java Hangman

3. Follow the instructions:
Player 1 enters the secret word.
Player 2 guesses letters or the full word.