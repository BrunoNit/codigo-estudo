package br.com.pueyo.designpattern.memento;

public class Originator<T extends Clonavel> {

	private T o;

	public void setState(T entrada) {
		this.o = entrada;
	}

	public T getState() {
		return this.o;
	}

	public Memento saveStateToMemento() throws CloneNotSupportedException {
		return new Memento(this.o);
	}

	public void getStateFromMemento(Memento memento) {
		o = (T) memento.getState();
	}

}
