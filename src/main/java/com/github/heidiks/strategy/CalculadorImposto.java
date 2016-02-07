package com.github.heidiks.strategy;

import com.github.heidiks.model.Imposto;
import com.github.heidiks.model.Orcamento;

/**
 * Created by heidi on 07/02/2016.
 */
public class CalculadorImposto {

    public Double calcula(Orcamento orcamento, Imposto imposto) {
            return imposto.calcula(orcamento);
    }
}
