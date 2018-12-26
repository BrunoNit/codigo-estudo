package br.com.pueyo.designpattern.visitor.playlistexample;

import java.util.Iterator;
import java.util.Set;

public class ClassicoMusicVisitor extends MusicaVisitor {

	
	public void visit(Set<Musica> items) {
		Iterator<Musica> i = items.iterator();
		logarGenero(Genero.CLASSICO);
		while (i.hasNext()) {
			Musica musica = i.next();
			if(Genero.CLASSICO.equals(musica.getGenero())){
				logar(musica);
			}
			
		}
	}

}
