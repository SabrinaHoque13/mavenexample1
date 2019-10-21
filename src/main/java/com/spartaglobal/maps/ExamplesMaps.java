package com.spartaglobal.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ExamplesMaps {
    private Map<Integer, String> studentsInClass = new HashMap<>();
     public ExamplesMaps(){
         studentsInClass.put(1, "Sabrina");
         studentsInClass.put(2, "Nik");
         studentsInClass.put(3, "Fab");

     }

     public String returnValue(int Keynum){
         return studentsInClass.get(Keynum);
     }
     public void loopThroughMap(){
         Collection<String> values = studentsInClass.values();

         for (String data: values){
             System.out.println(data);
         }
         studentsInClass.keySet();
     }
}
