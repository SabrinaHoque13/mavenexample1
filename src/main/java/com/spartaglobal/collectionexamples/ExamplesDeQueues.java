package com.spartaglobal.collectionexamples;

import java.util.Deque;
import java.util.LinkedList;

public class ExamplesDeQueues {
    private Deque<String> CarPark = new LinkedList<>();

    public ExamplesDeQueues() {
        CarPark.add("Car1");
        CarPark.add("Car2");
        CarPark.add("Car3");

    }

    public void workingwithourDequeue() {
        for (String car : CarPark) {
            System.out.println(car);

        }
            System.out.println(CarPark.peekLast());
        }
    }

