package com.github.heidiks.chain.of.responsibility;

import com.github.heidiks.model.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public Double desconto(Orcamento orcamento) {
		return 0d;
	}

}
