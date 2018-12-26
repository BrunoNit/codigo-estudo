package br.com.pueyo.teste.unitario;

public interface Carro {
	void insereItens(Item item);
	String getMarca();
	String getModelo();
	boolean possuiABS();
}
