package br.com.pueyo.designpattern.singleton;

import java.lang.ref.Reference;

public class Runner {

	public static void main(String[] args) {
			Reference<Singleton> instance = Singleton.getInstance();
			System.out.println(instance.get().getNome());

	}

}
