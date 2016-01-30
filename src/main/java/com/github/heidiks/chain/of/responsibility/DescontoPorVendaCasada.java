package com.github.heidiks.chain.of.responsibility;

import com.github.heidiks.model.Item;
import com.github.heidiks.model.Orcamento;

public class DescontoPorVendaCasada implements Desconto {
	
    private Desconto proximo;

    public double desconto(Orcamento orcamento) {
        if(aconteceuVendaCasadaEm(orcamento)) 
        	return orcamento.getValor() * 0.05;
        else 
        	return proximo.desconto(orcamento);
    }

    private boolean aconteceuVendaCasadaEm(Orcamento orcamento) {
        return existe("CANETA", orcamento) && existe("LAPIS", orcamento);
    }

    private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) 
            if(item.getNome().equals(nomeDoItem)) return true;
        
        return false;
    }

    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }


}