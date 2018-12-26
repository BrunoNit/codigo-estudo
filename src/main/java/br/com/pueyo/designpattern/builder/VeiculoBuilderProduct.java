package br.com.pueyo.designpattern.builder;

import br.com.pueyo.designpattern.builder.enums.TipoVeiculo;

public class VeiculoBuilderProduct 
	implements TipoVeiculoAware,
	MotorAware,
	RodaAware,
	PacoteAcessoriosAware,
	BuilderProduct<Veiculo>{
	
	private Veiculo veiculo;
	
	

	public VeiculoBuilderProduct(Veiculo veiculo) {
		super();
		this.veiculo = veiculo;
	}

	public void setTipoVeiculo(TipoVeiculo tipo) {
		this.veiculo.setTipo(tipo);
		
	}
	
	public void setMotorVeiculo(Motor motor) {
		this.veiculo.setMotor(motor);
		
	}
	public void setMarca(String marca){
		this.veiculo.setMarca(marca);
	}
	public void setModelo(String modelo){
		this.veiculo.setModelo(modelo);
	}
	
	public void setRoda(Roda roda) {
		this.veiculo.setRoda(roda);
	}
	
	public Veiculo getProduct() {
		return this.veiculo;
	}

	public void comPacoteAcessorios(PacoteAcessorios acessorios) {
		this.veiculo.setPacoteAcessorios(acessorios);
		
	}
}
