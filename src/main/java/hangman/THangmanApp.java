package hangman;

import universal.TExitQuery;
import universal.TInput;
import universal.IApplication;

public class THangmanApp implements IApplication {

    @Override
    public void run(){
        boolean exit = false;

        do {
            int option = getMenuOption();
            String word = getWord(option);

            THangmanGame game = new THangmanGame(word);
            game.startGame();

            exit = TExitQuery.canExit();
        } while (!exit);
    }

    private String getWord(int option) {
        String wrd;
        if (option==1){
            System.out.print("enter the word: ");
            wrd = TInput.getString();
        } else {
            wrd = TRandomWord.getRandomWord();
        }
        //System.out.println(wrd);
        return wrd;
    }

    private int getMenuOption() {
        System.out.println("Select hangman option:");
        System.out.println("   1 - enter word;");
        System.out.println("   2 - random word;");
        int option = 0;
        while (!(option==1 || option==2)){
            option = TInput.getInt();
        }
        return option;
    }

}
