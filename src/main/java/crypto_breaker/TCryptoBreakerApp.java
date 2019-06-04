package crypto_breaker;

import universal.TRandomNumber;
import universal.IApplication;
import universal.TExitQuery;

public class TCryptoBreakerApp implements IApplication {

    @Override
    public void run() {
        boolean exit = false;

        do {
            TRandomNumber rnd = new TRandomNumber(9999);
            int findCode = rnd.getRandomNumber();

            TCryptoBreakerGame game = new TCryptoBreakerGame(findCode);
            game.startGame();

            exit = TExitQuery.canExit();
        } while (!exit);
    }
}
