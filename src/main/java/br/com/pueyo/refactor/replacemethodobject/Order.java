package br.com.pueyo.refactor.replacemethodobject;

public class Order {
	
	
	
	private double price;
	
	public Order(double valor) {
		this.price = valor;	
	}
	
	public double price(){
		return this.price;
	}

}
