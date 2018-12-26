package br.com.pueyo.cdi.injection;

import javax.inject.Named;


@Named("TRES")
public class ClasseConcretaTres implements Injetavel {

    @Override
    public String nome() {
        return this.getClass().getSimpleName();
    }

}
