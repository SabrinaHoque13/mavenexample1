package com.spartaglobal.collectionexamples;

import java.util.HashSet;
import java.util.Set;

public class ExamplesSets {
    private Set<String> newSet = new HashSet<String>();

    public void workingWithourSet(){
        newSet.add("cheese");
        newSet.add("Cola");
        newSet.add("rice");

    }
    public void printSet(){
        System.out.println(newSet.contains("rice"));
    for (String shoppingItem: newSet){
        System.out.println(shoppingItem);
    }
    }
}
