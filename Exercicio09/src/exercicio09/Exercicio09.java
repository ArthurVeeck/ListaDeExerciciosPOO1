
package exercicio09;


public class Exercicio09 {

    
    public static void main(String[] args) {
        Personagem objG = new Guerreiro("Henrique", 10, 120, 30, "Espada", 20);
        Personagem objM = new Mago("Maria", 12, 80, 100, "Fogo", 40);
        Personagem objA = new Arqueiro("joão", 11, 90, 35, "Arco", 50);
        Personagem objP = new Paladino("Arthur", 13, 130, 60, 35, true);

        objG.atacar();
        objG.defender();
        
        objM.atacar();
        objM.defender();
        
        objA.atacar();
        objA.defender();
        
        objP.atacar();
        objP.defender();
        
        
    }
}