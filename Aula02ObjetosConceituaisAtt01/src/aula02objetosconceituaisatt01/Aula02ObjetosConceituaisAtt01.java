/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02objetosconceituaisatt01;

/**
 *
 * @author rrych
 */
public class Aula02ObjetosConceituaisAtt01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Games g1 = new Games();
        
        g1.game = "Valorant";
        g1.tempo = 2;
        g1.horaioDeInicio = 14;
        g1.partida = 4;
        g1.entrarJogo = true;
        g1.modoDeJogoComAmigos = false;
        g1.modoDeTreino = false;
        g1.modoDeJogoAleatorio = true;
        
   

        g1.status();
        g1.entrarJogo();
        g1.modoDeJogoAleatorio();
        g1.sairDoJogo();
        
    }
    
}
