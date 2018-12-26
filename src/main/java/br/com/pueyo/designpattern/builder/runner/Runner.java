package br.com.pueyo.designpattern.builder.runner;

import br.com.pueyo.designpattern.builder.InterCooler;
import br.com.pueyo.designpattern.builder.TurboCompressor;
import br.com.pueyo.designpattern.builder.Veiculo;
import br.com.pueyo.designpattern.builder.VeiculoBuilder;
import br.com.pueyo.designpattern.builder.enums.TipoCombustivel;
import br.com.pueyo.designpattern.builder.enums.TipoVeiculo;

public class Runner {

	public static void main(String[] args) {
		Veiculo v = new VeiculoBuilder()
				.start()
				.criarMotor()
					.comCilindrada(2.0d)
					.comNumeroDeCilindros(4)
					.comTipoDeCombustivel(TipoCombustivel.GASOLINA)
					.inserirTurboCompressor()
						.setCaixaFria(0.50d)
						.setCaixaQuente(0.50d)
						.setMarcaTurbo("Garrett")
					.end()
				.end()
				.criarRoda()
					.comTamanho(17.0d)
					.daMarca("OZ Racing")
				.end()
				.comPacoteDeAcessorios()
					.comAcessorio(new TurboCompressor())
					.comAcessorio(new InterCooler())
				.end()
				.daMarca("Renault")
				.modelo("Sandero RS")
				.doTipo(TipoVeiculo.PASSEIO)
				.build();
		
		
		System.out.println(v);

	}

}
