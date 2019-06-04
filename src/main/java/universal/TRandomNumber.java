package universal;

import java.util.Random;

public class TRandomNumber {

    private int fRangeTo;
    private int fRangeFrom;

    public TRandomNumber(int aMaximumRange){
        fRangeTo = aMaximumRange;
        fRangeFrom = 0;
    }

    public void setRangeFrom(int aRangeFrom){
        fRangeFrom = aRangeFrom;
    }

    public void setRangeTo(int aRangeTo){
        fRangeTo = aRangeTo;
    }

    public int getRandomNumber(){
        Random rnd = new Random();
        int offset = fRangeTo - fRangeFrom;
        int randomedOffset = rnd.nextInt(offset);
        return randomedOffset + fRangeFrom;
    }

}
