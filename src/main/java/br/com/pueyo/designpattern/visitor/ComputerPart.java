package br.com.pueyo.designpattern.visitor;

public interface ComputerPart {
	 public void accept(ComputerPartVisitor computerPartVisitor);
}
