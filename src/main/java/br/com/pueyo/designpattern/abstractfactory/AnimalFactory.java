package br.com.pueyo.designpattern.abstractfactory;

import br.com.pueyo.designpattern.abstractfactory.pojo.Animal;
import br.com.pueyo.designpattern.abstractfactory.pojo.Color;
import br.com.pueyo.designpattern.abstractfactory.pojo.impl.Dog;
import br.com.pueyo.designpattern.abstractfactory.pojo.impl.Duck;

public class AnimalFactory implements AbstractFactory {

	public Animal getAnimal(String animalType) {
		if("Dog".equalsIgnoreCase(animalType)){
			return new Dog();
		}
		if("Duck".equalsIgnoreCase(animalType)){
			return new Duck();
		}
		return null;
	}

	public Color getColor(String colorType) {
		throw new UnsupportedOperationException();
	}

}
