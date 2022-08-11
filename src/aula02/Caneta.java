/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author Américo
 */
public class Caneta {
 String cor;
 String modelo;
 double ponta;
 int carga;
 boolean tampada;
 
 void status(){
    System.out.println("Uma caneta: " + this.modelo);
     System.out.println("Uma caneta: " + this.cor);
     System.out.println("Uma caneta com ponta: " + this.ponta);
     System.out.println("Uma caneta tampada? " + this.tampada);
     System.out.println("Quantidade de carga " + this.carga + "%");
   }
 
 void rabiscar(){
  if(tampada){
      System.out.println("ERRO!");
        }else{
      System.out.println("Rabisco");
  }
 
  }
 
 void tampar(){
     tampada = true;
 
 
  }
  
 void destampar(){
     tampada = false;
 
 
  }
}
