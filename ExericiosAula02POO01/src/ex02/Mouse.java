package ex02;

public class Mouse {
    String modelo;
    String formato;
    boolean bluetooth;
    boolean plug;
    int carregado;
    
    void status () {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Formato do Mouse: " + this.formato);
    }
    
    void bateria () {
        if (this.carregado > 0 && this.carregado <= 100) {
            System.out.println("Porcetagem da Bateria: " + this.carregado + "%");
        } else {
            System.out.println("ERRO!, PROCENTAGEM DA BATERIA INVALDA");
        }
    }
    
    void ligado () {
        this.bluetooth = true;
        System.out.println("Mouse Ligado");
    }
    
    void desligado () {
        this.bluetooth = false;
        System.out.println("Mouse Desligado");
    }
    
    void plug () {
        if (this.plug == true) {
            System.out.println("Mouse está conctado em Dispostivo");
        } else {
            System.out.println("Mause não conectado em nehum dispositivo");
        }
        
    }
}
