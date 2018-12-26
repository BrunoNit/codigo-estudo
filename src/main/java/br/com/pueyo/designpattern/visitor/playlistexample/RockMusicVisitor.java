package br.com.pueyo.designpattern.visitor.playlistexample;

import java.util.Iterator;
import java.util.Set;

public class RockMusicVisitor extends MusicaVisitor {

	
	public void visit(Set<Musica> items) {
		Iterator<Musica> i = items.iterator();
		logarGenero(Genero.ROCK);
		while (i.hasNext()) {
			Musica musica = i.next();
			if(Genero.ROCK.equals(musica.getGenero())){
				logar(musica);
			}
			
		}
	}

}
