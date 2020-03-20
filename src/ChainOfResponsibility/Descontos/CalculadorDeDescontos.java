package ChainOfResponsibility.Descontos;

import Model.Orcamento;

public class CalculadorDeDescontos {
    public double calcula(Orcamento orcamento){
        Desconto desconto1 = new DescontoPorMaisDeCincoItens();
        Desconto desconto2 = new DescontoPorMaisDeQuinhentosReais();
        Desconto desconto3 = new SemDesconto();

        desconto1.setProximo(desconto2);
        desconto2.setProximo(desconto3);

        return desconto1.desconta(orcamento);
    }
}
