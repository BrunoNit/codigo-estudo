package br.com.pueyo.designpattern.nullpattern.pojo.impl;

import br.com.pueyo.designpattern.nullpattern.pojo.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {

	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isNil() {
		return false;
	}
}
