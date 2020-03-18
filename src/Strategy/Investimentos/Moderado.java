package Strategy.Investimentos;

import java.util.Random;

public class Moderado implements Investimento {
    private Random random;

    public Moderado(){
        this.random = new Random();
    }

    @Override
    public double calculaRendimentoSobre(ContaBancaria contaBancaria) {
        if(random.nextInt(2) == 0)  return contaBancaria.getSaldo() * 0.025;
        else                               return contaBancaria.getSaldo() * 0.007;
    }
}
