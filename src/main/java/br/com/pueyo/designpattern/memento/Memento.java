package br.com.pueyo.designpattern.memento;

public class Memento<T extends Clonavel> {
	
	private T o;
	
	
	public Memento(T entrada) throws CloneNotSupportedException {
		this.o = (T) entrada.clone();
	}
	
	public T getState(){
		return this.o;
	}

}
