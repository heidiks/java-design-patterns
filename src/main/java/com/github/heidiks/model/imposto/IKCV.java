package com.github.heidiks.model.imposto;

import com.github.heidiks.model.Orcamento;
import com.github.heidiks.template.method.TemplateImpostoCondicional;

/**
 * Created by heidi on 05/03/2016.
 */
public class IKCV extends TemplateImpostoCondicional {

    public IKCV() {

    }

    private boolean existeItemMaiorQueCemReais(Orcamento orcamento) {
        return orcamento.getItens().stream().filter(item -> item.getValor() > 100).count() > 0;
    }

    @Override
    public Double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    public Double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && existeItemMaiorQueCemReais(orcamento);
    }
}
