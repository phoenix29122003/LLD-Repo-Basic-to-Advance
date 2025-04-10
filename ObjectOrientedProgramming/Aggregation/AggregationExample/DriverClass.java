package ObjectOrientedProgramming.Aggregation.AggregationExample;

public class DriverClass {
    public static void main(String args[]){
    Book book1=new Book("Alice's Adventures in Wonderland", "Lewis Carroll");
    Book book2=new Book("The Adventures of Tom Sawyer","Mark Twain");

    Library library=new Library("Manu Library");
    library.addBook(book1);
    library.addBook(book2);

    library.showBook();
}
}
