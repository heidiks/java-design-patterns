package com.github.heidiks.model;

/**
 * Created by heidi on 07/02/2016.
 */
public class ICMS implements Imposto {

    @Override
    public Double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }
}
