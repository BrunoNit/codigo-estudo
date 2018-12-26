package br.com.pueyo.designpattern.abstractfactory.pojo.impl;

import br.com.pueyo.designpattern.abstractfactory.pojo.Animal;

public class Duck implements Animal {

	
	public String getAnimal() {
		return "Duck";
	}

	
	public String makeSound() {
		return "Squeks";
	}

}
