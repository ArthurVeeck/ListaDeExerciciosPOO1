
package exercicio04;


public class ContaCorrente extends ContaBancaria {
    private double taxaSaque;

    public ContaCorrente(int numero, String titular, double taxaSaque) {
        super(numero, titular);
        this.taxaSaque = taxaSaque;
    }
    
    public double getTaxaSaque(){
        return taxaSaque;
    }
    
    public void setTaxaSaque(double taxaSaque){
        this.taxaSaque = taxaSaque;
    }

    @Override
    public void sacar(double valor) {
        double total = valor + taxaSaque;
        if (total <= getSaldo()) {
            super.sacar(total);
        } else {
            System.out.println("Saldo insuficiente (com taxa).");
        }
    }
}