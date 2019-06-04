package crypto_breaker;

import universal.IApplication;

public class CryptoBreakerMain {

    public static void main(String[] args) {
        System.out.println("=== crypto braker app ver. 0.1 ===");

        IApplication app = new TCryptoBreakerApp();
        app.run();

    }

}
