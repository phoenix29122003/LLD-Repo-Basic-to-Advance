package DesignPatterns.CreationalDesignPatterns.BuilderDesignPattern;

import java.lang.module.ModuleDescriptor.Builder;

import DesignPatterns.CreationalDesignPatterns.BuilderDesignPattern.Computer.ComputerBuilder;

public class Computer {
    private final String CPU;
    private final String RAM;
    private final String Storage;
    private final String GPU;
    private final String OS;

    private Computer(ComputerBuilder builder){
        this.CPU=builder.CPU;
        this.RAM=builder.RAM;
        this.Storage=builder.Storage;
        this.GPU=builder.GPU;
        this.OS=builder.OS;
    }

    public static class ComputerBuilder{
        private final String CPU;
        private final String RAM;
        private String Storage;
        private String GPU;
        private String OS; 

        public ComputerBuilder(String CPU,String RAM){
            this.CPU=CPU;
            this.RAM=RAM;
        }

        public ComputerBuilder storage(String storage){
            this.Storage=storage;
            return this;
        }

        public ComputerBuilder gpu(String GPU){
            this.GPU=GPU;
            return this;
        }

        public ComputerBuilder os(String OS){
            this.OS=OS;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "CPU: " + CPU + " "  + ", RAM: " + RAM + ", GPU: " + GPU + ", Storage: " + Storage + ", OS: " + OS;
    }
}
