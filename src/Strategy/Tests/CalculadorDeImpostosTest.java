package Strategy.Tests;

import Strategy.Impostos.*;
import org.junit.Assert;
import org.junit.Test;

public class CalculadorDeImpostosTest {

    //Testes ISS
    @Test
    public void deveRetornarSeisPorCentoDoOrcamentoISS(){
        Orcamento orcamento = new Orcamento(500);
        Imposto iss = new ISS();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        Assert.assertEquals(30,calculadorDeImpostos.calcula(orcamento, iss),0.001);
    }

    //Testes ICMS
    @Test
    public void deveRetornarCincoPorCentoDoOrcamentoMaisCinquentaICMS(){
        Orcamento orcamento = new Orcamento(500);
        Imposto icms = new ICMS();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        Assert.assertEquals(75,calculadorDeImpostos.calcula(orcamento, icms),0.001);
    }

    //Testes ICCC
    @Test
    public void deveRetornarCincoPorcentoDoOrcamentoICCC(){
        Orcamento orcamento = new Orcamento(500);
        Imposto iccc = new ICCC();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        Assert.assertEquals(25,calculadorDeImpostos.calcula(orcamento, iccc ),0.001);
    }

    @Test
    public void deveRetornarCincoPorcentoDoOrcamentoICCC_MaiorFaixa(){
        Orcamento orcamento = new Orcamento(999.99);
        Imposto iccc = new ICCC();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        Assert.assertEquals(49.999,calculadorDeImpostos.calcula(orcamento, iccc ),0.001);
    }

    @Test
    public void deveRetornarSetePorcentoDoOrcamentoICCC_MenorFaixa(){
        Orcamento orcamento = new Orcamento(1000);
        Imposto iccc = new ICCC();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        Assert.assertEquals(70,calculadorDeImpostos.calcula(orcamento, iccc ),0.001);
    }

    @Test
    public void deveRetornarSetePorcentoDoOrcamentoICCC(){
        Orcamento orcamento = new Orcamento(2000);
        Imposto iccc = new ICCC();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        Assert.assertEquals(140,calculadorDeImpostos.calcula(orcamento, iccc ),0.001);
    }

    @Test
    public void deveRetornarSetePorcentoDoOrcamentoICCC_MaiorFaixa(){
        Orcamento orcamento = new Orcamento(3000);
        Imposto iccc = new ICCC();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        Assert.assertEquals(210,calculadorDeImpostos.calcula(orcamento, iccc ),0.001);
    }

    @Test
    public void deveRetornarOitoPorcentoMaisTrintaDoOrcamentoICCC_MenorFaixa(){
        Orcamento orcamento = new Orcamento(3001);
        Imposto iccc = new ICCC();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        Assert.assertEquals(270.08,calculadorDeImpostos.calcula(orcamento, iccc ),0.001);
    }

    @Test
    public void deveRetornarOitoPorcentoMaisTrintaDoOrcamentoICCC(){
        Orcamento orcamento = new Orcamento(10000);
        Imposto iccc = new ICCC();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        Assert.assertEquals(830,calculadorDeImpostos.calcula(orcamento, iccc ),0.001);
    }
}
