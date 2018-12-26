package br.com.pueyo.designpattern.composite.graphicexample;

public class Renato  extends Graphic {

    
    @Override
    protected String getNome() {
        return this.getClass().getSimpleName();
    }
    

}
