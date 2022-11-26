/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjetosConquetosEx01;

/**
 *
 * @author rrych
 */
public class Xicara {
    
    String cor = "";
    String formato = "";
    String material = "";
    boolean limpa = false;
    boolean agua = false;
    float tamanho = 0f;
    
    void vazio () {
        
    }
    
    void lavar () {
        if (this.limpa == true) {
            System.out.println("Xicara limpa");
        } else {
            System.out.println("Xicara suja");
        }
    }  
    
    void café () {
        if (this.limpa == true) {
            System.out.println("Coloando CAFÉ");
            
        } else {
            System.out.println("Vai lavar a xicara antes");
        }
    }
    
    void agua () {
        if (this.agua == true) {
            System.out.println("COLOCANDO AGUA NO COPO");
        } else {
            System.out.println("COPO SEM AGUA");
        }
    }
    
    
}
