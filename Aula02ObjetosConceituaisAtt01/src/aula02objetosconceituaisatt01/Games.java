/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02objetosconceituaisatt01;

/**
 *
 * @author rrych
 */
public class Games {
    String game = "";
    int tempo = 0;
    int partida = 0;
    int horaioDeInicio = 0;
    boolean entrarJogo = false;
    boolean modoDeJogoAleatorio = false;
    boolean modoDeJogoComAmigos = false;
    boolean modoDeTreino = false;
    
    void status () {
        System.out.println("Game: " + this.game);
        System.out.println("Jogo iniciados as " + this.horaioDeInicio + "hrs");
        System.out.println("Tempo de jogo: " + this.tempo);
        System.out.println("Total de Partidas: " + this.partida);
        System.out.println("  ");
        System.out.println("  ");
    }
    
    void entrarJogo () {
        if (this.entrarJogo == true) {
            System.out.println("Entrou no Games " + this.game);
        } else {
            System.out.println("Nenhun Jogo Foi Iniciado");
        }
    }
    
    void modoDeJogoAleatorio () {
        
        if (this.modoDeJogoAleatorio == true && this.entrarJogo == true) {
            System.out.println("Modo Aleatorio Inciado");
        }else {
            System.out.println("Modo aleatorio não foi Inciado");
        }
        
    }
    
    void modoDeJogoComAmigos () {
        if (this.modoDeJogoComAmigos == true && this.entrarJogo == true) {
            System.out.println("Equipe amigos Iniciado");
        }else {
            System.out.println("Você Nao tem amigos");
        }
    }
    
    void modoDeTreino () {
        if (this.modoDeTreino == true && this.entrarJogo == true) {
            System.out.println("Modo de Treino Aberto");
        } else {
            System.out.println("Modo não selecionado");
        }
    }
    
    void sairDoJogo () {
        System.out.println("Jogo foi fechado");
    }
}
