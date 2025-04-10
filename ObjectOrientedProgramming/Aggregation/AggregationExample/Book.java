package ObjectOrientedProgramming.Aggregation.AggregationExample;

public class Book {
    private String title;
    private String author;

    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    public void displayBook(){
        System.out.println(title +" is written by "+author);
    }
}
