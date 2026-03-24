
package exercicio04;


public class ContaSalario extends ContaBancaria {
    private int limiteSaques;
    private int saquesRealizados;

    public ContaSalario(int numero, String titular, int limiteSaques) {
        super(numero, titular);
        this.limiteSaques = limiteSaques;
        this.saquesRealizados = 0;
    }
    
    public int getLimiteSaques(){
        return limiteSaques;
    }
    
    public void setLimiteSaques(int limiteSaques){
        this.limiteSaques = limiteSaques;
    }

    @Override
    public void sacar(double valor) {
        if (saquesRealizados < limiteSaques) {
            super.sacar(valor);
            saquesRealizados++;
        } else {
            System.out.println("Limite de saques atingido.");
        }
    }
}