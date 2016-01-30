package com.github.heidiks.chain.of.responsibility;

import com.github.heidiks.model.Orcamento;

public interface Desconto {

	double desconto(Orcamento orcamento);
	void setProximo(Desconto desconto);
}
