package DesignPatterns.CreationalDesignPatterns.PrototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry {
    private final Map<String,Document> registry=new HashMap<>();
    
    public void registerPrototype(String type,Document document){
        registry.put(type, document);
    }

    public Document getClonedDocument(String type){
        Document document=registry.get(type);
        if(document!=null){
            return document.clone();
        }
        throw new IllegalArgumentException("No prototype found for type: " + type);
    }
}
