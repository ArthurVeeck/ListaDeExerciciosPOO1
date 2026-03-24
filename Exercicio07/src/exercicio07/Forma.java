
package exercicio07;


public class Forma {
    private String nome;
    private String cor;
    private String tipo;

    public Forma(String nome, String cor, String tipo) {
        this.nome = nome;
        this.cor = cor;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getTipo() {
        return tipo;
    }

    public double calcularArea() {
        return 0; 
    }
}