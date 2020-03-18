package Strategy.Investimentos;

import java.util.Random;

public class Arrojado implements Investimento {
    private Random random;

    public Arrojado() {
        Random random = new Random();
    }

    @Override
    public double calculaRendimentoSobre(ContaBancaria contaBancaria) {
        int valorRandom = random.nextInt(10);
        if(valorRandom >=0 && valorRandom <= 1) return contaBancaria.getSaldo() * 0.05;
        else if (valorRandom >= 2 && valorRandom <= 4) return contaBancaria.getSaldo() * 0.03;
        else return contaBancaria.getSaldo() * 0.006;
    }
}
