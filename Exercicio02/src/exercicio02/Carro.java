
package exercicio02;


public class Carro extends Veiculo{
    private int rodas;

    public Carro(String marca, String modelo, int ano, int rodas) {
        super(marca, modelo, ano);
        this.rodas = rodas;
    }
    
    public int getRodas(){
        return rodas;
    }
    
    public void setRodas(int rodas){
        this.rodas = rodas;
    }
    
    @Override
    public void mover(){
        System.out.println("O carro acelera!");
    }
}
