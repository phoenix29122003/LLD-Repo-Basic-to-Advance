package ObjectOrientedProgramming.Composition.CompositionWithInterface;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println(amount + " payed by credit card");
    }
}
