/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author Américo
 */
public class Aula11 {
    public static void main(String[] args) {
        
      Aluno a1 = new Aluno();
      a1.setNome("Trem bala");
      a1.setIdade(21);
      a1.setSexo("M");
      a1.setCurso("Aprendendo a ser cria");
      a1.pagarMensalidade();
      System.out.println(a1.toString());
      
        System.out.println("");
      
      Bolsista a2 = new Bolsista();
      a2.setNome("Malvadão");
      a2.setIdade(19);
      a2.setSexo("M");
      a2.setCurso("Como ficar rico em 2 dias");
      a2.pagarMensalidade();
      System.out.println(a2.toString());
      
              
            
    }
    
}
