package Strategy.Investimentos;

import Model.ContaBancaria;

public class Conservador implements Investimento {
    @Override
    public double calculaRendimentoSobre(ContaBancaria contaBancaria) {
        return contaBancaria.getSaldo() * 0.008;
    }
}
