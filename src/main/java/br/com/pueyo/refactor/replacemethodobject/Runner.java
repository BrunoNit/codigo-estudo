package br.com.pueyo.refactor.replacemethodobject;

public class Runner {

	public static void main(String[] args) {
		Order o = new Order(2.5d);
		
		System.out.println(new PriceCalculator(o).compute());
	}
}
