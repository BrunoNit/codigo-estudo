package br.com.pueyo.designpattern.visitor;

public class Runner {

	 public static void main(String[] args) {
	      ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	   }
}
