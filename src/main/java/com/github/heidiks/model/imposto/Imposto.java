package com.github.heidiks.model.imposto;

import com.github.heidiks.model.Orcamento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public interface Imposto {

    Double calcula(Orcamento orcamento);

    default double round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
