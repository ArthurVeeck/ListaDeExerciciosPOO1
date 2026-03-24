
package exercicio07;


public class Triangulo extends Forma {
    private double base;
    private double altura;
    private String tipo;

    public Triangulo(String cor, double base, double altura) {
        super("Triângulo", cor, "2D");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}