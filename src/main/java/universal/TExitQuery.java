package universal;

import java.util.Scanner;

public class TExitQuery {

    private static Scanner scanner = new Scanner(System.in);

    public static boolean canExit(){

        while (true){
            System.out.print("continue? (yes/no): ");
            String answer = scanner.nextLine();
            if(isAnswerCorrect(answer)){
                return answer.equals("no");
            } else {
                System.out.println("incorrect answer! try again.");
            }
        }
    }

    private static boolean isAnswerCorrect(String aAnswer){
        return aAnswer.equals("yes") || aAnswer.equals("no");
    }

}
