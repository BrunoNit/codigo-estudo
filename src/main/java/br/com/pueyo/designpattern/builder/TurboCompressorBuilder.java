package br.com.pueyo.designpattern.builder;

public class TurboCompressorBuilder <P extends Builder<?, ?>> extends AbstractBuilder<TurboCompressor, P> {


	private TurboCompressorAware aware;
	private TurboCompressor turbo = new TurboCompressor();
	
	public TurboCompressorBuilder(TurboCompressorAware aware, P builderPrevio) {
		super(builderPrevio);
		this.aware = aware;
	}
	
	public TurboCompressorBuilder<P> setMarcaTurbo(String marca){
		this.turbo.setMarca(marca);
		return this;
		
	}
	
	public TurboCompressorBuilder<P> setCaixaQuente(Double caixaQuente){
		this.turbo.setCaixaQuente(caixaQuente);
		return this;
	}
	public TurboCompressorBuilder<P> setCaixaFria(Double caixaFria){
		this.turbo.setCaixaFria(caixaFria);
		return this;
	}

	public TurboCompressor build() {
		return this.turbo;
	}

	@Override
	protected void prepareForEnd() {
		this.aware.setTurboCompressor(this.turbo);
	}
}
