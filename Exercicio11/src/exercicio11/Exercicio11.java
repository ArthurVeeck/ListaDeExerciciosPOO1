
package exercicio11;


public class Exercicio11 {

    
    public static void main(String[] args) {
        Dispositivo objTe = new Televisao("Samsung", "QLED", 120, 55, "4K", true);
        Dispositivo objC = new Computador("Dell", "Inspiron", 300, "Intel i7", 16, 512);
        Dispositivo objSmartphone = new Smartphone("Apple", "iPhone", 20, 256, 8, true);
        Dispositivo objTa = new Tablet("Samsung", "Galaxy Tab", 40, 11, 128, true);
        

        objTe.ligar();
        objTe.desligar();
        objTe.executarFuncao();
        
        objC.ligar();
        objC.desligar();
        objC.executarFuncao();
        
        objSmartphone.ligar();
        objSmartphone.desligar();
        objSmartphone.executarFuncao();
        
        objTa.ligar();
        objTa.desligar();
        objTa.executarFuncao();
        
        
    }
}
