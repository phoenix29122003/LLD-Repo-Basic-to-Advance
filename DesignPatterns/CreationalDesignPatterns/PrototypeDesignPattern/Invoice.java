package DesignPatterns.CreationalDesignPatterns.PrototypeDesignPattern;

public class Invoice implements Document{
    private String clientName;
    private String amount;
    private String dueDate;

    public Invoice(String clinetName,String amount,String dueDate){
        this.clientName=clientName;
        this.amount=amount;
        this.dueDate=dueDate;
    }

    @Override
    public Document clone(){
        return new Invoice(clientName,amount,dueDate);
    }

    @Override
    public void print(){
        System.out.println("clientName: "+ clientName);
        System.out.println("amount: "+ amount);
        System.out.println("dueDate: "+ dueDate);
    }
}
