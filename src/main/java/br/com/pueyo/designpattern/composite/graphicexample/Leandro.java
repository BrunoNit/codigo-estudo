package br.com.pueyo.designpattern.composite.graphicexample;

public class Leandro extends Graphic {

    
    @Override
    protected String getNome() {
        return this.getClass().getSimpleName();
    }
    

}
