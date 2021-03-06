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

	@Test
	public void desconto_por_mais_de_quinhentos_reais() {
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("caneta", 100.0));
		orcamento.adicionaItem(new Item("Lapis", 100.0));
		orcamento.adicionaItem(new Item("Borracha", 100.0));
		orcamento.adicionaItem(new Item("Borracha", 200.0));

		Assert.assertTrue(desconto.calcula(orcamento).compareTo(42.0) == 0);
	}

	@Test
	public void desconto_por_venda_casada() {
		Orcamento orcamento = new Orcamento(200.0);
		orcamento.adicionaItem(new Item("CANETA", 100.0));
		orcamento.adicionaItem(new Item("LAPIS", 100.0));

		Assert.assertTrue(desconto.calcula(orcamento).compareTo(10.0) == 0);
	}

    @Test
    public void sem_venda_casada() {
        Orcamento orcamento = new Orcamento(100.0);
        orcamento.adicionaItem(new Item("LAPIS", 100.0));

        Assert.assertTrue(desconto.calcula(orcamento).compareTo(0.0) == 0);
    }

    @Test
    public void sem_desconto() {
        Orcamento orcamento = new Orcamento(100.0);
        orcamento.adicionaItem(new Item("CANETA", 100.0));

        Assert.assertTrue(desconto.calcula(orcamento).compareTo(0.0) == 0);
    }


}
