package com.github.heidiks.chain.of.responsibility;

import com.github.heidiks.model.Orcamento;

public class CorrenteDeDesconto {

	public Double calcula(Orcamento orcamento) {
        //TODO criar builder
		DescontoPorCincoItens chain = new DescontoPorCincoItens(
				new DescontoPorMaisDeQuintetosReais(
						new DescontoPorVendaCasada(
								new SemDesconto())));

		return chain.desconto(orcamento);
	}
}
