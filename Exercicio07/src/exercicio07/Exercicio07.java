
package exercicio07;

import java.util.ArrayList;


public class Exercicio07 {

    
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Quadrado("Azul", 4));
        formas.add(new Retangulo("Vermelho", 5, 3));
        formas.add(new Circulo("Verde", 2.5));
        formas.add(new Triangulo("Amarelo", 6, 2));
    }
}
