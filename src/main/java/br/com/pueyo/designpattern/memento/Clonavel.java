package br.com.pueyo.designpattern.memento;

public abstract class Clonavel<T> implements Cloneable {

	@Override
	protected abstract Object clone() throws CloneNotSupportedException;
		

	
	
}
