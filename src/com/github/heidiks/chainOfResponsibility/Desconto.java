package com.github.heidiks.chainOfResponsibility;

import com.github.heidiks.model.Orcamento;

public interface Desconto {

	double desconto(Orcamento orcamento);
	void setProximo(Desconto desconto);
}
