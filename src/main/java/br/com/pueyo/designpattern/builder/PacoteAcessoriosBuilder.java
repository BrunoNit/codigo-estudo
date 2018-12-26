package br.com.pueyo.designpattern.builder;

public class PacoteAcessoriosBuilder<P extends Builder<?, ?>> extends AbstractBuilder<PacoteAcessorios, P>{

	


	private PacoteAcessorios pacoteAcessorios = new PacoteAcessorios();
	
	private PacoteAcessoriosAware pacoteAcessoriosAware;

	public PacoteAcessoriosBuilder(PacoteAcessoriosAware pacoteAcessoriosAware, P builderPrevio) {
		super(builderPrevio);
		this.pacoteAcessoriosAware = pacoteAcessoriosAware;
	}
	
	public PacoteAcessoriosBuilder<P> comAcessorio(Acessorio acessorio){
		this.pacoteAcessorios.adicionaAcessorio(acessorio);
		return this;
	}

	
	public PacoteAcessorios build() {
		return this.pacoteAcessorios;
	}

	@Override
	protected void prepareForEnd() {
		this.pacoteAcessoriosAware.comPacoteAcessorios(this.pacoteAcessorios);
	}

}
