package array_statistics;

import universal.IApplication;
import universal.TExitQuery;

import java.util.Scanner;

public class TArrayApplication implements IApplication {

    private boolean fExit = false;
    private Scanner scanner = new Scanner(System.in);

    public void run(){

        do {
            System.out.println("===== array array_statistics ver. 0.1 =====");

            int arraySize = getArraySize();
            TUserArray userArray = new TUserArray();
            int[] myArray = userArray.getUserArray(arraySize);

            TArrayStatistic stats = new TArrayStatistic(myArray);

            fExit = TExitQuery.canExit();
        } while (!fExit);
    }

    private int getArraySize(){
        while (true){
            System.out.print("enter array size: ");
            if(scanner.hasNextInt()){
                return scanner.nextInt();
            } else {
                System.out.println("fail! try again.");
            }
            scanner.nextLine();
        }
    }

}
