// Create a BankAccount class.
public class BankAccount {
    
    // MEMBER VARIABLES or ATRIBUTES
    private double checkingBalance;
    private double savingsBalance;

    public static int numOfAccounts = 0;
    public static double totalAmount = 0;


    // CONSTRUCTOR METHOD
    // EMPTY CONSTRUCTOR
    public BankAccount() {
        numOfAccounts ++;
    }
    // FULL CONSTRUCTOR
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numOfAccounts ++;
    }


    // GETTERS
    public double getCheckingBalance() {
        return checkingBalance;
    }
    
    public double getSavingsBalance() {
        return savingsBalance;
    }
    
    //  Method that Allows a user to deposit money into checking account. 
    public void depositChecking(double depositMoney){
        this.checkingBalance += depositMoney;
        BankAccount.totalAmount += this.checkingBalance;
    }

    //  Method that Allows a user to deposit money into Savings account. 
    public void depositSavings(double depositMoney){
        this.savingsBalance += depositMoney;
        BankAccount.totalAmount += this.savingsBalance;
    }

    // Widthdraws money from the Checking  Account.
    public void withdrawMoney(double checkingBalance){
        if(checkingBalance > this.checkingBalance) {
            System.out.println("Insuficient funds");
        }
        else {
            this.checkingBalance -= checkingBalance;
        }
    }
    
    public static double gettotalAmount() {
        return totalAmount;
    }

}
