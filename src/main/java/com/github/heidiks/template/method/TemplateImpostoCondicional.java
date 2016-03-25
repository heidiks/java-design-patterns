package com.github.heidiks.template.method;

import com.github.heidiks.model.Orcamento;
import com.github.heidiks.model.imposto.Imposto;

/**
 * Created by heidi on 05/03/2016.
 */
public abstract class TemplateImpostoCondicional implements Imposto {

    @Override
    public Double calcula(Orcamento orcamento) {
        if (deveUsarMaximaTaxacao(orcamento))
            return round(maximaTaxacao(orcamento));

        return round(minimaTaxacao(orcamento));
    }

    protected abstract Double minimaTaxacao(Orcamento orcamento);

    protected abstract Double maximaTaxacao(Orcamento orcamento);

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
    
}
