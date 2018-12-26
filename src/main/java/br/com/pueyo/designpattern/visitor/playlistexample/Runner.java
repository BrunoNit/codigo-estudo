package br.com.pueyo.designpattern.visitor.playlistexample;

public class Runner {

	
	public static void main(String[] args) {
		BibliotecaMusica b =  new BibliotecaMusica();
		
		b.accept(new RockMusicVisitor());
		b.accept(new BluesMusicVisitor());
		b.accept(new ClassicoMusicVisitor());
		
		
	}
}
