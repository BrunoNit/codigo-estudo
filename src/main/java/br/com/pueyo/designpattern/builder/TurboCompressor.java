package br.com.pueyo.designpattern.builder;

public class TurboCompressor implements Acessorio {
	
	private String marca;
	private Double caixaQuente;
	private Double caixaFria;
	
	public String getNomeAcessorio() {
		return "Turbo Compressor";
	}

	public double getValorAcessorio() {
		return 2000.60d;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getCaixaQuente() {
		return caixaQuente;
	}

	public void setCaixaQuente(Double caixaQuente) {
		this.caixaQuente = caixaQuente;
	}

	public Double getCaixaFria() {
		return caixaFria;
	}

	public void setCaixaFria(Double caixaFria) {
		this.caixaFria = caixaFria;
	}
}
