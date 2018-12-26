package br.com.pueyo.optional;

import java.util.Optional;
import java.util.UUID;

public class Runner {
    
    
    public static String geraRamdom() {
        return UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        Optional<String> a = Optional.empty();
        System.out.println(a.orElseGet(() -> "ELSE"));

        Optional<String> b = Optional.of("VALUE");
        System.out.println(b.orElseGet(() -> "ELSE"));
        b.ifPresent(valor -> System.out.println(valor));
        
        
        Optional<String> c = Optional.empty();
        System.out.println(c.orElseGet(() -> Runner.geraRamdom()));
        
        
        
        
        
        
                
    }

}
