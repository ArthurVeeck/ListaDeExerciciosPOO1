
package exercicio11;


public class Smartphone extends Dispositivo {

    private int armazenamento;
    private int memoriaRAM;
    private boolean rede5g;

    public Smartphone(String marca, String modelo, double consumoEnergia, int armazenamento, int memoriaRAM, boolean rede5g) {
        super(marca, modelo, consumoEnergia);
        this.armazenamento = armazenamento;
        this.memoriaRAM = memoriaRAM;
        this.rede5g = rede5g;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public boolean geRede5g() {
        return rede5g;
    }

    public void setRede5g(boolean rede5g) {
        this.rede5g = rede5g;
    }

    @Override
    public void ligar() {
        System.out.println("O smartphone está ligando");
    }
    
    @Override
    public void desligar(){
        System.out.println("O smartphone está desligando");
    }
    
    @Override
    public void executarFuncao(){
        System.out.println("O smartphone está executando uma função");
}
}