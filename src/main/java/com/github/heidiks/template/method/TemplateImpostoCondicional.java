package com.github.heidiks.template.method;

import com.github.heidiks.model.Orcamento;
import com.github.heidiks.model.imposto.Imposto;

/**
 * Created by heidi on 05/03/2016.
 */
public abstract class TemplateImpostoCondicional extends Imposto {

    public TemplateImpostoCondicional(Imposto outroImposto) {
        super(outroImposto);
    }

    public TemplateImpostoCondicional() {
    }

    @Override
    public Double calcula(Orcamento orcamento) {
        if (deveUsarMaximaTaxacao(orcamento))
            return round(maximaTaxacao(orcamento) + calculoOutroImposto(orcamento));

        return round(minimaTaxacao(orcamento) + calculoOutroImposto(orcamento));
    }

    protected abstract Double minimaTaxacao(Orcamento orcamento);

    protected abstract Double maximaTaxacao(Orcamento orcamento);

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
    
}
