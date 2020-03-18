package Strategy.Tests;

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
    public void deveRetornarZeroPontoSeteOuDoisEMeioPorCento_Moderado(){
        ContaBancaria conta = new ContaBancaria();
        Investimento investimentoModerado = new Moderado();
        RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();

        conta.deposita(1000);

        realizadorDeInvestimentos.realizaInvestimento(conta, investimentoModerado);

        Assert.assertEquals(1025,conta.getSaldo(),0.001);
        Assert.assertEquals(1007,conta.getSaldo(),0.001);
    }
}
