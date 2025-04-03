package ObjectOrientedProgramming.Polymorphism.PolymorphismMethodOverridingExample;

public class UPIPaymentMethod implements TransactionInterface{
    @Override
    public void processPayment(){
        System.out.println("Payment processing via upi method.");
    }
}
