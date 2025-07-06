package DesignPatterns.CreationalDesignPatterns.PrototypeDesignPattern;

import java.rmi.registry.Registry;

public class DriverClass {
    public static void main(String args[]){
        Document resume=new Resume("Manu", "Biet", "Ghanta");
        Document report=new Report("Manu expenditure", "Manu", "Manu is broke this month");
        Document invoice=new Invoice("Manu","1 lakh","Now");

        DocumentRegistry documentRegistry=new DocumentRegistry();

        documentRegistry.registerPrototype("resume",resume);
        documentRegistry.registerPrototype("report",report);
        documentRegistry.registerPrototype("invoice",invoice);

        Document resumeClone=documentRegistry.getClonedDocument("resume");
        Document reportClone=documentRegistry.getClonedDocument("report");
        Document invoiceClone=documentRegistry.getClonedDocument("invoice");
        
        resume.print();
        resumeClone.print();

        report.print();
        reportClone.print();

        invoice.print();
        invoiceClone.print();
    }
}
