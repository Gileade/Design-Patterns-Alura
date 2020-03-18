package Strategy.Investimentos;

public class RealizadorDeInvestimentos {

    public void realizaInvestimento(ContaBancaria contaBancaria, Investimento estrategiaDeInvestimento){
        double resultado = estrategiaDeInvestimento.calculaRendimentoSobre(contaBancaria);

        contaBancaria.deposita(resultado);
    }
}
