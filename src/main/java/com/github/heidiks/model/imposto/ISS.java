package com.github.heidiks.model.imposto;

import com.github.heidiks.model.Orcamento;
import com.github.heidiks.model.imposto.Imposto;
import com.github.heidiks.template.method.TemplateImpostoCondicional;

/**
 * Created by heidi on 07/02/2016.
 */
public class ISS extends TemplateImpostoCondicional {

    @Override
    protected Double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    protected Double maximaTaxacao(Orcamento orcamento) {
        return null;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return false;
    }
}
