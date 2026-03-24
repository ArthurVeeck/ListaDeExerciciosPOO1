
package exercicio01;


public class Gato extends Animal{
    private String cor;

    public Gato(String nome, int idade, double peso, String cor) {
        super(nome, idade, peso);
        this.cor = cor;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O gato mia!");
    }
}
