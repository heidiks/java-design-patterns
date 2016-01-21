package com.github.heidiks.chainOfResponsibility;

import com.github.heidiks.model.Orcamento;

public class DescontoPorMaisDeQuintetosReais implements Desconto {

	private Desconto proximo;
	
	public double desconto(Orcamento orcamento) {
		if(orcamento.getValor() > 500.0)
			return orcamento.getValor() * 0.07;
		else
			return proximo.desconto(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}
}
