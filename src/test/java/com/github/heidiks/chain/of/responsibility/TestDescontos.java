package com.github.heidiks.chain.of.responsibility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.github.heidiks.model.Item;
import com.github.heidiks.model.Orcamento;

public class TestDescontos {

	
	@Before
	public void setup() {
		
	}
	
	@Test
	public void desconto_por_cinco_itens() {
		CorrenteDeDesconto desconto = new CorrenteDeDesconto();
		
		Orcamento orcamento = new Orcamento(100.0);
		orcamento.adicionaItem(new Item("caneta", 10.0));
		orcamento.adicionaItem(new Item("Lapis", 10.0));
		orcamento.adicionaItem(new Item("Borracha", 10.0));
		orcamento.adicionaItem(new Item("Borracha", 10.0));
		orcamento.adicionaItem(new Item("Borracha", 10.0));
		
		Assert.assertTrue(10.0 == desconto.calcula(orcamento));
	}
	
}
