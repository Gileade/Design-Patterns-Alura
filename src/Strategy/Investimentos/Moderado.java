package Strategy.Investimentos;

import Model.ContaBancaria;

import java.util.Random;

public class Moderado implements Investimento {
    private int random;

    public Moderado(){
        Random r = new Random();
        this.random = r.nextInt(2)+1;
    }

    //Para Teste, deverá ser passado 1 ou 2
    public Moderado(int porcentagem){
        this.random = porcentagem;
    }

    @Override
    public double calculaRendimentoSobre(ContaBancaria contaBancaria) {
        if(random == 1)  return contaBancaria.getSaldo() * 0.025;
        else             return contaBancaria.getSaldo() * 0.007;
    }
}
