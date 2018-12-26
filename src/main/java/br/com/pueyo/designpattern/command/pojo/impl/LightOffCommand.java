package br.com.pueyo.designpattern.command.pojo.impl;

import br.com.pueyo.designpattern.command.pojo.Command;

public class LightOffCommand implements Command{

	  //reference to the light

	  Light light;

	  public LightOffCommand(Light light){

	    this.light = light;

	  }

	  public void execute(){

	    light.switchOff();

	  }

	}
