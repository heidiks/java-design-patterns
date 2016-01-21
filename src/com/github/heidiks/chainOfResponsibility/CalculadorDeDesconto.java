package com.github.heidiks.chainOfResponsibility;

import com.github.heidiks.model.Orcamento;

public class CalculadorDeDesconto {

	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuintetosReais();
		Desconto d3 = new SemDesconto();
		
		d1.setProximo(d2);
		
		return d1.desconto(orcamento);
	}
}
