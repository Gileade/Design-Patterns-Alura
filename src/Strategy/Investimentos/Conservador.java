package Strategy.Investimentos;

public class Conservador implements Investimento {
    @Override
    public double calculaRendimentoSobre(ContaBancaria contaBancaria) {
        return contaBancaria.getSaldo() * 0.008;
    }
}
