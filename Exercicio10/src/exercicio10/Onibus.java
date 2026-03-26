
package exercicio10;


public class Onibus extends Transporte {

    private int linhas;
    private boolean arCondicionado;
    private double tarifaBase;

    public Onibus(String nome, int capacidade, String empresa, int linhas, boolean arCondicionado, double tarifaBase) {
        super(nome, capacidade, empresa);
        this.linhas = linhas;
        this.arCondicionado = arCondicionado;
        this.tarifaBase = tarifaBase;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public boolean getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    @Override
    public double calcularTarifa() {
        return tarifaBase;
    }
}