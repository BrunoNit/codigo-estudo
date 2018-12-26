package br.com.pueyo.exception;

import java.text.NumberFormat;

public class Runner {

    public static void main(String[] args) {
        
        try {
            System.out.println("teste");
        }catch (FromRuntimeException e) {
            System.out.println(e);
        }
        
        
    }
    
}
