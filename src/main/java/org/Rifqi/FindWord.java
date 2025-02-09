package org.Rifqi;


import java.util.Scanner;

public class FindWord {
    private final String[] words = {"hello", "world", "java", "kotlin"};


    private int randomize(int n) {
        return (int) (Math.random() * n);

    }

    private String randomWord() {
        return words[randomize(words.length)];
    }

    private String hideWord(String word) {
        char[] hiddenLetter = word.toCharArray();
        int numberOfLetter = (int) (word.length() * 0.8);

        for (int i = 0; i < numberOfLetter; i++) {
            int randomIndex = randomize(word.length());

            hiddenLetter[randomIndex] = '_';
        }
        return new String(hiddenLetter);

    }

    public void gameStart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to word Guessing game");

        String wordToGuess = randomWord();
        char[] hiddenWord = hideWord(wordToGuess).toCharArray();
        char[] guessedWord = wordToGuess.toCharArray();
        System.out.println("Guess This Word : " + new String(hiddenWord));
        boolean isGuessed = false;
        do {
            System.out.println("Enter a Letter : ");
            char guess = scanner.next().charAt(0);
            boolean found = false;
            for (int i = 0; i < guessedWord.length; i++) {
                if (guessedWord[i] == guess && hiddenWord[i] == '_') {
                    hiddenWord[i] = guess;
                    found = true;
                }
            }
            if (found) {
                System.out.println("Correct " + new String(hiddenWord));
            } else {
                System.out.println("Wrong Try Again! " + new String(hiddenWord));
            }
            isGuessed = new String(hiddenWord).equalsIgnoreCase(wordToGuess);

        } while (!isGuessed);
        System.out.println("Congrats you guees it right " + wordToGuess);
        scanner.close();


    }
}
