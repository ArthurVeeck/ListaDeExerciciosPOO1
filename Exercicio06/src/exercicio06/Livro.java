
package exercicio06;


public class Livro extends Produto {
    private String autor;
    private String genero;
    private int paginas;

    public Livro(String nome, double preco, int quantidade, String autor) {
        super(nome, preco, quantidade);
        this.autor = autor;
    }

    @Override
    public double calcularPrecoFinal() {
        double total = super.calcularPrecoFinal();
        return total * 0.9; 
    }
}