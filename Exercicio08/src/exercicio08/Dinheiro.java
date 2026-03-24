
package exercicio08;


public class Dinheiro extends Pagamento {
    private double valorRecebido;
    private double troco;
    private String moeda;

    public Dinheiro(double valor, String data, String descricao,
                    double valorRecebido) {
        super(valor, data, descricao);
        this.valorRecebido = valorRecebido;
    }

    @Override
    public void processarPagamento() {
        troco = valorRecebido - getValor();
        System.out.println("Pagamento em Dinheiro");
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Troco: R$ " + troco);
    }
}