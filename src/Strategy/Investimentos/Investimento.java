package Strategy.Investimentos;

import Model.ContaBancaria;

public interface Investimento {
    double calculaRendimentoSobre(ContaBancaria contaBancaria);
}
