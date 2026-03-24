
package exercicio02;


public class Bicicleta extends Veiculo{
    private boolean esportivo;

    public Bicicleta(String marca, String modelo, int ano, boolean esportivo) {
        super(marca, modelo, ano);
        this.esportivo = esportivo;
    }
    
    public boolean getEsportivo(){
        return esportivo;
    }
    
    public void setEsportivo(boolean esportivo){
        this.esportivo = esportivo;
    }
    
    @Override
    public void mover(){
        System.out.println("A bicicleta anda!");
    }
}
