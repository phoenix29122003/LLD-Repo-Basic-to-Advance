package ObjectOrientedProgramming.InterfaceFolder.InterfaceRealLifeExample;

public class NetBankingMethod implements TransactionInterface{
    @Override
    public void processPayment(){
        System.out.println("Payment processing via net banking.");
    }
}
