package br.com.pueyo.designpattern.factorymethod;

import br.com.pueyo.designpattern.factorymethod.factory.FabricaPoligono;

public class Runner {
	
	public static void main(String[] args) {
		Poligono p = new FabricaPoligono().getPoligono(3);
		System.out.println("3 lados: " +  p.getTipo());
		
		p = new FabricaPoligono().getPoligono(4);
		System.out.println("4 lados: " +  p.getTipo());
		
		p = new FabricaPoligono().getPoligono(5);
		System.out.println("5 lados: " +  p.getTipo());
	}
	

}
