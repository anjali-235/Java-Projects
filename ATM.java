import java.util.Scanner;

public class ATM {
    private BankAccount account;

    public ATM(BankAccount account){
       this.account = account;
    }

    // display the menu of ATM to user
    public void display(){
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.println("Select an option from 1 to 4:");
    }
    // display the withdrawal or deposited amount to the user
    public void withdraw(double amount){
        if(account.withdraw(amount)){
            System.out.println("Successfully Withdraw "+amount+".");
            System.out.println("---------------------------------------");
        }
        else{
            System.out.println("Withdrawal failed! Invalid amount.");
            System.out.println("---------------------------------------");
        }
    }
    public void deposit(double amount){
        if(account.deposit(amount)){
            System.out.println("Successfully deposited "+amount+".");
            System.out.println("---------------------------------------");
        }
        else{
            System.out.println("Deposit failed! Invalid amount.");
            System.out.println("---------------------------------------");
        }
    }
    public void checkBalance(){
        double balance = account.checkBalance();
        System.out.println("Your current balance is: "+balance);
        System.out.println("---------------------------------------");
    }
}
class BankAccount{
    private double balance;

    public BankAccount(double amount){
        balance = amount;
    }
    // Calculate the deposited and withdrawal amount
    public boolean deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            return true;
        }
        return false;
    }
    public boolean withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance = balance - amount;
            return true;
        }
        return false;
    }
    public double checkBalance(){
        return balance;
    }
}

class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // Taken a initial balance of user
        System.out.println("Enter your Initial balance:");
        double initialBalance = kb.nextDouble();

        System.out.println("--Welcome to the ATM--");
        System.out.println("Insert your ATM card and Make the Transation Safe!");

        BankAccount account = new BankAccount(initialBalance);

        ATM atm = new ATM(account);

        while(true){
            atm.display();
            int choice = kb.nextInt();

            // Taken the user's amount for withdrawing or depositing
            switch(choice){
                case 1:
                    System.out.println("Enter a number between 1 to 100 like '25' ");
                    int n = kb.nextInt();

                        if(n<=100 && n>=1) {
                            System.out.println("Enter amount to withdraw:");
                            double withdrawAmount = kb.nextDouble();
                            atm.withdraw(withdrawAmount);
                        }
                        else{
                            System.out.println("Please enter a number in range of 1 to 100");
                            System.out.println("---------------------------------------");
                        }
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = kb.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you! for using the ATM...");
                    kb.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
                    System.out.println("---------------------------------------");
            }
        }
    }
}

