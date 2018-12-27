package br.com.pueyo.java8.date;

import java.time.LocalDate;

public class Runner {

    public static void main(String[] args) {
        LocalDate build = DateUtils.now().adicionaDias(2).build();
        
        System.out.println(build.toString());
       

    }

}
