
package exercicio01;


public class Vaca extends Animal{
    private boolean leitera;

    public Vaca(String nome, int idade, double peso, boolean leitera) {
        super(nome, idade, peso);
        this.leitera = leitera;
    }
    
    public boolean getLeitera(){
        return leitera;
    }
    
    public void setLeitera(boolean leitera){
        this.leitera = leitera;
    }
    
    @Override
    public void emitirSom(){
        System.out.println("A vaca mugi!");
    }
}
