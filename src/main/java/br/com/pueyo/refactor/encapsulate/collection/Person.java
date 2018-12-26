package br.com.pueyo.refactor.encapsulate.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

	private List<String> lista = new ArrayList<String>();
	
	List<String> getNomes(){
		return Collections.unmodifiableList(this.lista);
	}
	
	public void addNome(String nome){
		this.lista.add(nome);
	}
	
	public void removeNome(String nome){
		this.lista.remove(nome);
	}
	
}
