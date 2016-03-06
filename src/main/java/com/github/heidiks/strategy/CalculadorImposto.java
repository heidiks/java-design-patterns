package com.github.heidiks.strategy;

import com.github.heidiks.model.imposto.Imposto;
import com.github.heidiks.model.Orcamento;

public class CalculadorImposto {

    public Double calcula(Orcamento orcamento, Imposto imposto) {
        return imposto.calcula(orcamento);
    }
}
