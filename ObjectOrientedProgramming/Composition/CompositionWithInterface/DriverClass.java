package ObjectOrientedProgramming.Composition.CompositionWithInterface;

public class DriverClass {
    public static void main(String args[]){
        PaymentMethod creditCardPayment=new CreditCardPayment();
        PaymentMethod upiPaymentMethod=new UPIPayment();

        Checkout checkout1=new Checkout(creditCardPayment);
        checkout1.makePayment(100);

        Checkout checkout2=new Checkout(upiPaymentMethod);
        checkout2.makePayment(100);
    }
}
