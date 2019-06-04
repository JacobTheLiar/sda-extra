package array_statistics;

import java.util.Scanner;

public class TUserArray {

    Scanner scanner = new Scanner(System.in);

    public int[] getUserArray(int aSize){
        System.out.println("enter "+aSize+" numbers:");

        int[] array = new int[aSize];

        for (int i=0; i<aSize; i++)
            array[i] = getValue(i);

        return array;
    }

    private int getValue(int aItemNo){
        while (true){
            System.out.print("enter "+(aItemNo+1)+" random_number: ");
            if(scanner.hasNextInt()){
                return scanner.nextInt();
            } else {
                System.out.println("fail! try again.");
            }
            scanner.nextLine();
        }
    }
}
