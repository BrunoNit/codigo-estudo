package br.com.pueyo.designpattern.decorator;

public class Runner {

	public static void main(String[] args) {
		
		Shape circle =  new Circle();
		circle.draw();
		
		Shape circuloVermelho = new RedShapeDecorator(circle);
		circuloVermelho.draw();
		
		Shape rect =  new Rectangle();
		rect.draw();
		
		Shape rectVermelho = new RedShapeDecorator(rect);
		rectVermelho.draw();
		

	}

}
