package com.github.heidiks.strategy;

import com.github.heidiks.model.Orcamento;
import com.github.heidiks.model.imposto.ICMS;
import com.github.heidiks.model.imposto.ICPP;
import com.github.heidiks.model.imposto.ISS;
import com.github.heidiks.model.imposto.Imposto;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by heidi on 02/04/2016.
 */
public class ImpostoTest {

    private Orcamento orcamento;
    private CalculadorImposto calculadorImposto;

    @Test
    public void calcula_imposto_ISS_e_ICMS() {
        Imposto impostos = new ISS(new ICMS());

        Orcamento orcamento = new Orcamento(500.0);

        Assert.assertThat(impostos.calcula(orcamento), is(80.0));

    }

    @Test
    public void calcula_imposto_ICPP_e_ICMS() {
        Imposto impostos = new ICPP(new ICMS());

        Orcamento orcamento = new Orcamento(500.0);

        Assert.assertThat(impostos.calcula(orcamento), is(75.0));

    }


}
