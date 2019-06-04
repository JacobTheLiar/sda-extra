package array_statistics;

import java.util.Arrays;

public class TArrayStatistic {
    int[] fArray = {};
    int arrayMax = Integer.MIN_VALUE;
    int arrayMin = Integer.MAX_VALUE;
    int arraySum = 0;

    public TArrayStatistic() {
        super();
    }

    public TArrayStatistic(int[] aArray) {
        this();
        printArrayStatistic(aArray);
    }

    public void printArrayStatistic(int[] aArray) {
        fArray = aArray;
        resetStatistics();
        calculate();
        printStats();
    }

    private void calculate() {
        for (int i = 0; i < fArray.length; i++) {
            checkMax(fArray[i]);
            checkMin(fArray[i]);
            addSum(fArray[i]);
        }
    }

    private void resetStatistics() {
        arrayMax = Integer.MIN_VALUE;
        arrayMin = Integer.MAX_VALUE;
        arraySum = 0;
    }

    private void checkMax(int aValue) {
        if (aValue > arrayMax)
            arrayMax = aValue;
    }

    private void checkMin(int aValue) {
        if (aValue < arrayMin)
            arrayMin = aValue;
    }

    private void addSum(int aValue) {
        arraySum += aValue;
    }

    private void printStats() {
        System.out.println("statistic for array: " + Arrays.toString(fArray));
        System.out.println(" - sum: " + arraySum);
        if (fArray.length > 0)
            System.out.println(" - avg: " + (double) arraySum / fArray.length);
        else
            System.out.println(" - avg: n/d");
        System.out.println(" - max: " + arrayMax);
        System.out.println(" - min: " + arrayMin);
        System.out.println(" - cnt: " + fArray.length);
    }

}
