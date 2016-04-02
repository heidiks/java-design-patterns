package com.github.heidiks.model.imposto;

import com.github.heidiks.model.Orcamento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Imposto {

    //para calculo de impostos agrupados
    private final Imposto outroImposto;

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public Imposto() {
        this.outroImposto = null;
    }

    protected Double calculoOutroImposto(Orcamento orcamento) {
        return outroImposto == null ? new Double(0) : outroImposto.calcula(orcamento);
    }

    public abstract Double calcula(Orcamento orcamento);

    public double round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
