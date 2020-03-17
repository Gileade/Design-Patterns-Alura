package Strategy.Tests;

import Strategy.*;
import org.junit.Assert;
import org.junit.Test;

public class CalculadorDeImpostosTest {

    @Test
    public void deveRetornarSeisPorCentoDoOrcamentoISS(){
        Orcamento orcamento = new Orcamento(500);
        Imposto iss = new ISS();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        Assert.assertEquals(30,calculadorDeImpostos.calcula(orcamento, iss),0.001);
    }

    @Test
    public void deveRetornarCincoPorCentoDoOrcamentoMaisCinquentaICMS(){
        Orcamento orcamento = new Orcamento(500);
        Imposto icms = new ICMS();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        Assert.assertEquals(75,calculadorDeImpostos.calcula(orcamento, icms),0.001);
    }
}
