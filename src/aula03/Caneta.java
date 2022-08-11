/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

/**
 *
 * @author Américo
 */
public class Caneta {
 public String cor;
 public String modelo;
 private double ponta;
 protected int carga;
 protected boolean tampada;
 
 public void status(){
    System.out.println("Uma caneta: " + this.modelo);
     System.out.println("Uma caneta: " + this.cor);
     System.out.println("Uma caneta com ponta: " + this.ponta);
     System.out.println("Uma caneta tampada? " + this.tampada);
     System.out.println("Quantidade de carga " + this.carga + "%");
   }
 
 private void rabiscar(){
  if(tampada){
      System.out.println("ERRO!");
        }else{
      System.out.println("Rabisco");
  }
 
  }
 
 protected void tampar(){
     tampada = true;
 
 
  }
  
 protected void destampar(){
     tampada = false;
 
 
  }
}
