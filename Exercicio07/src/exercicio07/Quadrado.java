
package exercicio07;



public class Quadrado extends Forma {
    private double lado;
    private String unidade;
    private boolean preenchido;

    public Quadrado(String cor, double lado) {
        super("Quadrado", cor, "2D");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}