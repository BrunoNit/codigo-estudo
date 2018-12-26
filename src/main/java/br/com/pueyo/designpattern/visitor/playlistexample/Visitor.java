package br.com.pueyo.designpattern.visitor.playlistexample;

import java.util.Set;

public interface Visitor<T> {
	void visit(Set<T> items);
}
