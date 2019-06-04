package spammer;

public class TSpammer {

    private String fWord;
    private int fRepeat;

    public void bakeSpam(String aWord, int aRepeatCount) {
        fWord = aWord;
        fRepeat = aRepeatCount;

        System.out.println(prepareMessage());
    }

    private String prepareMessage(){
        String result = "";

        for (int i=0; i<fRepeat;i++)
            result = result +","+fWord;

        return result;
    }
}
