package com.github.heidiks.model.imposto;

import com.github.heidiks.model.Orcamento;
import com.github.heidiks.template.method.TemplateImposto;

/**
 * Created by heidi on 07/02/2016.
 */
public class ISS extends TemplateImposto {

    @Override
    protected Double calculaTaxa(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

}
