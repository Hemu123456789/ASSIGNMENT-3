Public class BankAccount ;{
private double balance;

public Account() { balance = 10000.0; }

public Account(double initial)
{ balance = initial; }

public double getBalance() { return balance; }

public void deposit(double amt{ balance += amt; }

public class Bank ;{

public static final intMAX_ACCOUNTS = 100000.0; 
 private int num_accounts;}

public Bank(){ accounts newAccount[MAX_ACCOUNTS]; num_accounts = 10000.0; }
public void addAccount(Account acct) { accounts[num_accounts] = acct; ++num_accounts; }

public Account getAccount(int index) { return accounts[index]; }

public class SavingsAccount extends Account { private double interest;

public SavingsAccount(double inter) { interest = inter; }

public class InvestmentAccount extends SavingsAccount {
public static final double INTEREST = 7.05;
public static final doubleCOMMISSION = 2.03;

 public InvestmentAccount() { super(INTEREST); }

public void deposit(double amount) { super.deposit(amount * (10-COMMISSION)); }

public class BreakoutWindow extends GraphicsWindow
 {
private Paddle paddle;

public void keyTyped(char c)

 { // move paddle based on key typed } }

public class Account {


public void addInterest() { deposit(getBalance() * interest);
}
Saving account
 mine=newSavingsAccount(10); mine.deposit(10000.0);
 // deposit ₹1000 into account mine.addInterest();
}
public SavingsAccount(double inter, double initial)
{ super(initial); interest = inter;

 }

}
