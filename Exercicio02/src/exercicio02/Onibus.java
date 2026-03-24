
package exercicio02;


public class Onibus extends Veiculo{
    private int lugares;

    public Onibus(String marca, String modelo, int ano, int lugares) {
        super(marca, modelo, ano);
    }
    
    public int getLugares(){
        return lugares;
    }
    
    public void setLugares(int lugares){
        this.lugares = lugares;
    }
    
    @Override
    public void mover(){
        System.out.println("O onibus acelera!");
    }
}
