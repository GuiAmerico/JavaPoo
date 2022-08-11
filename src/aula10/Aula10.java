/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author Américo
 */
public class Aula10
{       
    public static void main(String[] args) {
        
    
 
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Gui");
        p2.setNome("Pedro");
        p3.setNome("Maria");
        p4.setNome("Fabiana");
        
        p1.setIdade(18);
        p2.setIdade(28);
        p3.setIdade(25);
        p4.setIdade(61);
        
        p1.setSexo("M");
        p2.setSexo("M");
        p3.setSexo("F");
        p4.setSexo("F");
        
        p2.setCurso("Java OO");
        p2.setMatricula(12345678);
        
        p3.setEspecialidade("Programação");
        p3.setSalario(2578.99);
        
        p4.setSetor("RH");
        p4.setTrabalhando(true);
        
        //p1.setCurso();
        //p3.cancelMatricula();
        //p4.setReceberAumento();
        
        
        
        
        
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        
        
        
        
        
    
    
    
    
    }
    
}
