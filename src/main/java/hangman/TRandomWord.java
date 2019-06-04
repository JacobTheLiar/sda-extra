package hangman;

import java.util.Random;

public class TRandomWord {

    private static String[] list = {
            "horse",
            "cat",
            "notes",
            "java",
            "hangman",
            "human",
            "clock",
            "hat",
            "class",
            "package",
            "import",
            "public",
            "private",
            "static",
            "string",
            "int"
    };

    public static String getRandomWord() {
        Random rnd = new Random();
        int item = rnd.nextInt(list.length);
        return list[item];
    }
}
