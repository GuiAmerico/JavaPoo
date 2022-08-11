/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;

/**
 *
 * @author Américo
 */
public class Aula13 {
    public static void main(String[] args) {
        
        Cachorro c = new Cachorro();
        c.reagir("olá");
        c.reagir("Vai apanhar");
        
        System.out.println("");
        c.reagir(11, 45);
        c.reagir(22, 00);
        
        System.out.println("");
        c.reagir(2, 12.5);
        c.reagir(17, 4.5);
        
        System.out.println("");
        c.reagir(true);
        c.reagir(false);
    }
    
}
