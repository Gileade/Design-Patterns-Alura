package ChainOfResponsibility.Tests;

import ChainOfResponsibility.Descontos.CalculadorDeDescontos;
import Model.Item;
import Model.Orcamento;
import org.junit.Assert;
import org.junit.Test;

public class CalculadorDeDescontosTest {

    @Test
    public void RetornaZeroParaOrcamentoMenorIgualAQuinhentosReais(){
        Orcamento orcamento = new Orcamento(500);
        orcamento.adicionaItem(new Item("Caneta",250));
        orcamento.adicionaItem(new Item("Papel",250));

        CalculadorDeDescontos calculadorDeDescontos = new CalculadorDeDescontos();

        Assert.assertEquals(0,calculadorDeDescontos.calcula(orcamento),0.001);
    }

    @Test
    public void RetornaDezPorCentoParaOrcamentoComMaisDeCincoItens(){
        Orcamento orcamento = new Orcamento(1200);
        orcamento.adicionaItem(new Item("Caneta",200));
        orcamento.adicionaItem(new Item("Papel",200));
        orcamento.adicionaItem(new Item("Caderno",200));
        orcamento.adicionaItem(new Item("Lapis",200));
        orcamento.adicionaItem(new Item("Borracha",200));
        orcamento.adicionaItem(new Item("PenDrive",200));

        CalculadorDeDescontos calculadorDeDescontos = new CalculadorDeDescontos();

        Assert.assertEquals(120,calculadorDeDescontos.calcula(orcamento),0.001);
    }

    @Test
    public void RetornaSetePorCentoParaOrcamentoMaiorQueQuinhentosReais(){
        Orcamento orcamento = new Orcamento(1000);
        orcamento.adicionaItem(new Item("Caneta",500));
        orcamento.adicionaItem(new Item("Papel",500));

        CalculadorDeDescontos calculadorDeDescontos = new CalculadorDeDescontos();

        Assert.assertEquals(70,calculadorDeDescontos.calcula(orcamento),0.001);
    }
}
