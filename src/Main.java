public class Main {
    public static void deal(int amountOfDeposit) {
        int initialBalance=100;
        int finalBalance;
        int amountOfDeposit;
        if (amountOfDeposit > 1000) {
            finalBalance += amountOfDeposit * 0.01 + amountOfDeposit+initialBalance;
        } else {
            finalBalance += amountOfDeposit+initialBalance;
        }
    }


    public static void main(String[] args){
        deal(20000);

    }
}