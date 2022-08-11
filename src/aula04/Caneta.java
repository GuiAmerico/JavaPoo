/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author Américo
 */
public class Caneta {
 public String modelo;
 private double ponta;
 private String cor;
 private boolean tampada = false;
 
 public Caneta(String modelo, String cor, double ponta){
     
     this.modelo = modelo;
     this.cor = cor;
     this.ponta = ponta;
     
     tampar();
 
 }
 
 public String getModelo(){
     
     return this.modelo;
     
    }
 
 public void setModelo(String modelo){
     
        this.modelo = modelo;
     
    }
    
 
 public double getPonta(){
     
     return this.ponta;
     
    }
 
 public void setPonta(double ponta){
     
        this.ponta = ponta;
     
    }
 public void tampar(){
     
     tampada = true;
 
 }
  public void destampar(){
     
     tampada = false;
 
 }

 public void status(){
     
     System.out.println("Sobre a caneta:");
     System.out.println("Modelo; " + this.modelo);
     System.out.println("Ponta: " + this.ponta);
     System.out.println("Tampada? " + this.tampada);
 }
    
}
