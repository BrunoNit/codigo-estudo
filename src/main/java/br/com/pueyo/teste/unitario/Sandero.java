package br.com.pueyo.teste.unitario;

import java.util.ArrayList;
import java.util.List;

public class Sandero implements Carro{

	//List<Item> itens = new ArrayList<Item>();
	List<Item> itens = null;
	
	public void insereItens(Item item) {
		itens.add(item);
	}

	public String getMarca() {
		return "Renault";
	}

	public String getModelo() {
		return "Sandero RS";
	}

	public boolean possuiABS() {
		for(Item i: itens){
			if(i instanceof Abs){
				return true;
			}
		}
		return false;
	}

	
}
