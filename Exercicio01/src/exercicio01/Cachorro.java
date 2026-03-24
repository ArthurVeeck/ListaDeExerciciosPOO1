
package exercicio01;


public class Cachorro extends Animal{
    private String raca;
    private String porte;

    public Cachorro(String nome, int idade, double peso, String raca, String porte) {
        super(nome, idade, peso);
        this.raca = raca;
        this.porte = porte;
    }
    
    public String getRaca(){
        return raca;
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public String getPorte(){
        return porte;
    }
    
    public void setPorte(String porte){
        this.porte = porte;
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O Cachorro late!");
    }
}
