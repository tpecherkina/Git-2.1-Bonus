public class Main {
    public static void balanceDeal( int payment, int balance) {
        int bonusAmount = 100;
        int paymentBonusMin = 1000;
        if (payment <= paymentBonusMin) {
             balance = balance + payment;
            
        } else {
       int bonus = payment / bonusAmount;
          balance = balance + payment + bonus;
        }
        System.out.println("Ваш баланс " + balance);
    }
      public static void main(String[] args){
        balanceDeal(300,50);
        balanceDeal(50, 10000);
    }
}
