package Strategy.Tests;

import Model.ContaBancaria;
import Strategy.Investimentos.*;
import org.junit.Assert;
import org.junit.Test;

public class RealizadorDeInvestimentosTest {

    @Test
    public void deveRetornarZeroPontoOitoPorCento_Conservador(){
        ContaBancaria conta = new ContaBancaria();
        Investimento investimentoConservador = new Conservador();
        RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();

        conta.deposita(1000);

        realizadorDeInvestimentos.realizaInvestimento(conta, investimentoConservador);

        Assert.assertEquals(1008,conta.getSaldo(),0.001);
    }

    @Test
    public void deveRetornarDoisEMeioPorCento_Moderado(){
        ContaBancaria conta = new ContaBancaria();
        Investimento investimentoModerado = new Moderado(1);
        RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();

        conta.deposita(1000);

        realizadorDeInvestimentos.realizaInvestimento(conta, investimentoModerado);

        Assert.assertEquals(1025,conta.getSaldo(),0.001);
    }

    @Test
    public void deveRetornarZeroPontoSeteCento_Moderado(){
        ContaBancaria conta = new ContaBancaria();
        Investimento investimentoModerado = new Moderado(2);
        RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();

        conta.deposita(1000);

        realizadorDeInvestimentos.realizaInvestimento(conta, investimentoModerado);

        Assert.assertEquals(1007,conta.getSaldo(),0.001);
    }

    @Test
    public void deveRetornarZeroPontoSeisPorCento_Arrojado(){
        ContaBancaria conta = new ContaBancaria();
        Investimento investimentoArrojado = new Arrojado(6);
        RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();

        conta.deposita(1000);

        realizadorDeInvestimentos.realizaInvestimento(conta, investimentoArrojado);

        Assert.assertEquals(1006,conta.getSaldo(),0.001);
    }

    @Test
    public void deveRetornarTresPorCento_Arrojado(){
        ContaBancaria conta = new ContaBancaria();
        Investimento investimentoArrojado = new Arrojado(4);
        RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();

        conta.deposita(1000);

        realizadorDeInvestimentos.realizaInvestimento(conta, investimentoArrojado);

        Assert.assertEquals(1030,conta.getSaldo(),0.001);
    }

    @Test
    public void deveRetornarCincoPorCento_Arrojado(){
        ContaBancaria conta = new ContaBancaria();
        Investimento investimentoArrojado = new Arrojado(2);
        RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();

        conta.deposita(1000);

        realizadorDeInvestimentos.realizaInvestimento(conta, investimentoArrojado);

        Assert.assertEquals(1050,conta.getSaldo(),0.001);
    }
}
