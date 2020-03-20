package Model;

public class ContaBancaria {
    private double saldo;


    public void deposita(double valor){
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
