
package exercicio08;


public class CartaoCredito extends Pagamento {
    private String numeroCartao;
    private String titular;
    private String bandeira;

    public CartaoCredito(double valor, String data, String descricao,
                         String numeroCartao, String titular, String bandeira) {
        super(valor, data, descricao);
        this.numeroCartao = numeroCartao;
        this.titular = titular;
        this.bandeira = bandeira;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento com Cartão de Crédito");
        System.out.println("Titular: " + titular);
        System.out.println("Valor: R$ " + getValor());
    }
}