
package exercicio06;


public class Alimento extends Produto {
    private String validade;
    private String tipo;
    private boolean pertoVencimento;

    public Alimento(String nome, double preco, int quantidade, boolean pertoVencimento) {
        super(nome, preco, quantidade);
        this.pertoVencimento = pertoVencimento;
    }

    @Override
    public double calcularPrecoFinal() {
        double total = super.calcularPrecoFinal();
        if (pertoVencimento) {
            return total * 0.7; 
        }
        return total;
    }
}