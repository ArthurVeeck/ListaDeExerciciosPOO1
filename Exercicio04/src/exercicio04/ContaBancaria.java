
package exercicio04;


public class ContaBancaria {
    private int numero;
    private double saldo;
    private String titular;

    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}