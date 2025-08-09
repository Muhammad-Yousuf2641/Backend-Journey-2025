
import javax.swing.JOptionPane;

// 6. Encapsulation
// Question:
// Create a BankAccount class with private attributes: accountNumber, balance.
// Provide getter and setter methods to access and modify the balance safely.
// Task: Create an object, deposit and withdraw money using encapsulation.

class BankAccount{
private long accountNumber;
private int balance;
// creating a constructor to set a initial values
public BankAccount(long accountNumber, int balance) {
    this.accountNumber=accountNumber;
    this.balance=balance;
}
// getter 
public void getbankaccount(){
    JOptionPane.showMessageDialog(null,"Your account number is \n"+accountNumber+"\nYour account balance is \n"+balance);
}
// setters
public int setbankaccount(int bal){
    return this.balance+=bal;
    
}
// Due to the same class we can access the private variable others method rather than using getter and setter method
// methods to add and remove money from the account
void deposit(int amount){
    this.balance+=amount;  
}

void withdraw(int amount){
    this.balance-=amount;
}
}
public class encapsulation{
    public static void main(String[] args) {
        BankAccount user1Account = new BankAccount(1234567890,10000);
        // user1Account.setbankaccount(50000);
        user1Account.deposit(20000);
        user1Account.withdraw(1000);
        user1Account.getbankaccount(); // 29000

        BankAccount user2Account = new BankAccount(12345,10000);
        // user2Account.setbankaccount(500);
        user2Account.deposit(20000);
        user2Account.withdraw(27000);
        user2Account.getbankaccount(); // 3000
    }
}




