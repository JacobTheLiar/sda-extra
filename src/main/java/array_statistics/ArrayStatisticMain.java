package array_statistics;

import universal.IApplication;

public class ArrayStatisticMain {

    public static void main(String[] args) {
        // część A
        int[] testArray = new int[]{2,5,1,-3,5,22,21,66,21,54};

        TArrayStatistic test = new TArrayStatistic();
        test.printArrayStatistic(testArray);

        //cześć B
        IApplication app = new TArrayApplication();
        app.run();
    }
}
