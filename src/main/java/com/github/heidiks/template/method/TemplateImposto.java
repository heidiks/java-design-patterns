package com.github.heidiks.template.method;

import com.github.heidiks.model.Orcamento;
import com.github.heidiks.model.imposto.Imposto;

/**
 * Created by heidi on 25/03/2016.
 */
public abstract class TemplateImposto implements Imposto {

    @Override
    public Double calcula(Orcamento orcamento) {
        return calculaTaxa(orcamento);
    }

    protected abstract Double calculaTaxa(Orcamento orcamento);

}
