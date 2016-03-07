package com.github.heidiks.chain.of.responsibility;

import com.github.heidiks.model.Orcamento;

import java.text.DecimalFormat;

public class DescontoPorMaisDeQuintetosReais implements Desconto {

	private Desconto proximo;

	public DescontoPorMaisDeQuintetosReais(Desconto proximo) {
		this.proximo = proximo;
	}

	public Double desconto(Orcamento orcamento) {
        DecimalFormat df = new DecimalFormat("#.00");

        if(orcamento.getValor() > 500.0)
            return round(orcamento.getValor() * 0.07);
		else
			return proximo.desconto(orcamento);

	}


}
