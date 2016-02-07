package com.github.heidiks.strategy;

import com.github.heidiks.model.ICMS;
import com.github.heidiks.model.ISS;
import com.github.heidiks.model.Imposto;
import com.github.heidiks.model.Orcamento;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by heidi on 07/02/2016.
 */
public class CalculadorImpostoTest {

    private Orcamento orcamento;
    private CalculadorImposto calculadorImposto;

    @Before
    public void setup() {
        orcamento = new Orcamento(500.0);
        calculadorImposto = new CalculadorImposto();
    }

    @Test
    public void calcula_ISS() {
        Imposto iss = new ISS();

        Assert.assertTrue(calculadorImposto.calcula(orcamento, iss).compareTo(30.0) == 0);

    }

    @Test
    public void calcula_ICMS() {
        Imposto icms = new ICMS();

        Assert.assertTrue(calculadorImposto.calcula(orcamento, icms).compareTo(50.0) == 0);
    }
}
