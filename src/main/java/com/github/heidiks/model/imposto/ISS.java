package com.github.heidiks.model.imposto;

import com.github.heidiks.model.Orcamento;
import com.github.heidiks.template.method.TemplateImposto;

/**
 * Created by heidi on 07/02/2016.
 */
public class ISS extends TemplateImposto {

    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }

    public ISS() {
    }

    @Override
    protected Double calculaTaxa(Orcamento orcamento) {
        return orcamento.getValor() * 0.06 + calculoOutroImposto(orcamento);
    }

}
