package br.com.pueyo.designpattern.memento;

public class Carro extends Clonavel{
	
	private Integer kilometragem = 0;
	
	

	public int getKilometragem() {
		return kilometragem;
	}
	
	public void rodar(Integer km){
		this.kilometragem = this.kilometragem + km;
	}
	
	@Override
	public String toString() {
		
		return String.format("Kilometragem: %s", this.getKilometragem());
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Carro newCarro = new Carro();
		newCarro.kilometragem = this.kilometragem;
		return newCarro;
	}
	
	

}
