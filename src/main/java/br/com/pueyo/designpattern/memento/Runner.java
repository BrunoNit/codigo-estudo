package br.com.pueyo.designpattern.memento;

import java.util.List;

public class Runner {

	public static void main(String[] args) throws CloneNotSupportedException {
		   
	      Originator originator = new Originator();
	      
	      CareTaker careTaker = new CareTaker();
	      
	      Carro c = new Carro();
	      c.rodar(10);
	      originator.setState(c);
	      
	      careTaker.add(originator.saveStateToMemento());
	      
	      c.rodar(20);
	      originator.setState(c);
	      careTaker.add(originator.saveStateToMemento());
	      
	      c.rodar(40);
	      originator.setState(c);
	      careTaker.add(originator.saveStateToMemento());
	      
	      c.rodar(50);
	      originator.setState(c);
	      
	      
	      
	      Moto moto = new Moto();
	      moto.setId(10);
	      originator.setState(moto);
	      careTaker.add(originator.saveStateToMemento());
	      
	      moto.setId(5);
	      originator.setState(moto);
	      careTaker.add(originator.saveStateToMemento());
	      
	      
	      List<Memento> lista = careTaker.getMementoList();
	      
	      for(Memento m: lista){
	    	System.out.println(m.getState());  
	      }
	      
	   }
}
