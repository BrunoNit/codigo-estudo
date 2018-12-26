package br.com.pueyo.designpattern.builder;

import br.com.pueyo.designpattern.builder.enums.TipoVeiculo;

public class Veiculo {

	private String marca;
	private String modelo;
	private TipoVeiculo tipo;
	private Motor motor;
	private Roda roda;
	private PacoteAcessorios pacoteAcessorios;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public TipoVeiculo getTipo() {
		return tipo;
	}
	public void setTipo(TipoVeiculo tipo) {
		this.tipo = tipo;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Roda getRoda() {
		return roda;
	}
	public void setRoda(Roda roda) {
		this.roda = roda;
	}
	public PacoteAcessorios getPacoteAcessorios() {
		return pacoteAcessorios;
	}
	public void setPacoteAcessorios(PacoteAcessorios pacoteAcessorios) {
		this.pacoteAcessorios = pacoteAcessorios;
	}
	
	

	
}
