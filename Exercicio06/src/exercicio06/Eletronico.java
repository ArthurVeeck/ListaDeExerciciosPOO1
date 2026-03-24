
package exercicio06;


public class Eletronico extends Produto {
    private String marca;
    private int garantiaMeses;
    private String voltagem;

    public Eletronico(String nome, double preco, int quantidade, String marca) {
        super(nome, preco, quantidade);
        this.marca = marca;
    }

    @Override
    public double calcularPrecoFinal() {
        double total = super.calcularPrecoFinal();
        return total * 1.15; 
    }
}