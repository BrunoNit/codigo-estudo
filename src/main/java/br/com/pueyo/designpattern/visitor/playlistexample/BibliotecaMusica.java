package br.com.pueyo.designpattern.visitor.playlistexample;

import java.util.HashSet;
import java.util.Set;

public class BibliotecaMusica {
	
	private Set<Musica> listas = new HashSet<Musica>();

	public BibliotecaMusica() {
		listas.add(new Musica("Hellhound On My Trail", "Robert Johnson", Genero.BLUES));
		listas.add(new Musica("Mannish Boy", "Muddy Waters", Genero.BLUES));
		listas.add(new Musica("How Many More Years", "Howlin’ Wolf", Genero.BLUES));

		
		listas.add(new Musica("Unholy", "Kiss", Genero.ROCK));
		listas.add(new Musica("Fear of The Dark", "Iron Maiden", Genero.ROCK));
		listas.add(new Musica("Paranoid", "Black Sabbath", Genero.ROCK));
		listas.add(new Musica("Holy Wars", "Megadeath", Genero.ROCK));
		
		
		listas.add(new Musica("7a Sifonia", "Beethoven", Genero.CLASSICO));
		listas.add(new Musica("Corlioan Overture", "Beethoven", Genero.CLASSICO));

	}
	
	public void accept(MusicaVisitor visitor){
		visitor.visit(this.listas);
	}
}
