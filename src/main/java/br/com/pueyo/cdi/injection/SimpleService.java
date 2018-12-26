package br.com.pueyo.cdi.injection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;

public class SimpleService {
    
    @Inject
    @Named("UM")
    private Injetavel i;

    public void run() {
        System.out.println(i.nome());
    }

}
