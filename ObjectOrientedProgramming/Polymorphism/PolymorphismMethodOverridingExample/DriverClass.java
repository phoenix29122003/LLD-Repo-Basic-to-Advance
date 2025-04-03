package ObjectOrientedProgramming.Polymorphism.PolymorphismMethodOverridingExample;

public class DriverClass {
    public static void main(String args[]){
        NetBankingMethod netBanking=new NetBankingMethod();
        UPIPaymentMethod upiPayment=new UPIPaymentMethod();

        netBanking.processPayment();
        upiPayment.processPayment();
    }
}
