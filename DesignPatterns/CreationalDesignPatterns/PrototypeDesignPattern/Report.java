package DesignPatterns.CreationalDesignPatterns.PrototypeDesignPattern;

public class Report implements Document{
    private String title;
    private String author;
    private String content;

    public Report(String title,String author,String content){
        this.title=title;
        this.author=author;
        this.content=content;
    }

    @Override
    public Document clone(){
        return new Report(title,author,content);
    }

    @Override
    public void print(){
        System.out.println("title: "+ title);
        System.out.println("author: "+ author);
        System.out.println("content: "+ content);
    }
}
