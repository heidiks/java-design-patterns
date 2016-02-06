package com.github.heidiks.chain.of.responsibility;

import com.github.heidiks.model.Orcamento;

public class SemDesconto implements Desconto {
	
	private Desconto desconto;

	public SemDesconto(Desconto desconto) {
		this.desconto = desconto;
	}

	public SemDesconto() {
		this.desconto = null;
	}
	
	@Override
	public Double desconto(Orcamento orcamento) {
		return 0d;
	}

}
