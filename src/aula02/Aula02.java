/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02;

/**
 *
 * @author Américo
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.tampada = false;
        c1.modelo = "Bic";
        c1.carga = 85;
        
        c1.status();
        
        Caneta c2 = new Caneta();
        c2.cor = "Vermelha";
        c2.ponta = 0.7;
        c2.tampada = true;
        c2.modelo = "Bic";
        c2.carga = 88;
        
        c2.status();
        
    }
    
}
