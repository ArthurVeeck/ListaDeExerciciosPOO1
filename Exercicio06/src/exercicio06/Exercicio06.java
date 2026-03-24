
package exercicio06;


public class Exercicio06 {

    
    public static void main(String[] args) {
        Produto p1 = new Livro("Java Básico", 50, 2, "Autor X");
        Produto p2 = new Eletronico("Celular", 1000, 1, "Samsung");
        Produto p3 = new Roupa("Camiseta", 40, 5);
        Produto p4 = new Alimento("Leite", 6, 3, true);

        System.out.println(p1.getNome() + ": R$ " + p1.calcularPrecoFinal());
        System.out.println(p2.getNome() + ": R$ " + p2.calcularPrecoFinal());
        System.out.println(p3.getNome() + ": R$ " + p3.calcularPrecoFinal());
        System.out.println(p4.getNome() + ": R$ " + p4.calcularPrecoFinal());
    }
}
