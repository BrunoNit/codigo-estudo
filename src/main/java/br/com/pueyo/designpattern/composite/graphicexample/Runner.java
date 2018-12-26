package br.com.pueyo.designpattern.composite.graphicexample;

import java.util.Arrays;
import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Runner {

    private final static Logger logger = LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args) {



       GrupoTorcedores torcedoresBrasil = new GrupoTorcedores();

       torcedoresBrasil.addAll((Selecao s) -> {
           if(Selecao.BRASIL.equals(s)) {
               return Arrays.asList(new Jose(),new Leandro(),new Thiago(),new Renato(),new PatyRenato(),new Samanta(),new PatyThiago());
           }
           return Collections.EMPTY_LIST;
       });
       torcedoresBrasil.print();
    }

}
