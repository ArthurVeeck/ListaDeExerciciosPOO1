
package exercicio07;


public class Retangulo extends Forma {
    private double largura;
    private double altura;
    private String unidade;

    public Retangulo(String cor, double largura, double altura) {
        super("Retângulo", cor, "2D");
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}