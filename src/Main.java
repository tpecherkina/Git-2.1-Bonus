public class Main {
    public static void deal(int amountOfDeposit) {
        int balance=100;
              if (amountOfDeposit > 1000) {
            balance = amountOfDeposit / 100 + amountOfDeposit+balance;
          
        } else {
            balance = amountOfDeposit+balance;
              
        }System.out.println(finalBalance);
    }

