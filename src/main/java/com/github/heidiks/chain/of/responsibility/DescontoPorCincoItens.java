package com.github.heidiks.chain.of.responsibility;

import com.github.heidiks.model.Orcamento;

public class DescontoPorCincoItens implements Desconto {
	
	private Desconto proximo;

	public DescontoPorCincoItens(Desconto proximo) {
		this.proximo = proximo;
	}

	public Double desconto(Orcamento orcamento) {
		if(orcamento.getItens().size() >= 5)
			return orcamento.getValor() * 0.1;
		else
			return proximo.desconto(orcamento);
	}

}
