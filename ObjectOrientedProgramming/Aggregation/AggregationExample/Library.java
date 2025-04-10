package ObjectOrientedProgramming.Aggregation.AggregationExample;

import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<Book>books;

    public Library(String libraryName){
        this.libraryName=libraryName;
        this.books=new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void showBook(){
        System.out.println(libraryName +" has below books: ");
        for(Book book:books){
            book.displayBook();
        }
    }
}
