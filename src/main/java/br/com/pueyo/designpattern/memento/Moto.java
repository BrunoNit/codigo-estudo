package br.com.pueyo.designpattern.memento;

public class Moto extends Clonavel{
	
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Moto m = new Moto();
		m.setId(this.id);
		return m;
	}

	@Override
	public String toString() {
		return String.format("Sou a moto com id: %s ", this.id);
	}
	
	
	
	

}
