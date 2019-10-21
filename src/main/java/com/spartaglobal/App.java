package com.spartaglobal;

import com.spartaglobal.collectionexamples.ExamplesDeQueues;
import com.spartaglobal.collectionexamples.ExamplesList;
import com.spartaglobal.collectionexamples.ExamplesQueues;
import com.spartaglobal.collectionexamples.ExamplesSets;
import com.spartaglobal.maps.ExamplesMaps;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
//        ExamplesSets examplesSets = new ExamplesSets();
//        examplesSets.workingWithourSet();
//        examplesSets.printSet();

//
//        ExamplesDeQueues examplesDeQueues = new ExamplesDeQueues();
//        examplesDeQueues.workingwithourDequeue();
        ExamplesMaps examplesMaps = new ExamplesMaps();
        System.out.println(examplesMaps.returnValue(2));
        examplesMaps.loopThroughMap();
    }

}


