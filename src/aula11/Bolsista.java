/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author Américo
 */
public class Bolsista extends Aluno{
    private double bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno(a) " + this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagamento ajustado para bolsista realizado com sucesso");
        
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
    

}
