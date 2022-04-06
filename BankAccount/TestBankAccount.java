
public class TestBankAccount {
    public static void main(String [] args){
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.depositChecking(1000);
        account1.depositSavings(500);
        account1.withdrawMoney(900);
        account2.depositChecking(2000);
        account2.depositSavings(2000);
        account2.withdrawMoney(900);
        System.out.println("Your checking balance is : " + account1.getCheckingBalance());
        System.out.println("Your Savings balance is : " + account1.getSavingsBalance());
        System.out.println("Your total is : " + BankAccount.totalAmount);
        System.out.println("Your checking balance is : " + account2.getCheckingBalance());
        System.out.println("Your Savings balance is : " + account2.getSavingsBalance());
        System.out.println("Your total is : " + BankAccount.totalAmount);
        System.out.println("Number of accounts : " + BankAccount.numOfAccounts);
    }
    
}
