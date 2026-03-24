
package exercicio03;


public class Exercicio03 {

    
    public static void main(String[] args) {
        Funcionario objgerenre = new Gerente("Gustavo Melo", 8000, "Administração", 10, "Senior", true);
        Funcionario objvendedor = new Vendedor("Cauani Santos", 3500, "Vendas", 50, 0.10, "Sul");
        Funcionario objprogramador= new Programador("Arthur Veeck", 6000, "TI", "Java", "Pleno", true);
        Funcionario objdesigner = new Designer("Maria Ortiz", 4000, "Marketing", "Figma", "UI/UX", false);
        
        objgerenre.trabalhar();
        objvendedor.trabalhar();
        objprogramador.trabalhar();
        objdesigner.trabalhar();
        
    }
}
