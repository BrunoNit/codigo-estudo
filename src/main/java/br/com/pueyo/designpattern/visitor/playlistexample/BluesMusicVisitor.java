package br.com.pueyo.designpattern.visitor.playlistexample;

import java.util.Iterator;
import java.util.Set;

public class BluesMusicVisitor extends MusicaVisitor {

	
	public void visit(Set<Musica> items) {
		Iterator<Musica> i = items.iterator();
		logarGenero(Genero.BLUES);
		while (i.hasNext()) {
			Musica musica = i.next();
			if(Genero.BLUES.equals(musica.getGenero())){
				logar(musica);
			}
			
		}
	}

}
