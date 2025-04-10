package ObjectOrientedProgramming.Composition.CompositionWithInterface;

public class UPIPayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println(amount+" is payed by UPI.");
    }
}
