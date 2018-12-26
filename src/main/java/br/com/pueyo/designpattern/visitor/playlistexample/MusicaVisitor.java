package br.com.pueyo.designpattern.visitor.playlistexample;

import java.util.logging.Logger;

public abstract class MusicaVisitor implements Visitor<Musica> {
	
	public static final Logger log = Logger.getLogger(MusicaVisitor.class.getName());
	
	protected void logarGenero(Genero genero){
		System.out.println("");
		System.out.println(String.format("Tocando suas musicas do estilo: %s", genero.name()));
	}
	protected void logar(Musica musica){
		System.out.println(String.format("%s (%s) - %s", musica.getNome(), musica.getArtista(), musica.getGenero().name()));
	}

}
