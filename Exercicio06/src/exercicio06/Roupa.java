
package exercicio06;


public class Roupa extends Produto {
    private String tamanho;
    private String cor;
    private String material;

    public Roupa(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public double calcularPrecoFinal() {
        double total = super.calcularPrecoFinal();
        if (getQuantidade() > 3) {
            return total * 0.8; 
        }
        return total;
    }
}