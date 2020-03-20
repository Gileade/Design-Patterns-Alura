package ChainOfResponsibility.Descontos;

import Model.Orcamento;

public class SemDesconto implements Desconto {
    @Override
    public void setProximo(Desconto proximo) {
    }

    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

}
