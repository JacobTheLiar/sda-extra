package random_number;

import universal.TRandomNumber;

public class RandomNumberMain {

    public static void main(String[] args) {
        System.out.println("Random Number");

        TRandomNumber rnd = new TRandomNumber(54);

        for (int i=0; i<10; i++){
            System.out.println("losowanie #"+(i+1)+": "+rnd.getRandomNumber());
        }

        System.out.println("Random Number offset");

        TRandomNumber rndOff = new TRandomNumber(10);
        rndOff.setRangeFrom(5);

        for (int i=0; i<10; i++){
            System.out.println("losowanie #"+(i+1)+": "+rndOff.getRandomNumber());
        }

        System.out.println("Random Number offset negative");

        TRandomNumber rndNeg = new TRandomNumber(10);
        rndNeg.setRangeFrom(-100);
        rndNeg.setRangeTo(5);

        for (int i=0; i<10; i++){
            System.out.println("losowanie #"+(i+1)+": "+rndNeg.getRandomNumber());
        }

    }

}
