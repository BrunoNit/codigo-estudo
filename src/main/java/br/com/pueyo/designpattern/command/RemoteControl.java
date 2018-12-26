package br.com.pueyo.designpattern.command;

import br.com.pueyo.designpattern.command.pojo.Command;

public class RemoteControl{

	  private Command command;

	  public void setCommand(Command command){
	    this.command = command;
	  }

	  public void pressButton(){
	    command.execute();
	  }

	}
