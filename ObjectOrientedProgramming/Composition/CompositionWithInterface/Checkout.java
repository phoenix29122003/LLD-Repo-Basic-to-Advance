package ObjectOrientedProgramming.Composition.CompositionWithInterface;

public class Checkout {
    private PaymentMethod paymentMethod;

    public Checkout(PaymentMethod paymentMethod){
        this.paymentMethod=paymentMethod;
    }

    public void makePayment(double amount){
        paymentMethod.pay(amount);
    }
}
