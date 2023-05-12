public interface BankAccount {
     // withdraw money
     Boolean withdrawMoney(int money);
     // check balance

     int checkBalance();

     // add money
     Boolean addMoney(int money);

     // get Interest
     int getROI();

     // get total rate of interest

     int getTotalInterest(int amount, int timeInYears);



}
