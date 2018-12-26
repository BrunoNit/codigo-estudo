package br.com.pueyo.designpattern.builder;

/**
 * Builder genérico
 * @author SERPRO
 *
 * @param <P> builder anterior durante a construção hierárquica
 * @param <T> tipo sendo construído 
 */
public interface Builder<T, P extends Builder<?, ?>> {

	public T build();
	
	public P end();
	
}

