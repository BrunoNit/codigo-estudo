package br.com.pueyo.designpattern.composite.graphicexample;

public class Samanta  extends Graphic {

    
    @Override
    protected String getNome() {
        return this.getClass().getSimpleName();
    }
    

}