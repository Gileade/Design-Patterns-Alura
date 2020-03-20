package ChainOfResponsibility.Descontos;

import Model.Orcamento;

public class DescontoPorMaisDeCincoItens  implements Desconto{
    private Desconto proximo;

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

    @Override
    public double desconta(Orcamento orcamento){
        if (orcamento.getItens().size() > 5){
            return orcamento.getValor() * 0.1;
        }else {
            return proximo.desconta(orcamento);
        }
    }


}
