package ObjectOrientedProgramming.Encapsulation.EncapsulationWithGetterAndSetters;

public class Book {
    private String title;
    private Double price;

    public Book(String title,Double price){
        this.title=title;
        this.price=price;
    }

    public String getTitle(){
        return title;
    }

    public Double getPrice(){
        return price;
    }

    public void applyDiscount(Double discount){
        this.price = this.price - this.price * discount / 100;
    }
}
