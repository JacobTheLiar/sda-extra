package hangman;

import universal.TInput;

public class THangmanGame {

    private String fWord;
    protected final int TRIES_COUNT = 5;
    private int tries = 0;

    private char[] charWord;
    private char[] searchWord;

    public THangmanGame(String aWord) {
        super();
        fWord = aWord.toUpperCase();
    }

    public void startGame() {

        tries = TRIES_COUNT;
        boolean win = false;
        toArrays();

        do {
            printStats();

            // podaj literę
            System.out.println("enter letter:");
            String enteredText = TInput.getString().toUpperCase();

            if (enteredText.length() == 1) {
                char letter = enteredText.charAt(0);//Character.toUpperCase(TInput.getDummyChar());
                //sprawdzenie litery
                if (isLetterCorrect(letter)) {
                    System.out.println("you guessed the letter");
                    win = isFullWord();
                } else {
                    System.out.println("I'm sorry, this is not the letter");
                    tries--;
                }
            } else {
                System.out.println("you cheat, you die");
                tries = 0;
            }
        } while (tries > 0 && !win);

        System.out.println("==> " + fWord + " <==");
        if (win) {
            System.out.println("you guessed the word you are free");
        } else {
            System.out.println("you have been hanged");
        }
    }

    private boolean isLetterCorrect(char letter) {
        boolean correct = false;
        for (int i = 0; i < charWord.length; i++)
            if (charWord[i] == letter) {
                searchWord[i] = letter;
                correct = true;
            }
        return correct;
    }

    private boolean isFullWord() {
        boolean isFull = true;
        for (int i = 0; i < searchWord.length; i++) {
            if (searchWord[i] == '_') {
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    private void toArrays() {
        searchWord = new char[fWord.length()];
        for (int i = 0; i < searchWord.length; i++)
            searchWord[i] = '_';
        charWord = fWord.toCharArray();
    }

    private void printStats() {
        System.out.println("===========================================================================================");
        System.out.println("lives count: " + tries);
        System.out.println("find word: " + printWord());
    }

    private String printWord() {
        String outText = "[";
        for (int i = 0; i < searchWord.length; i++)
            outText += " " + searchWord[i];

        outText += " ]";
        return outText;

    }

}
