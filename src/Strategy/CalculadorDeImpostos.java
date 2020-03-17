package Strategy;

public class CalculadorDeImpostos {

    public double calcula(Orcamento orcamento, Imposto estrategiaDeImposto){
        return estrategiaDeImposto.calcula(orcamento);
    }
}
