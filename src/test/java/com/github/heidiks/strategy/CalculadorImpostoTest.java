package com.github.heidiks.strategy;

import com.github.heidiks.model.Item;
import com.github.heidiks.model.imposto.*;
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

    @Test
    public void calcula_ICPP_maxima_taxacao() {
        orcamento = new Orcamento(600.0);
        Imposto icpp = new ICPP();

        Assert.assertTrue(calculadorImposto.calcula(orcamento, icpp).compareTo(42.0) == 0);
    }

    @Test
    public void calcula_ICPP_minima_taxacao() {
        orcamento = new Orcamento(500.0);
        Imposto icpp = new ICPP();

        Assert.assertTrue(calculadorImposto.calcula(orcamento, icpp).compareTo(25.0) == 0);
    }

    @Test
    public void calcula_IKCV_maxima_taxacao() {
        orcamento = new Orcamento(600.0);
        orcamento.adicionaItem(new Item("Cadeira", 120.0));
        Imposto ikcv = new IKCV();

        Assert.assertTrue(calculadorImposto.calcula(orcamento, ikcv).compareTo(60.0) == 0);
    }

    @Test
    public void calcula_IKCV_minima_taxacao() {
        orcamento = new Orcamento(600.0);
        Imposto ikcv = new IKCV();

        Assert.assertTrue(calculadorImposto.calcula(orcamento, ikcv).compareTo(36.0) == 0);
    }

}
