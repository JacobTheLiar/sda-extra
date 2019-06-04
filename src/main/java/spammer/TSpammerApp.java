package spammer;

import universal.IApplication;
import universal.TInput;

public class TSpammerApp implements IApplication {


    String fWord = "";
    int fRepeat = 0;

    public void run(){

        do {
            System.out.println("enter repeat count:");
            fRepeat = TInput.getInt();
            System.out.println("enter word to repeat:");
            fWord = TInput.getString();

            if (!fWord.isEmpty()){
                TSpammer spam = new TSpammer();
                spam.bakeSpam(fWord, fRepeat);
            } else {
                System.out.println("Done!");
            }
        }while (!fWord.isEmpty());
    }
}
