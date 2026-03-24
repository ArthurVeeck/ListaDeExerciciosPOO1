
package exercicio08;


public class Pix extends Pagamento {
    private String chavePix;
    private String banco;
    private String tipoChave;

    public Pix(double valor, String data, String descricao,
               String chavePix, String banco) {
        super(valor, data, descricao);
        this.chavePix = chavePix;
        this.banco = banco;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via PIX");
        System.out.println("Chave: " + chavePix);
        System.out.println("Valor: R$ " + getValor());
    }
}