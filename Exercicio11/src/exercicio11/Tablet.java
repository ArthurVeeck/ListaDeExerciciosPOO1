
package exercicio11;


public class Tablet extends Dispositivo {

    private int tamanhoTela;
    private int armazenamento;
    private boolean canetaDigital;

    public Tablet(String marca, String modelo, double consumoEnergia, int tamanhoTela, int armazenamento, boolean canetaDigital) {
        super(marca, modelo, consumoEnergia);
        this.tamanhoTela = tamanhoTela;
        this.armazenamento = armazenamento;
        this.canetaDigital = canetaDigital;
    }

    public int getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public boolean getCanetaDigital() {
        return canetaDigital;
    }

    public void setCanetaDigital(boolean canetaDigital) {
        this.canetaDigital = canetaDigital;
    }

    @Override
    public void ligar() {
        System.out.println("O tablet está ligando");
    }
    
    @Override
    public void desligar(){
        System.out.println("O tablet está desligando");
    }
    
    @Override
    public void executarFuncao(){
        System.out.println("O tablet está executando uma função");
}
}