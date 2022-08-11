/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author Américo
 */
public class Aula07 {
    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[6];
        lutador[0] = new Lutador("Gui Marreta", "BR", 18, 1.70, 80.3, 12, 3, 2);
        //lutador[0].apresentar();
        
        //System.out.println();
        
        lutador[1] = new Lutador("Thomas Shelby","EN", 28, 1.81, 63.9, 20, 0, 0);
        //lutador[1].apresentar();
        
        //System.out.println();
        
        lutador[2] = new Lutador("Macaco Loko", "ES", 21, 1.98, 82.3, 11, 1, 2);
        //lutador[2].apresentar();
  
        //System.out.println();
        
        lutador[3] = new Lutador("Olhou Sorriu", "FR", 24, 1.78, 62.2, 14,3, 3);
        //lutador[3].apresentar();
        
        Luta luta = new Luta();
        luta.marcarLuta(lutador[0], lutador[2]);
        luta.Lutar();
    
    }
    
    
    } 
