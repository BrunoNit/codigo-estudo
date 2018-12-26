package br.com.pueyo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {
        List<String> asList = Arrays.asList("Bruno","Livia","Matheus","Henrique","Julia","Celso","Fatima","Patricia","Bruno", "Fatima");
        
        
        
        //Intermediate Operations
       System.out.println(asList.stream().peek(s -> System.out.println(s + ":" +s.length()))
               .distinct().map(String::toString).collect(Collectors.joining("|")));

    }

}
