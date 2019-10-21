package com.spartaglobal.collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExamplesList {
    private List<String> hobbies = new ArrayList<String>();

    public ExamplesList() {
        workingWithOurList();
    }
    public void workingWithOurList(){
        hobbies.add("travelling");
        hobbies.add("coding");
        hobbies.add("watching movies");

    }
    public void printList(){
        System.out.println("were using the iterator...");
        for (Iterator<String> iterator = hobbies.iterator(); iterator.hasNext();){
            String element = iterator.next();
            System.out.println(element);

        }
    }

}
