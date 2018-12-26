package br.com.pueyo.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class PacoteAcessorios {

	List<Acessorio> acessorios;

	public void adicionaAcessorio(Acessorio acessorio) {
		if(acessorios == null){
			acessorios = new ArrayList<Acessorio>();
		}
		acessorios.add(acessorio);
	}
	
	public List<Acessorio> getListaAcessorios(){
		return this.acessorios;
	}
	
	
}
