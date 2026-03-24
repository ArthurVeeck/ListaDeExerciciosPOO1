
package exercicio04;


public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(int numero, String titular, double taxaRendimento) {
        super(numero, titular);
        this.taxaRendimento = taxaRendimento;
    }
    
    public double getTaxaRendimento(){
        return taxaRendimento;
    }
    
    public void setTaxaRendimento(double taxaRendimento){
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }
}
