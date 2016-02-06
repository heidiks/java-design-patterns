package com.github.heidiks.chain.of.responsibility;

import com.github.heidiks.model.Orcamento;

public class CorrenteDeDesconto {

	public Double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuintetosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();
		
        d1.setProximo(d2);
        d2.setProximo(d3);
        d3.setProximo(d4);
        d4.setProximo(null);

		return d1.desconto(orcamento);
	}
}
