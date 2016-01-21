package com.github.heidiks.chainOfResponsibility;

import com.github.heidiks.model.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
		// não tem
	}

}
