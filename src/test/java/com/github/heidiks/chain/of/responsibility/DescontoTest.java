package com.github.heidiks.chain.of.responsibility;

import com.github.heidiks.model.Item;
import com.github.heidiks.model.Orcamento;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DescontoTest {

	private CorrenteDeDesconto desconto;

	@Before
	public void setup() {
		desconto = new CorrenteDeDesconto();
	}
	
	@Test
	public void desconto_por_cinco_itens() {
		Orcamento orcamento = new Orcamento(100.0);
		orcamento.adicionaItem(new Item("caneta", 10.0));
		orcamento.adicionaItem(new Item("Lapis", 10.0));
		orcamento.adicionaItem(new Item("Borracha", 10.0));
		orcamento.adicionaItem(new Item("Borracha", 10.0));
		orcamento.adicionaItem(new Item("Borracha", 10.0));
		
		Assert.assertTrue(10.0 == desconto.calcula(orcamento));
	}
	
}
