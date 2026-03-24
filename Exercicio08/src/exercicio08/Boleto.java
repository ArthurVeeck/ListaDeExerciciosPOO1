
package exercicio08;


public class Boleto extends Pagamento {
    private String codigoBarras;
    private String dataVencimento;
    private String banco;

    public Boleto(double valor, String data, String descricao,
                  String codigoBarras, String dataVencimento) {
        super(valor, data, descricao);
        this.codigoBarras = codigoBarras;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Boleto");
        System.out.println("Código de barras: " + codigoBarras);
        System.out.println("Valor: R$ " + getValor());
    }
}