package com.github.heidiks.template.method;

import com.github.heidiks.model.Orcamento;
import com.github.heidiks.model.imposto.Imposto;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by heidi on 05/03/2016.
 */
public abstract class TemplateImpostoCondicional implements Imposto {

    private double round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

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
