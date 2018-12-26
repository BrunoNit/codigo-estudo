package br.com.pueyo.designpattern.builder;


public abstract class AbstractBuilder<T, P extends Builder<?, ?>> implements Builder<T, P>{
	
	private P builderPrevio;
	
	public AbstractBuilder(P builderPrevio) {
		this.builderPrevio = builderPrevio;
	}
	

	public P end() {
		if (builderPrevio == null) {
			throw new IllegalStateException("Não existe builder prévio");
		}
		prepareForEnd();
		return builderPrevio;
	}
	
	protected abstract void prepareForEnd();
	
}
