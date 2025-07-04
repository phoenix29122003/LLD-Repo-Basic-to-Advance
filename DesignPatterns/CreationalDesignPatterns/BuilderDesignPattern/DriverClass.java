package DesignPatterns.CreationalDesignPatterns.BuilderDesignPattern;

public class DriverClass {
    public static void main(String args[]){
        Computer computer=new Computer.ComputerBuilder("Intel i7", "32GB")
                        .storage("1TB SSD")
                        .gpu("NVIDIA RTX 3080")
                        .os("Windows 11")
                        .build();
        System.out.println(computer);
    }
}
