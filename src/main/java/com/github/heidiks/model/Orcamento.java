package com.github.heidiks.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	private Double valor;
	private List<Item> itens;
	
	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<>();
	}
	
	public Double getValor() {
		return valor;
	}
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}
	
}
