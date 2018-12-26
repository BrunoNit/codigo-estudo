package br.com.pueyo.cdi.injection;

import javax.inject.Named;

@Named("UM")
public class ClasseConcretaUm implements Injetavel {

    @Override
    public String nome() {
        return this.getClass().getSimpleName();
    }

}
