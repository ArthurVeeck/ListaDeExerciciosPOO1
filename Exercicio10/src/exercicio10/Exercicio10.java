
package exercicio10;


public class Exercicio10 {

    
    public static void main(String[] args) {
        Transporte objO = new Onibus("Ônibus Urbano", 50, "Empresa A", 10, true, 4.50);
        Transporte objM = new Metro("Metrô Central", 200, "Empresa B", 15, 5.00, true);
        Transporte objU = new Uber("UberX", 4, "Uber", 2.0, 10, "Econômico");
        Transporte objTaxi = new Taxi("Táxi Comum", 4, "Cooperativa", 5.0, 2.5, 10);

        System.out.println("Tarifa ônibus: " + objO.calcularTarifa());
        System.out.println("Tarifa metrô: " + objM.calcularTarifa());
        System.out.println("Tarifa Uber: " + objU.calcularTarifa());
        System.out.println("Tarifa Taxi: " + objTaxi.calcularTarifa());

    }
}
