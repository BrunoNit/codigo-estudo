package br.com.pueyo.designpattern.abstractfactory.pojo.impl;

import br.com.pueyo.designpattern.abstractfactory.pojo.Animal;

public class Dog implements Animal {

	
	public String getAnimal() {
		return "Dog";
	}

	
	public String makeSound() {
		return "Au Au";
	}

}
