package br.com.pueyo.refactor.encapsulate.collection;

import java.util.List;

public class Runner {
	
	public static void main(String[] args) {
		Person p = new Person();
		
		System.out.println("");
		System.out.println("INICIANDO");
		List<String> l1 = p.getNomes();
		for(String s1: l1){
			System.out.println(s1);
		}
		
		System.out.println("");
		System.out.println("Inserindo um elemento: Bruno");
		p.addNome("Bruno");
		List<String> l2 = p.getNomes();
		for(String s1: l2){
			System.out.println(s1);
		}
		
		System.out.println("");
		System.out.println("Inserindo um elemento na lista imutável");
		List<String> l3 = p.getNomes();
		try{
			l3.add("Teste");
		}catch (Exception e) {
			System.out.println("Exceção ao inserir em uma lista imutável");
		}
		for(String s1: l3){
			System.out.println(s1);
		}
		
		
		System.out.println("");
		System.out.println("Inserindo um elemento: Teste");
		p.addNome("Teste");
		List<String> l4 = p.getNomes();
		for(String s1: l4){
			System.out.println(s1);
		}
		System.out.println("");
		System.out.println("Removendo um elemento: Bruno");
		p.removeNome("Bruno");
		for(String s1: l4){
			System.out.println(s1);
		}
	}
	
	

}
