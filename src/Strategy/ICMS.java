package Strategy;

public class ICMS implements Imposto{

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.05 + 50;
    }
}
