package com.github.heidiks.chain.of.responsibility;

import com.github.heidiks.model.Orcamento;

public class SemDesconto implements Desconto {
	
	private Desconto desconto;
	
	public SemDesconto() {
		this.desconto = null;
	}
	
	@Override
	public double desconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
	}

}
