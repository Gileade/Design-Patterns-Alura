package Strategy.Impostos;

import Model.Orcamento;

public class CalculadorDeImpostos {

    public double calcula(Orcamento orcamento, Imposto estrategiaDeImposto){
        return estrategiaDeImposto.calcula(orcamento);
    }
}
