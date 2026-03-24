
package exercicio02;


public class Exercicio02 {

    
    public static void main(String[] args) {
        Veiculo objV1 = new Carro("Fiat", "Tempra", 1996, 4);
        Veiculo objV2 = new Moto("Kawasaki", "Ninja", 2023, 300);
        Veiculo objV3 = new Bicicleta("Caloi", "Elite", 2023, true);
        Veiculo objV4 = new Onibus("Caio Induscar", "Apache VIP", 2021, 74);
        
        objV1.mover();
        objV2.mover();
        objV3.mover();
        objV4.mover();
    }
}
