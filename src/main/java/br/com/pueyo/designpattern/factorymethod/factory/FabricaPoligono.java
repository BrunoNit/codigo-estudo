package br.com.pueyo.designpattern.factorymethod.factory;

import br.com.pueyo.designpattern.factorymethod.Poligono;
import br.com.pueyo.designpattern.factorymethod.impl.Pentagono;
import br.com.pueyo.designpattern.factorymethod.impl.Quadrado;
import br.com.pueyo.designpattern.factorymethod.impl.Triangulo;

public class FabricaPoligono {
	
	public Poligono getPoligono(int lados){
		if(lados == 3){
			return new Triangulo();
		}
		if(lados == 4){
			return new Quadrado();
		}
		if(lados == 5){
			return new Pentagono();
		}
		return null;
	}

}
