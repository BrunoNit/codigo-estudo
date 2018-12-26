package br.com.pueyo.designpattern.abstractfactory;

import br.com.pueyo.designpattern.abstractfactory.pojo.Animal;
import br.com.pueyo.designpattern.abstractfactory.pojo.Color;

public interface AbstractFactory {
	Animal getAnimal(String animalType);
    Color getColor(String colorType);
}
