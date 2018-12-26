package br.com.pueyo.designpattern.composite.graphicexample;

import java.util.ArrayList;
import java.util.List;

public class GrupoTorcedores  extends Graphic {

    private List<Graphic> childGraphics = new ArrayList<Graphic>();
    
    @Override
    protected String getNome() {
        return this.getClass().getSimpleName();
    }
    
    //Prints the graphic.
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.printPai();
        }
    }
   //Adds the graphic to the composition.
   public void addAll(Torcedores lista) {
       childGraphics = lista.getListaTorcedores(Selecao.BRASIL);
   }

}
