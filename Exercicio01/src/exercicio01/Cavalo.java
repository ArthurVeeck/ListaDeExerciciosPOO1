
package exercicio01;


public class Cavalo extends Animal{
    private boolean deCorrida;

    public Cavalo(String nome, int idade, double peso, boolean deCorrida) {
        super(nome, idade, peso);
        this.deCorrida = deCorrida;
    }
    
    public boolean getDeCorrida(){
        return deCorrida;
    }
    
    public void setDeCorrida(boolean deCorrida){
        this.deCorrida = deCorrida;
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O cavalo relincha!");
    }
}
