package br.com.pueyo.teste.unitario;

public class Abs implements Item {

	private String descricao = "Teste Unitário";
	private double valor = 2540.56;
	private String codigo = "ABSTU001";
	
	public String getDescricao() {
		return this.descricao;
	}

	public double getValor() {
		return this.valor;
	}

	public String getCodigo() {
		return this.codigo;
	}

}
