
package exercicio18;

import java.util.ArrayList;


public class Exercicio18 {

    
    public static void main(String[] args) {
        ArrayList<Imovel> imoveis = new ArrayList<>();

        imoveis.add(new Casa("Rua maurico cardoso", 300000, 120, 3, true, 50));
        imoveis.add(new Apartamento("Av pereira de vargas", 250000, 80, 5, 500, true));
        imoveis.add(new Terreno("Rua general daltro filho", 150000, 200, "Argiloso", true, false));
        imoveis.add(new SalaComercial("Centro", 400000, 100, "Loja", true, 800));

        for (Imovel i : imoveis) {
            i.exibir();
            System.out.println("");
        }
    }
    
}
