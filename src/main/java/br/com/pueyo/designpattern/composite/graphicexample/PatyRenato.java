package br.com.pueyo.designpattern.composite.graphicexample;

public class PatyRenato extends Graphic {

    
    @Override
    protected String getNome() {
        return this.getClass().getSimpleName();
    }
    

}
