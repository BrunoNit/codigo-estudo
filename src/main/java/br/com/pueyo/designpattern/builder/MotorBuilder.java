package br.com.pueyo.designpattern.builder;

import br.com.pueyo.designpattern.builder.enums.TipoCombustivel;

public class MotorBuilder <P extends Builder<?, ?>> extends AbstractBuilder<Motor, P> {
	
	

	private MotorBuilderProduct motor = new MotorBuilderProduct();
	
	private MotorAware motorAware;
	
	private TurboCompressorBuilder<MotorBuilder<VeiculoBuilder>> turboBuilder;
	
	public MotorBuilder(MotorAware motorAware, P builderPrevio) {
		super(builderPrevio);
		this.motorAware = motorAware;
		this.turboBuilder = new TurboCompressorBuilder(motor, this);
	}
	
	
	public MotorBuilder<P> comTipoDeCombustivel(TipoCombustivel tipo){
		this.motor.setCombustivel(tipo);
		return this;
	}
	
	public MotorBuilder<P> comCilindrada(Double cilindrada){
		this.motor.setCilindrada(cilindrada);
		return this;
	}
	
	public MotorBuilder<P> comNumeroDeCilindros(int cilindros){
		this.motor.setCilindros(cilindros);
		return this;
	}
	
	public Motor build() {
		return this.motor.getProduct();
	}
	
	public TurboCompressorBuilder<MotorBuilder<VeiculoBuilder>> inserirTurboCompressor(){
		return this.turboBuilder;
	}

	@Override
	protected void prepareForEnd() {
		this.motorAware.setMotorVeiculo(this.motor.getProduct());
		
	}

}
