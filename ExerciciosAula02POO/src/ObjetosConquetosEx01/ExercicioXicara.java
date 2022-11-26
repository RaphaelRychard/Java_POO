/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ObjetosConquetosEx01;

/**
 *
 * @author rrych
 */
public class ExercicioXicara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Xicara x1 = new Xicara();
        
        x1.cor = "Azul";
        x1.formato = "Cilindro";
        x1.limpa = true;
        x1.agua = true;
        x1.lavar();
        x1.agua();
    }
    
}
