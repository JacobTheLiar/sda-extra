package hangman;

import universal.IApplication;

public class HangmanMain {

    public static void main(String[] args) {
        System.out.println("=== hangman app ver. 0.1 ===");

        IApplication app = new THangmanApp();
        app.run();

    }

}
