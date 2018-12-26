package br.com.pueyo.designpattern.abstractfactory;

import br.com.pueyo.designpattern.abstractfactory.pojo.Animal;
import br.com.pueyo.designpattern.abstractfactory.pojo.Color;

public class Runner {

	public static void main(String[] args) {
		
		Animal a = FactoryProvider.getFactory("Animal").getAnimal("Dog");
		System.out.println(a.getAnimal() + ": " + a.makeSound());
		
		Animal b = FactoryProvider.getFactory("Animal").getAnimal("Duck");
		System.out.println(b.getAnimal() + ": " + b.makeSound());
		
		Color c = FactoryProvider.getFactory("Color").getColor("Azul");
		System.out.println(c.getColor());
		
		Color d = FactoryProvider.getFactory("Color").getColor("Rosa");
		System.out.println(d.getColor());
		
	}
	
}
