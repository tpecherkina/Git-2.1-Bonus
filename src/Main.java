public class Main {
    public static void deal(int amountOfDeposit) {
        int initialBalance=100;
        int finalBalance;
          if (amountOfDeposit > 1000) {
            finalBalance = amountOfDeposit / 100 + amountOfDeposit+initialBalance;
        } else {
            finalBalance = amountOfDeposit+initialBalance;
        }
    }

