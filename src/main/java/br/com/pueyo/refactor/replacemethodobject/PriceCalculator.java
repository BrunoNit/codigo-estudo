package br.com.pueyo.refactor.replacemethodobject;

public class PriceCalculator {
	
	
	
	private double add = 2;
	private double add2 =3;
	private double add3 = 3;
	private Order order = null;
	
	public PriceCalculator(Order order) {
		this.order  = order;
	}
	
	public double compute(){
		return this.order.price() + add + add2 + add3;
	}

}
