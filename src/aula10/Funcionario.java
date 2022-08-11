/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author Américo
 */
public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(String trabAtual){
        if(this.getTrabalhando() == true){
            this.setSetor(trabAtual);
            System.out.println("Novo cargo: " + trabAtual);
        }else{
            this.setSetor(trabAtual);
            System.out.println("Sorria sua era de desempregado chegou ao fim: "
                     + trabAtual);
            
        }
    
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    

}
