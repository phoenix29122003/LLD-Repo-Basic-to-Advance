package ObjectOrientedProgramming.ClassesAndObjects;

public class DriverClass {
    public static void main(String[] args){
        BankAccountClass account=new BankAccountClass("123456789", "Manu", 100.00);
        account.deposit(100.00);
        account.displayBalance();
        account.withdraw(100.00);
        account.displayBalance();
    }
}
