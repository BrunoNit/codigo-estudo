package br.com.pueyo.designpattern.visitor.playlistexample;

public class Musica {
	
	private String artista;
	private String nome;
	private Genero genero;
	
	public Musica(String artista, String nome, Genero genero) {
		this.artista = artista;
		this.nome = nome;
		this.genero = genero;
	}
	
	public String getArtista() {
		return artista;
	}
	public String getNome() {
		return nome;
	}

	public Genero getGenero() {
		return this.genero;
	}

	
}
