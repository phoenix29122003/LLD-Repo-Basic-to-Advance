package ObjectOrientedProgramming.ClassesAndObjects;

public class BankAccountClass {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccountClass(String accountNumber, String accountHolder, double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public void withdraw(double ammount){
        this.balance-=ammount;
        System.out.println(ammount+ " is withdraw from "+accountNumber);
    }

    public void deposit(double ammount){
        this.balance+=ammount;
        System.out.println(ammount+ " is credited to "+accountNumber);
    }

    public void displayBalance(){
        System.out.println("Current balance: "+balance);
    }
}
