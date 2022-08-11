/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;

/**
 *
 * @author Américo
 */ 
public class Aula09 {
    public static void main(String[] args) {
        Pessoa leitor = new Pessoa("Guilherme", 18, "Masculino");
        leitor.fazerNiver();
        Livro livro = new Livro("Dom quixote","Miguel de Cervantes",1000,leitor);
        System.out.println(livro.detalhes());
        
    }
}
