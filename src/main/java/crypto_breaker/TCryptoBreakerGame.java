package crypto_breaker;

import universal.TRandomNumber;
import universal.TInput;

public class TCryptoBreakerGame {

    protected final int TRIES_COUNT = 5;

    private int fCode;
    private String fCodeString;
    private int tries = 0;

    public TCryptoBreakerGame(int aCode) {
        fCode = aCode;
        fCodeString = String.format("%04d", aCode);
        System.out.println("==> "+fCodeString+" <==");
    }

    public void startGame(){

        tries = TRIES_COUNT;
        boolean win = false;
        boolean hint = false;

        do{
            printStats();
            if (hint)
                System.out.println("enter code:");
            else
                System.out.println("enter -1 to get hint or enter code: ");
            int number = TInput.getInt();

            if (!hint && number==-1){
                hint = true;
                printHint();
            } else {
                if (isCorrect(number)) {
                    System.out.println("correct code, access granted");
                    win = true;
                } else {
                    System.out.println("incorrect code, access denied");
                    printLowerHigher(number);
                    tries--;
                }
            }

        } while (!win && tries>0);

        if (!win)
            System.out.println("system is locked");
    }

    private void printHint(){
        TRandomNumber rnd = new TRandomNumber(4);
        int index = rnd.getRandomNumber();
        char[] hintCode = "____".toCharArray();
        hintCode[index] = fCodeString.charAt(index);
        System.out.println("hint: "+String.copyValueOf(hintCode));
    }

    private void printLowerHigher(int aNumber){
        if (aNumber>fCode)
            System.out.println("the code is lower");
        else
            System.out.println("the code is higher");
    }

    private boolean isCorrect(int aNumber){
        return aNumber == fCode;
    }

    private void printStats(){
        System.out.println("===========================================================================================");
        System.out.println("lives count: " + tries);
    }

}
