package br.com.pueyo.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerPart {
	
	
	List<ComputerPart> parts = new ArrayList<ComputerPart>();
	
	public Computer() {
		parts.add(new Mouse());
		parts.add(new Monitor());
		parts.add(new Keyboard());
	}

	public void accept(ComputerPartVisitor computerPartVisitor) {
		for(ComputerPart c: parts){
			c.accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}

}
