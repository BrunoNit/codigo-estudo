package br.com.pueyo.designpattern.command.pojo.impl;

public class Light{

	  private boolean on;

	  public void switchOn(){

	    on = true;

	  }

	  public void switchOff(){

	    on = false;

	  }
	  
	  public void logaStatus(){
		  System.out.println("Light is ON? " + this.on);
	  }

	}
