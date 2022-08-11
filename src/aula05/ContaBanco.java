/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author Américo
 */
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public ContaBanco(){
        
        saldo = 0;
        status = false;
    
    }
    
    public void status(){
    
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Ativo: " + this.isStatus());
    
    }
    
    public void abrirConta(String nome, String tipo){
        this.dono = nome;
        this.tipo = tipo;
        
        
        if(tipo.equalsIgnoreCase("cc")){
            saldo = 50;
        }else if(tipo.equalsIgnoreCase("cp")){
            saldo = 150;
        }
        
        if(status == false){
            
            status = true;
        
        }
    
    }
    public void fecharConta(){
        
        if(status == true && saldo == 0){
            
            status = false;
            System.out.println("CONTA FECHADA COM SUCESSO!");
        
        }else if(saldo < 0){
            System.out.println("CONTA EM DÉBITO");
            }else{
            System.out.println("ERRO! VERIFIQUE SE HÁ SALDO"
                    + " OU A CONTA JA NÃO ESTÁ FECHADA");
        }
    
    }
     
    public void depositar(double valor){
        if(status == true){
        this.saldo += valor;
        }else{
            System.out.println("PRIMEIRO ABRA SUA CONTA!");
        }
    }
    
    public void sacar(double valor){
        if(status == true){
        
            if(valor < saldo){

                this.saldo -= valor;
            }else{
                System.out.println("SALDO INSUFICIETE");
           
        }
       }
    
    }
    
    public void pagarMensalmente(){
        
        if(status == true){
            if(this.tipo.equalsIgnoreCase("cc")){
    
            saldo -= 12;
            }else if(this.tipo.equalsIgnoreCase("cp")){
            saldo -= 20;
            }
        }
        
    
    
    }

    public int getNumConta() {

         return numConta;
    }
    public String getTipo(){
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
    
    
    
}
    
    
    
    
    
    
    
    
    

