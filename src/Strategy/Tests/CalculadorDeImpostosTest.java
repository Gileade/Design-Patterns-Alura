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

    @Test
    public void deveRetornarCincoPorcentoDoOrcamentoICCC(){
        Orcamento orcamento = new Orcamento(500);
        Imposto iccc = new ICCC();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        Assert.assertEquals(25,calculadorDeImpostos.calcula(orcamento, iccc ),0.001);


    }
    @Test
    public void deveRetornarSetePorcentoDoOrcamentoICCC(){
        Orcamento orcamento = new Orcamento(1000);
        Imposto iccc = new ICCC();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        Assert.assertEquals(70,calculadorDeImpostos.calcula(orcamento, iccc ),0.001);


    }

    @Test
    public void deveRetornarOitoPorcentoMaisTrintaDoOrcamentoICCC(){
        Orcamento orcamento = new Orcamento(10000);
        Imposto iccc = new ICCC();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        Assert.assertEquals(830,calculadorDeImpostos.calcula(orcamento, iccc ),0.001);


    }
}
