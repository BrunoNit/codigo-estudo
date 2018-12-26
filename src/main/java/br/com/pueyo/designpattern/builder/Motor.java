package br.com.pueyo.designpattern.builder;

import br.com.pueyo.designpattern.builder.enums.TipoCombustivel;

public class Motor {
	
	private TipoCombustivel combustivel;
	private Double cilindrada;
	private int cilindros;
	private TurboCompressor turbo;
	
	public TipoCombustivel getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(TipoCombustivel combustivel) {
		this.combustivel = combustivel;
	}
	public Double getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(Double cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getCilindros() {
		return cilindros;
	}
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	public void setTurboCompressor(TurboCompressor turboCOmpressor) {
		this.turbo = turboCOmpressor;
	}
	public TurboCompressor getTurboCompressor() {
		return this.turbo;
	}
	

}
