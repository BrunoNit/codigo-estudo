package br.com.pueyo.designpattern.builder;

public class RodaBuilder<P extends Builder<?, ?>> extends AbstractBuilder<Roda, P>{

	


	private Roda roda = new Roda();
	
	private RodaAware rodaAware;

	public RodaBuilder(RodaAware rodaAware, P builderPrevio) {
		super(builderPrevio);
		this.rodaAware = rodaAware;
	}
	
	public RodaBuilder<P> comTamanho(double tamanhoRoda){
		this.roda.setTamanho(tamanhoRoda);
		return this;
	}

	public RodaBuilder<P> daMarca(String marcaRoda){
		this.roda.setMarca(marcaRoda);
		return this;
	}
	
	public Roda build() {
		return this.roda;
	}

	@Override
	protected void prepareForEnd() {
		this.rodaAware.setRoda(this.roda);
	}

}
