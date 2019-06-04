package universal;


import java.util.Scanner;

public class TInput {


    public static String getString(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(">");
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            } else {
                System.out.println("fail! try again.");
            }
        }
    }

    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print(">");
            if(scanner.hasNextInt()){
                int value = scanner.nextInt();
                return value;
            } else {
                System.out.println("fail! try again.");
            }
            scanner.nextLine();
        }
    }

    public static char getDummyChar(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(">");
            if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.length()==1){
                    return line.charAt(0);
                } else {
                    System.out.println("fail! try again.");
                }
            } else {
                 System.out.println("fail! try again.");
            }
        }
    }


    public static char getChar(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next(".").charAt(0);
    }


    public static double getDouble(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print(">");
            if(scanner.hasNextDouble()){
                double value = scanner.nextDouble();
                return value;
            } else {
                System.out.println("fail! try again.");
            }
            scanner.nextLine();
        }

    }



}
