package br.com.pueyo.designpattern.builder;

import br.com.pueyo.designpattern.builder.enums.TipoCombustivel;

public class MotorBuilderProduct implements TurboCompressorAware, BuilderProduct<Motor>{
	
	private Motor motor = new Motor();
	
	
	
	public void setTurboCompressor(TurboCompressor turboCompressor) {
		this.motor.setTurboCompressor(turboCompressor);
		
	}
	
	public void setCilindrada(Double cilindrada){
		this.motor.setCilindrada(cilindrada);
	}
	
	public void setCilindros(int cilindros){
		this.motor.setCilindros(cilindros);
	}
	public void setCombustivel(TipoCombustivel combustivel){
		this.motor.setCombustivel(combustivel);
	}

	public Motor getProduct() {
		return this.motor;
	}

}
