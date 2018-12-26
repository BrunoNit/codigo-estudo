package br.com.pueyo.designpattern.builder;

/**
 * Builder genérico sem predecessores
 * 
 * @author SERPRO
 *
 * @param <T> tipo sendo construído 
 */
public interface RootBuilder<T> extends Builder<T, RootBuilder<T>> {
}

