package spammer;

import universal.IApplication;

public class SpammerMain {

    public static void main(String[] args) {
        System.out.println("=== spammer ver. 0.1 ===");

        IApplication spam = new TSpammerApp();
        spam.run();
    }

}
