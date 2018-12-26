package br.com.pueyo.cdi.injection;

import javax.inject.Named;

@Named("DOIS")
public class ClasseConcretaDois implements Injetavel {

    @Override
    public String nome() {
        return this.getClass().getSimpleName();
    }

}
