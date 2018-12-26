package br.com.pueyo.designpattern.abstractfactory;

import br.com.pueyo.designpattern.abstractfactory.pojo.Animal;
import br.com.pueyo.designpattern.abstractfactory.pojo.Color;
import br.com.pueyo.designpattern.abstractfactory.pojo.impl.Azul;
import br.com.pueyo.designpattern.abstractfactory.pojo.impl.Rosa;

public class ColorFactory implements AbstractFactory {

	public Animal getAnimal(String animalType) {
		throw new UnsupportedOperationException();
	}

	public Color getColor(String colorType) {
		if("Azul".equalsIgnoreCase(colorType)){
			return new Azul();
		}
		if("Rosa".equalsIgnoreCase(colorType)){
			return new Rosa();
		}
		return null;
	}

}
