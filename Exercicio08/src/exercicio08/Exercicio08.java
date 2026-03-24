
package exercicio08;

import java.util.ArrayList;


public class Exercicio08 {

    
    public static void main(String[] args) {
        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new CartaoCredito(200, "24/03", "Compra loja",
                "1234-5678", "Arthur", "Visa"));

        pagamentos.add(new Pix(150, "24/03", "Transferência",
                "email@email.com", "Banco X"));

        pagamentos.add(new Boleto(300, "24/03", "Conta luz",
                "123456789", "30/03"));

        pagamentos.add(new Dinheiro(50, "24/03", "Compra simples",
                100));
    }
}
