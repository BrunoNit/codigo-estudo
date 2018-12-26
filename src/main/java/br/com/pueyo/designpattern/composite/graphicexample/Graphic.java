package br.com.pueyo.designpattern.composite.graphicexample;

public abstract class Graphic {
    
    public void printPai() {
        System.out.println(String.format("%s ama e torce pela Bélgica", getNome()));
        
    }

    protected abstract String getNome();
    

}
