package com.github.heidiks.chain.of.responsibility;

import com.github.heidiks.model.Orcamento;

public class DescontoPorVendaCasada implements Desconto {
	
    private Desconto proximo;

    public DescontoPorVendaCasada(Desconto proximo) {
        this.proximo = proximo;
    }

    public Double desconto(Orcamento orcamento) {
        if(aconteceuVendaCasadaEm(orcamento)) 
        	return orcamento.getValor() * 0.05;
        else 
        	return proximo.desconto(orcamento);
    }

    private boolean aconteceuVendaCasadaEm(Orcamento orcamento) {
        return existe("CANETA", orcamento) && existe("LAPIS", orcamento);
    }

    private boolean existe(String nomeDoItem, Orcamento orcamento) {
        return orcamento.getItens().stream().filter(item -> item.getNome().equals(nomeDoItem)).count() > 0;
    }


}