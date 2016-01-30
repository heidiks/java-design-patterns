package com.github.heidiks.chain.of.responsibility;

import com.github.heidiks.model.Item;
import com.github.heidiks.model.Orcamento;

public class TesteDescontos {

	//TODO Refactoring Teste unitario
	public static void main(String[] args) {
		CorrenteDeDesconto desconto = new CorrenteDeDesconto();
		
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("caneta", 10.0));
		orcamento.adicionaItem(new Item("Lapis", 25.0));
		orcamento.adicionaItem(new Item("Borracha", 15.0));
		
		Double descontoFinal = desconto.calcula(orcamento);
		
		System.out.println(descontoFinal);
	}
}
