
package exercicio01;


public class Exercicio01 {

    
    public static void main(String[] args) {
        Animal objA1 = new Cachorro("Choco", 4, 5, "Shitzu", "Pequeno");
        Animal objA2 = new Gato("Rodolfo", 4, 6, "Preto");
        Animal objA3 = new Vaca("Vaquinha", 7, 500, true);
        Animal objA4 = new Cavalo("Fenix", 6, 200, true);
        
        objA1.emitirSom();
        objA2.emitirSom();
        objA3.emitirSom();
        objA4.emitirSom();
    }
}
