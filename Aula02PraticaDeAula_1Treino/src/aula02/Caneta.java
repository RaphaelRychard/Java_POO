package aula02;

public class Caneta {
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga; 
    private boolean tampar;
    
    public void status () {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + carga);
        System.out.println("Está tampada? " + this.tampar);
    }
    
    public void rabiscar ()  {
        if (this.tampar == true) {
            System.out.println("ERRO!, Nao posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }
                
    }
    
    public void tampar () {
        this.tampar = true;
    }
    
    public void destampar() {
        this.tampar = false;
    }
}
