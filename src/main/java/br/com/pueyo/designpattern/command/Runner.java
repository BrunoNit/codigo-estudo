package br.com.pueyo.designpattern.command;

import br.com.pueyo.designpattern.command.pojo.Command;
import br.com.pueyo.designpattern.command.pojo.impl.Light;
import br.com.pueyo.designpattern.command.pojo.impl.LightOffCommand;
import br.com.pueyo.designpattern.command.pojo.impl.LightOnCommand;

public class Runner {

	public static void main(String[] args) {
	    RemoteControl control = new RemoteControl();

	    Light light = new Light();

	    Command lightsOn = new LightOnCommand(light);

	    Command lightsOff = new LightOffCommand(light);

	    //switch on
	    System.out.println("Before turn the Light ON");
	    light.logaStatus();
	    control.setCommand(lightsOn);
	    control.pressButton();
	    System.out.println("After turn the Light ON");
	    light.logaStatus();
	    
	    //switch off
	    System.out.println("Before turn the Light OFF");
	    light.logaStatus();
	    control.setCommand(lightsOff);
	    control.pressButton();
	    System.out.println("After turn the Light ON");
	    light.logaStatus();

	}

}
