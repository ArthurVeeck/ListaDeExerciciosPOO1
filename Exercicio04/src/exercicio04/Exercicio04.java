
package exercicio04;


public class Exercicio04 {

   
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Arthur", "12345678900", "Rua A");

        ContaBancaria cc = new ContaCorrente(1, "Arthur", 2.0);
        ContaBancaria cp = new ContaPoupanca(2, "Arthur", 0.05);
        ContaBancaria cs = new ContaSalario(3, "Arthur", 2);

        cc.consultarSaldo();
        cp.consultarSaldo();
        cs.consultarSaldo();
    }
}