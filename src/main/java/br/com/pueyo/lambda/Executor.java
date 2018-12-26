package br.com.pueyo.lambda;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    
    private static List<Lambda> li = new ArrayList<>();
    
    public static void add(Lambda l) {
        li.add(l);
    }
    
    public static void exec() {
        for(Lambda al: li) {
            if(al instanceof AbstractLambda)
            ((AbstractLambda) al).print();
        }
    }

}
