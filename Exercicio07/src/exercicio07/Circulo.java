
package exercicio07;


public class Circulo extends Forma {
    private double raio;
    private double pi;
    private String unidade;

    public Circulo(String cor, double raio) {
        super("Círculo", cor, "2D");
        this.raio = raio;
        this.pi = 3.14;
    }

    @Override
    public double calcularArea() {
        return pi * raio * raio;
    }
}