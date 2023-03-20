package Part1Advanced;

public class Customer {
    int amount = 10000;
     public synchronized void withdraw(int n){
         System.out.println("Withdraw....");
         if (amount < n){
             System.out.println("Not enough amount");
             try {
                 wait();
             } catch (InterruptedException e) {
                 System.out.println(e);
             }
         }
         amount = amount - n;
         System.out.println("Success withdraw");
     }

     public synchronized void deposit(int n){
         System.out.println("Depositing....");
         amount = amount + n;
         System.out.println("Success Deposit");
         notify();
     }
}
