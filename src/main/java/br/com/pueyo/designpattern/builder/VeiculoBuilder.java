package br.com.pueyo.designpattern.builder;

import br.com.pueyo.designpattern.builder.enums.TipoVeiculo;

public class VeiculoBuilder implements RootBuilder<Veiculo> {
	
	VeiculoBuilderProduct veiculo = new VeiculoBuilderProduct(new Veiculo());
	
	MotorBuilder<VeiculoBuilder> motorBuilder = new MotorBuilder<VeiculoBuilder>(veiculo, this);
	RodaBuilder<VeiculoBuilder> rodaBuilder = new RodaBuilder<VeiculoBuilder>(this.veiculo, this);
	PacoteAcessoriosBuilder<VeiculoBuilder> pacoteAcessoriosBuilder = new PacoteAcessoriosBuilder<VeiculoBuilder>(this.veiculo, this);
	
	
	public VeiculoBuilder start() {
		this.veiculo = new VeiculoBuilderProduct(new Veiculo());
		this.motorBuilder = new MotorBuilder<VeiculoBuilder>(this.veiculo, this);
		this.rodaBuilder = new RodaBuilder<VeiculoBuilder>(this.veiculo, this);
		this.pacoteAcessoriosBuilder = new PacoteAcessoriosBuilder<VeiculoBuilder>(this.veiculo, this);
		return this;
	}
	
	public MotorBuilder<VeiculoBuilder> criarMotor(){
		return this.motorBuilder;
	}
	
	public RodaBuilder<VeiculoBuilder> criarRoda(){
		return this.rodaBuilder;
	}
	public VeiculoBuilder daMarca(String marca){
		this.veiculo.setMarca(marca);
		return this;
	}
	
	public PacoteAcessoriosBuilder<VeiculoBuilder> comPacoteDeAcessorios(){
		return this.pacoteAcessoriosBuilder;
	}

	public VeiculoBuilder modelo(String modelo){
		this.veiculo.setModelo(modelo);
		return this;
	}

	public VeiculoBuilder doTipo(TipoVeiculo tipo){
		this.veiculo.setTipoVeiculo(tipo);
		return this;
	}
	
	public Veiculo build() {
		return this.veiculo.getProduct();
	}

	public RootBuilder<Veiculo> end() {
		return this;
	}

}
