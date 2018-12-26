package br.com.pueyo.designpattern.singleton;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class Singleton {

	private String nome;
	
	private Singleton(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	private static class SingletonHolder{
		public static  final Reference<Singleton> instance = new WeakReference<Singleton>(new Singleton("Sou a classe Singleton")) ;
	}
	
	public static Reference<Singleton>  getInstance(){
		return SingletonHolder.instance;
	}
}
