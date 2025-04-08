package ObjectOrientedProgramming.Encapsulation.EncapsulationWithGetterAndSetters;

public class DriverClass {
    public static void main(String args[]){
        Book myBook=new Book("Manu Biography", 100.00);

        System.out.println("Current Book Info");
        System.out.println("Book name: "+myBook.getTitle()+ " Book price: "+myBook.getPrice());

        myBook.applyDiscount(10.00);
        System.out.println("Updated Book Info");
        System.out.println("Book name: "+myBook.getTitle()+ " Updated book price: "+myBook.getPrice());
    }
}
