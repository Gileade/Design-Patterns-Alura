package Strategy.Investimentos;

import java.util.Random;

public class Arrojado implements Investimento {
    private int random;

    public Arrojado() {
        Random r = new Random();
        this.random = r.nextInt(10)+1;
    }

    //Para Teste, deverá ser passado de 1 a 10
    public Arrojado(int porcentagem){
        this.random = porcentagem;
    }

    @Override
    public double calculaRendimentoSobre(ContaBancaria contaBancaria) {
        if(random > 0 && random <= 2) return contaBancaria.getSaldo() * 0.05;
        else if (random >= 3 && random <= 5) return contaBancaria.getSaldo() * 0.03;
        else return contaBancaria.getSaldo() * 0.006;
    }
}
