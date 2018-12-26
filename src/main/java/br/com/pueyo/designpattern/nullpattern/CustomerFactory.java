package br.com.pueyo.designpattern.nullpattern;

import br.com.pueyo.designpattern.nullpattern.pojo.AbstractCustomer;
import br.com.pueyo.designpattern.nullpattern.pojo.impl.NullCustomer;
import br.com.pueyo.designpattern.nullpattern.pojo.impl.RealCustomer;

public class CustomerFactory {
	
	   protected static final String[] names = {"Rob", "Joe", "Julie"};

	   public static AbstractCustomer getCustomer(String name){
	   
	      for (int i = 0; i < names.length; i++) {
	         if (names[i].equalsIgnoreCase(name)){
	            return new RealCustomer(name);
	         }
	      }
	      return new NullCustomer();
	   }
	}
