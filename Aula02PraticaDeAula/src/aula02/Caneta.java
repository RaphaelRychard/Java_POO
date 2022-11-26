package aula02;

public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga; 
    boolean tampar;
    
    void status () {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + carga);
        System.out.println("Está tampada? " + this.tampar);
    }
    
    void rabiscar ()  {
        if (this.tampar == true) {
            System.out.println("ERRO!, Nao posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }
                
    }
    
    void tampar () {
        this.tampar = true;
    }
    
    void destampar() {
        this.tampar = false;
    }
}
